package com.mpaas.demo.framework.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.alipay.mobile.antui.basic.AUToast;
import com.alipay.mobile.antui.utils.PublicResources;
import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.mpaas.demo.framework.Constant;
import com.mpaas.demo.framework.R;
import com.mpaas.demo.framework.api.Constants;

/**
 * Created by mengfei on 2018/7/23.
 */

@com.mpaas.mobile.metainfo.BroadcastReceiver(actions = {"com.mpaas.demo.framework.broadcastreceiver.ACTION_TEST"})
public class TestBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (Constants.ACTION_TEST.equals(action)) {
            LoggerFactory.getTraceLogger().debug(Constant.TAG, "BroadcastReceiver success");
            AUToast.makeToast(context, PublicResources.Toast_OK, context.getResources().getString(R.string.receive_tip), Toast.LENGTH_SHORT).show();
        }
    }
}
