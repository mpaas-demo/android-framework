package com.mpaas.demo.framework;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v4.content.LocalBroadcastManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;

import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.framework.LauncherApplicationAgent;
import com.alipay.mobile.framework.MicroApplicationContext;
import com.alipay.mobile.quinox.utils.SharedPreferenceUtil;
import com.mpaas.demo.R;
import com.mpaas.demo.framework.service.Constants;
import com.mpaas.demo.framework.service.IDataService;
import com.ut.device.UTDevice;


public class MainActivity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.application).setOnClickListener(this);
        findViewById(R.id.service).setOnClickListener(this);
        findViewById(R.id.broadcast_receiver).setOnClickListener(this);
        findViewById(R.id.pipeline).setOnClickListener(this);
        testUidId(this);
        goTest();
    }

    private void testUidId(Context ctx) {
        String utdId = UTDevice.getUtdid(ctx);
        SharedPreferences pref = SharedPreferenceUtil.getInstance().getDefaultSharedPreference(ctx);
        String oldUidId = pref.getString("mpaas_test_utdid", "");
        if (!TextUtils.isEmpty(oldUidId)) {
            if (oldUidId.equals(utdId)) {
                LoggerFactory.getTraceLogger().debug(Constant.TAG, "Utdid success");
            }
        } else {
            pref.edit().putString("mpaas_test_utdid", utdId).apply();
        }
    }

    private void goTest() {
        try {
            Class healthActivity = Class.forName("com.mpaas.diagnose.ui.HealthBizSelectActivity");
            Intent intent = new Intent(this, healthActivity);
            startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.application:
                MicroApplicationContext context = LauncherApplicationAgent.getInstance().getMicroApplicationContext();
                context.startApp(null, "33330007", null);
                break;
            case R.id.broadcast_receiver:
                LocalBroadcastManager.getInstance(LauncherApplicationAgent.getInstance().getApplicationContext()).sendBroadcast(new Intent(Constants.ACTION_TEST));
                break;
            case R.id.pipeline:
                String toast = PreferenceManager.getDefaultSharedPreferences(this).getString(Constants.KEY_PIPELINE_RUN_TIMESTAMP, null);
                if (!TextUtils.isEmpty(toast)) {
                    LoggerFactory.getTraceLogger().debug(Constant.TAG, "PipeLine success");
                }
                Toast.makeText(this, toast, Toast.LENGTH_SHORT).show();
                break;
            case R.id.service:
                IDataService dataService = LauncherApplicationAgent.getInstance().getMicroApplicationContext().findServiceByInterface(IDataService.class.getName());
                Toast.makeText(this, dataService.getData(), Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
