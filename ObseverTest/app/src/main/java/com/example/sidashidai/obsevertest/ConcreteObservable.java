package com.example.sidashidai.obsevertest;

/**
 * Created by zhangyong on 2019/1/6.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者具体实现类
 */

public class ConcreteObservable implements ObservableInterface {

    public List<ObseverInterface> list = new ArrayList<>();

    private static ConcreteObservable observable;

    public static ConcreteObservable getInstance(){
        if (observable == null){
            observable = new ConcreteObservable();
        }
        return observable;
    }

    @Override
    public void addObsever(ObseverInterface obseverInterface) {
        if (list.contains(obseverInterface)){
            return;
        }
        list.add(obseverInterface);
    }

    @Override
    public void removeObsever(ObseverInterface obseverInterface) {
        if (list.contains(obseverInterface)){
            return;
        }
        list.remove(obseverInterface);
    }

    @Override
    public void notifyObserver(String title) {
        if (list.size() == 0){
            return;
        }
        for (int i = 0; i < list.size(); i++){
            list.get(i).onChange(title);
        }
    }
}
