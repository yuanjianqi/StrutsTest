package com.yuan.iliya.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.Result;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.dispatcher.HttpParameters;
import org.apache.struts2.result.ServletDispatcherResult;

import java.util.Map;

/**
 * All Rights Reserved, Designed By Iliya Kaslana
 *
 * @author Iliya Kaslana
 * @version 1.0
 * @date 2018/6/17 13:53
 * @copyright ©2018
 */
public class LoggerInterceptor extends AbstractInterceptor {
    private static final Logger LOG = LogManager.getLogger(LoggerInterceptor.class);
    public String intercept(ActionInvocation invocation) throws Exception {
        LOG.info("begin-----------------------------");
        //得到运行的action对象，打印类名
        LOG.info("Action: " + invocation.getAction().getClass().getName());
        LOG.info("Method: " + invocation.getProxy().getMethod());
        HttpParameters params = invocation.getInvocationContext().getParameters();

        for (String key:params.keySet()){
            Object obj = params.get(key);

            if (obj instanceof String[]){
                String[] arr = (String[])obj;
                LOG.info("Params: " + key);
                StringBuilder message = new StringBuilder();
                for (String value:arr){
                    message.append(value + " ");
                }
                LOG.info(message.toString());
            }

        }

        String result = invocation.invoke();
        Result result1 = invocation.getResult();
        if (result1 instanceof ServletDispatcherResult){
            ServletDispatcherResult result2 = (ServletDispatcherResult)result1;
            LOG.info("JSP: " + result2.getLastFinalLocation());
        }


        LOG.info("end-----------------------------");
        return result;
    }
}
