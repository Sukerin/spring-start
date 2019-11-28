package com.sukerin.aop;

/**
 * Created by Dr33 on 2019/11/5.
 */
public class AopImpl implements IAOP {
    @Override
    public void exampleAop(String content) {
        System.out.println(content);
    }
}
