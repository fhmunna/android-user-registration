package com.example.back4app.userregistrationexample;

import android.app.Application;
import android.content.Context;

public class App extends Application {

    private static Context sContext;

    public static Context getContext() {
        return sContext;
    }

    @Override
    public void onCreate() {
        super.onCreate();
/*
        sContext = getApplicationContext();
        SharedPref.init(sContext);
*/

 /*       releaseLoader(sContext);
        debugLoader(sContext);*/
    }


}
