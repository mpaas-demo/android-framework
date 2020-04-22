package com.mpaas.demo.launcher;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.alipay.mobile.antui.basic.AUToast;
import com.alipay.mobile.antui.utils.PublicResources;
import com.alipay.mobile.quinox.utils.SharedPreferenceUtil;


/**
 * Created by mPaaS on 16/9/28.
 */
public class MainActivity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.mpaas.demo.launcher.R.layout.main);
        findViewById(R.id.record).setOnClickListener(this);
        findViewById(R.id.crash).setOnClickListener(this);
        SharedPreferences preferences = SharedPreferenceUtil.getInstance().getDefaultSharedPreference(MainActivity.this);
        boolean firstStart = preferences.getBoolean("first_start", true);
        AUToast.makeToast(this, PublicResources.Toast_OK, "firstStart:" + firstStart, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.record) {
            SharedPreferences preferences = SharedPreferenceUtil.getInstance().getDefaultSharedPreference(MainActivity.this);
            preferences.edit().putBoolean("first_start", false).apply();
        } else if (id == R.id.crash) {
            int ret = 1 / 0;
        }
    }
}
