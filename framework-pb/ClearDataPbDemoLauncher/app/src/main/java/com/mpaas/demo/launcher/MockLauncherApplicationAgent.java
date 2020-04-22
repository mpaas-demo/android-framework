package com.mpaas.demo.launcher;

import android.app.Application;

import com.alipay.mobile.framework.LauncherApplicationAgent;

/**
 * Created by seker on 16/2/18.
 */
public class MockLauncherApplicationAgent extends LauncherApplicationAgent {

    public MockLauncherApplicationAgent(Application context, Object bundleContext) {
        super(context, bundleContext);
    }

    @Override
    public void preInit() {
        super.preInit();
    }

    @Override
    public void postInit() {
        super.postInit();
    }
}
