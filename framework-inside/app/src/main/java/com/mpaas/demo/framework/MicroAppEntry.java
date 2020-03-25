package com.mpaas.demo.framework;

import android.content.Intent;
import android.os.Bundle;

import com.alipay.mobile.framework.app.ActivityApplication;
import com.mpaas.demo.framework.activityapplication.FirstActivity;
import com.mpaas.framework.adapter.api.MPFramework;
import com.mpaas.mobile.metainfo.Application;

/**
 * 场景一：
 * 若只可能会跳转到某一个Activity界面，那么可以只重载getEntryClassName返回Activity的classname，其他函数都不需要重载
 * 场景二：
 * 若需要根据需求跳转到不同的Activity界面那么需要重载onStart和onRestart，根据bundle中的参数跳转到指定的界面
 * Created by mengfei on 2018/7/23.
 */
@Application(appId = "33330007")
public class MicroAppEntry extends ActivityApplication {

    private Bundle mParam;

    @Override
    public String getEntryClassName() {
        // 场景一：只可能跳转到某一个Activity在此返回classname即可
        // return PipeLineMainActivity.class.getName();
        // 场景二：根据参数跳转到某一界面，需要返回null
        // 建议使用场景二
        return null;
    }

    /**
     * Application被创建时被调用，实现类可以在这里做些初始化的工作</br>
     * 注意：请不要再onCreate生命周期中进行activity的跳转，这样做会导致app被杀死后，再次开启，系统会恢复该页面，同时又会启动主页面，导致冲突。</br>
     * 建议将启动逻辑放到onStart和onRestart方法中去处理。
     *
     * @param bundle
     */
    @Override
    protected void onCreate(Bundle bundle) {
        mParam = bundle;
    }

    /**
     * 启动Application时被调用
     * 如果Application还没有被创建，会先去执行create方法，然后再执行onStart()回调
     */
    @Override
    protected void onStart() {
        doStartApp(mParam);
    }

    /**
     * 当Application被销毁时，调用此回调
     *
     * @param bundle
     */
    @Override
    protected void onDestroy(Bundle bundle) {

    }

    /**
     * 启动Application时，如果Application已经被start过了，则不调用onStart()而是调用onRestart()回调
     *
     * @param bundle
     */
    @Override
    protected void onRestart(Bundle bundle) {
        mParam = bundle;
        doStartApp(mParam);
    }

    /**
     * 当一个新的Application被start时，当前的Application将被暂停，此方法被回调
     */
    @Override
    protected void onStop() {

    }

    private void doStartApp(Bundle bundle) {
        Intent it = new Intent(MPFramework.getApplicationContext()
                , FirstActivity.class);
        MPFramework.getApplicationContext()
                .startActivity(it.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK));
    }
}
