package com.example.sidashidai.obsevertest;

/**
 * Created by zhangyong on 2019/1/6.
 */

/**
 * 观察者抽象接口
 */

public interface ObseverInterface {

    //接收被观察者通知
    public void onChange(String text);
}
