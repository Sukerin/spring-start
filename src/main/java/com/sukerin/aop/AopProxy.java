package com.sukerin.aop;

/**
 * Created by Dr33 on 2019/11/5.
 */
public class AopProxy implements IAOP {

    private IAOP iaop;

    public AopProxy(IAOP iaop){
        this.iaop=iaop;
    }

    @Override
    public void exampleAop(String content) {
        System.out.println("start");
        iaop.exampleAop(content);
        System.out.println("end");
    }

    public static void main(String[] args) {
        IAOP iaop=new AopProxy(new AopImpl());
        iaop.exampleAop("xixi");
    }


}
