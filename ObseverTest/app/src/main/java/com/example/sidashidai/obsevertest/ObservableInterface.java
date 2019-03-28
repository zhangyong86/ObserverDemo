package com.example.sidashidai.obsevertest;

/**
 * Created by zhangyong on 2019/1/6.
 */

/**
 * 被观察者抽象接口
 * 里面保存了所有的观察者对象引用列表，提供了注册和反注册的功能。
 */

public interface ObservableInterface {

    //添加观察者
    public void addObsever(ObseverInterface obseverInterface);

    //移除观察者
    public void removeObsever(ObseverInterface obseverInterface);

    //通知观察者
    public void notifyObserver(String title);

}
