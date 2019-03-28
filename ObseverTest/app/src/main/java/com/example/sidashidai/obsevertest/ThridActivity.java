package com.example.sidashidai.obsevertest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class ThridActivity extends AppCompatActivity {

    //回调给MainActivity
    private CallBackListener mListener;
    //回调给SecondActivity
    private CallBackListener mListener2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thrid);
        ButterKnife.bind(this);
    }

    //点击改变MainActivity、SecondActivity title
    @OnClick(R.id.button) void changeTitle(){
        ConcreteObservable.getInstance().notifyObserver("Obsever success");
        if (mListener != null)
            mListener.onCallBack("call back success");
    }

    //回调 - MainActivity需要持有thridActivity的实例对象
    //作用同addObsever!!!!!! --相当于抽离出来一个管理类，用于维护所有的listener也就是观察者
    //订阅subscribe!!!
    public void setmListener(CallBackListener listener){
        mListener = listener;
    }
}
