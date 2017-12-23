package com.example.yunfei.dagger.components;

import com.example.yunfei.dagger.scopes.PerActivity;
import com.example.yunfei.mvpdemo.MainActivity;
import com.example.yunfei.mvpdemo.login.LoginActivity;

import dagger.Component;

/**
 * Created by yunfei on 2017/12/20.
 */

@Component(dependencies = AppComponent.class)
public interface ActivityComponent {
    void inject(LoginActivity activity);

    void inject(MainActivity activity);
}
