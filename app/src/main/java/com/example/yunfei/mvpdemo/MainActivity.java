package com.example.yunfei.mvpdemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.yunfei.GlobalVariable;
import com.example.yunfei.dagger.components.DaggerActivityComponent;
import com.example.yunfei.mvp.BaseActivity;
import com.example.yunfei.mvpdemo.login.LoginActivity;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    @Inject
    GlobalVariable globalVariable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerActivityComponent.builder().appComponent(getAppComponent()).build().inject(this);

        setContentView(R.layout.activity_main);
        Toast.makeText(this, "globalVariable = " + globalVariable.getCount(), Toast.LENGTH_SHORT).show();
        globalVariable.setCount(1);
        Toast.makeText(this, "globalVariable = " + globalVariable.getCount(), Toast.LENGTH_SHORT).show();

    }

    public void goToLogin(View view) {
        startActivity(new Intent(this, LoginActivity.class));
    }
}
