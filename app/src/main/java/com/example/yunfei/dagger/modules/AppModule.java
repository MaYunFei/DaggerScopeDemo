package com.example.yunfei.dagger.modules;

import android.content.Context;

import com.example.yunfei.GlobalVariable;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by yunfei on 2017/12/18.
 */

@Module()
public class AppModule {
    Context context;

    public AppModule(Context context) {
        this.context = context;
    }

    @Provides
    public Context provideContext(){
        return context;
    }

    @Provides
    public GlobalVariable provideGlobalVariable(){
        return new GlobalVariable();

    }
}
