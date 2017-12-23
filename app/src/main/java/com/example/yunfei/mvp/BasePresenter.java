package com.example.yunfei.mvp;

/**
 * Created by yunfei on 2017/12/20.
 */

public class BasePresenter<View extends MvpView> implements MvpPresenter<View> {

    protected View mView;

    @Override
    public void onAttachView(View view) {
        mView = view;
    }

    @Override
    public void onDestroy() {
        mView = null;
    }
}
