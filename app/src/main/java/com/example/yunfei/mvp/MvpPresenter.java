package com.example.yunfei.mvp;

/**
 * Created by yunfei on 2017/12/17.
 */

public interface MvpPresenter<View extends MvpView> {
    void onAttachView(View view);

    void onDestroy();
}
