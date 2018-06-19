package com.yuan.iliya.helloworld;

import com.opensymphony.xwork2.ActionContext;
import com.yuan.iliya.preresult.MyPreResult;

/**
 * All Rights Reserved, Designed By Iliya Kaslana
 *
 * @author Iliya Kaslana
 * @version 1.0
 * @date 2018/6/14 16:21
 * @copyright ©2018
 */
public class HelloworldAction {
    public static String staticTest = "test";
    private String name;
    private String password;

    public String login(){

//       if ("tom".equals(name) && "111".equals(password)){
//           ActionContext.getContext().getSession().put("login_user", "tom");
//       }
        //注册监听器
        ActionContext actionContext = ActionContext.getContext();
        actionContext.getSession().put("account","12123123");
        actionContext.getApplication().put("money", "有钱");
//        MyPreResult result = new MyPreResult();
//        actionContext.getActionInvocation().addPreResultListener(result);

        return "login";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
