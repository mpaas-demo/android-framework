package com.mpaas.demo.launcher;

import java.util.ArrayList;
import java.util.List;

public class ClearDataStrategy extends com.mpaas.framework.adapter.api.ClearDataStrategy {
    /**
     * 是否开启清理机制
     * 若返回 false，则什么文件都不会清理
     * 若返回 true，则会执行清理策略，可以通过getSPWhiteList，getDBWhiteList返回需要保证的文件列表
     *
     * @return
     */
    @Override
    public boolean enableClearDataStrategy() {
        return false;
    }

    /**
     * 若开启了清理机制，通过该接口返回需要保护的 SharedPreference 文件
     *
     * @return
     */
    @Override
    public List<String> getSPWhiteList() {
        List<String> whiteList = new ArrayList<>();
        whiteList.add("V2_sp_test");
        return whiteList;
    }


    /**
     * 若开启了清理机制，通过该接口返回需要保护的 db 文件
     *
     * @return
     */
    @Override
    public List<String> getDBWhiteList() {
        List<String> whiteList = new ArrayList<>();
        whiteList.add("V2_db_test");
        return whiteList;
    }
}
