package com.sukerin.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Dr33 on 2019/11/5.
 */
public class DynamicAop {

    public static void main(String[] args) {
        IAOP iaop=new AopImpl();
        InvocationHandler handler= new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("start2");
                Object re =method.invoke(iaop, args);
                System.out.println("end2");
                //112
                return re;
            }
        };

        IAOP proxyInstance= (IAOP) Proxy.newProxyInstance(DynamicAop.class.getClassLoader(),iaop.getClass().getInterfaces(),handler);
        proxyInstance.exampleAop("321");
    }

}
