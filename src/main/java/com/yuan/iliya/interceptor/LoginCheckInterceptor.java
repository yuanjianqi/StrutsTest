package com.yuan.iliya.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

/**
 * All Rights Reserved, Designed By Iliya Kaslana
 *
 * @author Iliya Kaslana
 * @version 1.0
 * @date 2018/6/17 14:37
 * @copyright ©2018
 */
public class LoginCheckInterceptor extends AbstractInterceptor {
    private static final Logger LOG = LogManager.getLogger(LoginCheckInterceptor.class);

    private String sessionAttribute;
    private String reloginResult;

    public String getSessionAttribute() {
        return sessionAttribute;
    }

    public void setSessionAttribute(String sessionAttribute) {
        this.sessionAttribute = sessionAttribute;
    }

    public String getReloginResult() {
        return reloginResult;
    }

    public void setReloginResult(String reloginResult) {
        this.reloginResult = reloginResult;
    }

    public String intercept(ActionInvocation invocation) throws Exception {
        if (invocation.getProxy().getMethod().equals("login")){
            String result = invocation.invoke();
            return result;
        }
        Map<String, Object> sessionMap = invocation.getInvocationContext().getSession();
        //判断session中是否有相应的attribute
        if (sessionMap.containsKey(sessionAttribute)){
            String result = invocation.invoke();
            return result;

        }else {
            return reloginResult;
        }

    }
}
