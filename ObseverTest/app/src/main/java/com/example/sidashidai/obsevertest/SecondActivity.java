package com.example.sidashidai.obsevertest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SecondActivity extends AppCompatActivity implements ObseverInterface{

    @BindView(R.id.second_title)
    TextView secondTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ButterKnife.bind(this);
        ConcreteObservable.getInstance().addObsever(this);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            Intent intent = new Intent(this, ThridActivity.class);
            startActivity(intent);
        }
        return super.onTouchEvent(event);
    }

    @Override
    public void onChange(String text) {
        secondTitle.setText(text);
    }
}
