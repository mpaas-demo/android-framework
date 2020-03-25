package com.mpaas.demo.framework.pipeline;

import android.preference.PreferenceManager;

import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.framework.LauncherApplicationAgent;
import com.mpaas.demo.framework.Constant;
import com.mpaas.demo.framework.service.Constants;
import com.mpaas.mobile.metainfo.Pipeline;

import java.text.SimpleDateFormat;

/**
 * Created by mengfei on 2018/7/23.
 */
@Pipeline(
        name = "com.alipay.mobile.framework.INITED",
        threadName = "com.mpaas.demo.framework.pipeline.TestPipeLine"
)
public class TestPipeLine implements Runnable {
    @Override
    public void run() {
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = dateformat.format(System.currentTimeMillis());
        PreferenceManager.getDefaultSharedPreferences(LauncherApplicationAgent.getInstance().getApplicationContext()).edit().putString(Constants.KEY_PIPELINE_RUN_TIMESTAMP, "Pipeline running timestamp: " + dateStr).apply();
        LoggerFactory.getTraceLogger().debug(Constant.TAG, "PipeLine success");

    }
}
