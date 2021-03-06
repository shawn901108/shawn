package com.shawn.googlemarket.global;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

/**
 * Created by shawn on 2016/5/13.
 */
public class GoogleMarketApplication extends Application{

    private static Context context;
    private static Handler handler;
    private static int mainThreadId;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        handler = new Handler();
        mainThreadId = android.os.Process.myTid();
    }

    public static Context getContext() {
        return context;
    }

    public static Handler getHandler() {
        return handler;
    }

    public static int getMainThreadId() {
        return mainThreadId;
    }
}
