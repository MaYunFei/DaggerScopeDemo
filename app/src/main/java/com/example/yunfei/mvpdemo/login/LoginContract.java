package com.example.yunfei.mvpdemo.login;

import com.example.yunfei.mvp.MvpPresenter;
import com.example.yunfei.mvp.MvpView;

/**
 * Created by yunfei on 2017/12/18.
 */

public interface LoginContract {
    public interface View extends MvpView{
        void success();
        void fail();
    }

    public interface Presenter extends MvpPresenter<View>{

        void login(String userName, String passWord);

    }
}
