package com.example.sidashidai.obsevertest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 观察者模式demo(理解-->回调的抽离写法，不依赖实例对象，维护Manager类--ConcreteObservable)
 * onClcik也是观察者模式!!!
 * Android常用：广播BroadCast、EventBus、ListView？
 * Android回调只能实现1对1的实现效果(回调callback需要拥有实例对象)
 *
 * MainActivity、SecondActivity属于观察者，ThridActivity属于被观察者
 */

public class MainActivity extends AppCompatActivity implements ObseverInterface, CallBackListener{

    @BindView(R.id.main_title)
    TextView mainTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        ConcreteObservable.getInstance().addObsever(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onTouchEvent(event);
    }

    @Override
    public void onChange(String text) {
        mainTitle.setText(text);
    }

    //实现回调接口
    @Override
    public void onCallBack(String text) {

    }
}
