package com.dji.importsdkdemo;

import android.app.Application;
import android.content.Context;

import androidx.multidex.MultiDex;

import com.secneo.sdk.Helper;

public class MApplication extends Application {

    @Override
    protected void attachBaseContext(Context paramContext) {
        super.attachBaseContext(paramContext);
        Helper.install(MApplication.this);
        MultiDex.install(this);
    }

}

