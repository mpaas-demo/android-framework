package com.mpaas.demo.launcher;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;

import com.alipay.mobile.framework.LauncherActivityAgent;

import java.util.concurrent.TimeUnit;

public class MockLauncherActivityAgent extends LauncherActivityAgent {
    @Override
    public void preInit(Activity activity) {
        super.preInit(activity);
    }

    @Override
    public void postInit(final Activity activity) {
        super.postInit(activity);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                Intent intent = new Intent(activity, MainActivity.class);
                activity.startActivity(intent);
                activity.finish();
            }
        }, TimeUnit.SECONDS.toMillis(1));
    }

}
