package com.example.devivitria;

import android.app.Application;
import org.acra.ACRA;
import org.acra.annotation.ReportsCrashes;


@ReportsCrashes(
        mailTo = ""
)

public class MyApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        ACRA.init(this);
    }
}
