package com.example.yunfei.dagger.components;

import android.content.Context;

import com.example.yunfei.GlobalVariable;
import com.example.yunfei.dagger.modules.AppModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by yunfei on 2017/12/18.
 */
@Component(modules = {AppModule.class})
public interface AppComponent {
    Context getContext();
    GlobalVariable getGlobalVariable();

}
