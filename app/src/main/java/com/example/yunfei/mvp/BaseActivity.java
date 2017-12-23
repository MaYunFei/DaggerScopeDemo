package com.example.yunfei.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.yunfei.App;
import com.example.yunfei.dagger.components.AppComponent;

/**
 * Created by yunfei on 2017/12/18.
 */

public class BaseActivity extends AppCompatActivity {

    public AppComponent getAppComponent() {
        return ((App) getApplication()).getAppComponent();
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

}
