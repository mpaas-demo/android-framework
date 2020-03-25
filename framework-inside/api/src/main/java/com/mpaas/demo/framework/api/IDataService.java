package com.mpaas.demo.framework.api;

import android.os.Bundle;

import com.alipay.mobile.framework.service.ext.ExternalService;

/**
 * Created by mengfei on 2018/7/23.
 */

public abstract class IDataService extends ExternalService {
    @Override
    protected void onCreate(Bundle bundle) {

    }

    @Override
    protected void onDestroy(Bundle bundle) {

    }

    public abstract String getData();
}
