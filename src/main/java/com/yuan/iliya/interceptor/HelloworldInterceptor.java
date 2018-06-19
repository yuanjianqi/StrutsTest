package com.yuan.iliya.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * All Rights Reserved, Designed By Iliya Kaslana
 *
 * @author Iliya Kaslana
 * @version 1.0
 * @date 2018/6/17 12:59
 * @copyright ©2018
 */
public class HelloworldInterceptor implements Interceptor {
    private String dbOrFile;

    public String getDbOrFile() {
        return dbOrFile;
    }

    public void setDbOrFile(String dbOrFile) {
        this.dbOrFile = dbOrFile;
    }

    public void destroy() {
        System.out.println("destroy");

    }

    public void init() {
        System.out.println("init");

    }

    public String intercept(ActionInvocation invocation) throws Exception {
        System.out.println("接到dbOrFile的参数" + this.dbOrFile);

        if ("db".equals(dbOrFile)){
            System.out.println("记录日志到数据库");
        }

        if ("file".equals(dbOrFile)){
            System.out.println("记录日志到文件");
        }

        System.out.println("在action执行之前");
        String result = invocation.invoke();
        System.out.println("在action执行之后");
        return result;
    }
}
