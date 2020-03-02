package com.hacknife.study.ui.base;

import android.app.Application;
import android.content.Context;

/**
 * author : 段泽全(hacknife)
 * e-mail : hacknife@outlook.com
 * time   : 2019/8/5
 * desc   : DataBinding
 * version: 1.0
 */
public interface IBaseView {

    Application application();

    Context applicationContext();

    Context context();

}
