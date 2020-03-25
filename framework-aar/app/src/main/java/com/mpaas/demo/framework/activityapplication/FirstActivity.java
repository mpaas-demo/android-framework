package com.mpaas.demo.framework.activityapplication;

import android.os.Bundle;

import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.framework.app.ui.BaseActivity;
import com.mpaas.demo.framework.Constant;
import com.mpaas.demo.R;

/**
 * Created by mengfei on 2018/7/23.
 */

public class FirstActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        LoggerFactory.getTraceLogger().debug(Constant.TAG, "ActivityApplication success");
    }
}
