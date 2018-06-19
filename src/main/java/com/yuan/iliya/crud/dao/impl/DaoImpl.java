package com.yuan.iliya.crud.dao.impl;

import com.yuan.iliya.crud.dao.Dao;
import com.yuan.iliya.crud.entity.Customer;
import com.yuan.iliya.crud.utils.JDBCUtils;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * All Rights Reserved, Designed By Iliya Kaslana
 *
 * @author Iliya Kaslana
 * @version 1.0
 * @date 2018/6/15 19:21
 * @copyright ©2018
 */
public class DaoImpl implements Dao {
    public void save(Customer customer) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBCUtils.getConnection();
            String sql = "insert into t_customer(age,email,name) values(?,?,?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1,customer.getAge());
            preparedStatement.setObject(2,customer.getEmail());
            preparedStatement.setObject(3,customer.getName());
            preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtils.close(connection,preparedStatement);
        }
    }

    public void update(Customer customer) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBCUtils.getConnection();
            String sql = "update  t_customer set age = ?, email = ?, name = ? where id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setObject(1,customer.getAge());
            preparedStatement.setObject(2,customer.getEmail());
            preparedStatement.setObject(3,customer.getName());
            preparedStatement.setObject(4,customer.getId());
            preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtils.close(connection,preparedStatement);
        }

    }

    public void delete(Serializable id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBCUtils.getConnection();
            String sql = "delete  from t_customer where id = ?";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setObject(1,id);
            preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtils.close(connection,preparedStatement);
        }

    }

    public Customer getCustomer(Serializable id) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        Customer customer = null;
        try {
            connection = JDBCUtils.getConnection();
            String sql = "select * from t_customer where id = ?";
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setObject(1,id);
            resultSet = preparedStatement.executeQuery();
            customer = new Customer();
            if (resultSet.next()){
                customer.setId(resultSet.getInt(1));
                customer.setAge(resultSet.getInt(2));
                customer.setEmail(resultSet.getString(3));
                customer.setName(resultSet.getString(4));

            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtils.close(connection,preparedStatement);
        }

        return customer;
    }

    public List<Customer> getCustomerForList() {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Customer> customers = new ArrayList<Customer>();
        try {
            connection = JDBCUtils.getConnection();
            String sql = "select * from t_customer";
            preparedStatement = connection.prepareStatement(sql);


            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()){
                Customer customer = new Customer();
                customer.setId(resultSet.getInt(1));
                customer.setAge(resultSet.getInt(2));
                customer.setEmail(resultSet.getString(3));
                customer.setName(resultSet.getString(4));
                customers.add(customer);

            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            JDBCUtils.close(connection,preparedStatement);
        }

        return customers;
    }
}
