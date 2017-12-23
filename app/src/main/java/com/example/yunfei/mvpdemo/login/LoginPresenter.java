package com.example.yunfei.mvpdemo.login;

import com.example.yunfei.GlobalVariable;
import com.example.yunfei.mvp.BasePresenter;

import javax.inject.Inject;

/**
 * Created by yunfei on 2017/12/20.
 */

public class LoginPresenter extends BasePresenter<LoginContract.View> implements LoginContract.Presenter {

    private final GlobalVariable globalVar;

    @Inject
    public LoginPresenter(GlobalVariable variable) {
        this.globalVar = variable;
    }

    @Override
    public void login(String userName, String passWord) {

        mView.success();
    }
}
