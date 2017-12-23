package com.example.yunfei.mvpdemo.login;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.example.yunfei.dagger.components.DaggerActivityComponent;
import com.example.yunfei.mvp.BaseMvpActivity;
import com.example.yunfei.mvpdemo.R;

public class LoginActivity extends BaseMvpActivity<LoginContract.View, LoginPresenter> implements LoginContract.View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        DaggerActivityComponent.builder().appComponent(getAppComponent()).build().inject(this);

        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mPresenter.onAttachView(this);
        mPresenter.login("", "");

    }

    @Override
    public void success() {
        Toast.makeText(this, "success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void fail() {
        Toast.makeText(this, "fail", Toast.LENGTH_SHORT).show();

    }
}
