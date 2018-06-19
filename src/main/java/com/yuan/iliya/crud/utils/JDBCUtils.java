package com.yuan.iliya.crud.utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * All Rights Reserved, Designed By Iliya Kaslana
 *
 * @author Iliya Kaslana
 * @version 1.0
 * @date 2018/6/15 17:32
 * @copyright ©2018
 */
public class JDBCUtils {
    private static String driverClass;
    private static String url;
    private static String username;
    private static String password;

    static {
        Properties properties = new Properties();
        InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("db.properties");
        try {
            properties.load(inputStream);
            driverClass = properties.getProperty("driverClass");
            url = properties.getProperty("jdbcUrl");
            username = properties.getProperty("user");
            password = properties.getProperty("password");
            Class.forName(driverClass);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() throws SQLException {

        return DriverManager.getConnection(url,username,password);
    }

    public static void close(Connection connection){
        if (connection != null){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void close(Statement statement){
        if (statement != null){
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void close(ResultSet resultSet){
        if (resultSet != null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void close(Connection connection,Statement statement){
        close(connection);
        close(statement);

    }
    public static void close(Connection connection,Statement statement,ResultSet resultSet){
        close(connection);
        close(statement);
        close(resultSet);
    }

}
