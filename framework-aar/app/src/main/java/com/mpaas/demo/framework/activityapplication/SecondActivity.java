package com.mpaas.demo.framework.activityapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.mpaas.demo.framework.R;


/**
 * Created by mengfei on 2018/7/24.
 */

public class SecondActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
