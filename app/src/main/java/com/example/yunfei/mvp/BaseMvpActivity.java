package com.example.yunfei.mvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.view.menu.MenuView;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

/**
 * Created by yunfei on 2017/12/20.
 */

public  class BaseMvpActivity<V extends MvpView,P extends MvpPresenter<V>> extends BaseActivity  {

    @Inject
    protected P mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

}
