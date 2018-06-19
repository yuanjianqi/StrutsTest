package com.yuan.iliya.preresult;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.PreResultListener;

/**
 * All Rights Reserved, Designed By Iliya Kaslana
 *
 * @author Iliya Kaslana
 * @version 1.0
 * @date 2018/6/17 17:04
 * @copyright ©2018
 */
public class MyPreResult implements PreResultListener {
    public void beforeResult(ActionInvocation invocation, String resultCode) {
        System.out.println("现在正在处理result执行前的功能，result = " + resultCode);
        invocation.getInvocationContext().getValueStack().setValue("name","tom");
    }
}
