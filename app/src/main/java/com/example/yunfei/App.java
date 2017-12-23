package com.example.yunfei;

import android.app.Application;

import com.example.yunfei.dagger.components.AppComponent;
import com.example.yunfei.dagger.components.DaggerAppComponent;
import com.example.yunfei.dagger.modules.AppModule;

/**
 * Created by yunfei on 2017/12/18.
 */

public class App extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
