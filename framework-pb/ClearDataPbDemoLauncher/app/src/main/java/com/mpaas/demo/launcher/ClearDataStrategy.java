package com.mpaas.demo.launcher;

import java.util.ArrayList;
import java.util.List;

public class ClearDataStrategy extends com.mpaas.framework.adapter.api.ClearDataStrategy {
    @Override
    public boolean enableClearDataStrategy() {
        return false;
    }

    @Override
    public List<String> getSPWhiteList() {
        List<String> whiteList = new ArrayList<>();
        whiteList.add("V2_sp_test");
        return whiteList;
    }


    @Override
    public List<String> getDBWhiteList() {
        List<String> whiteList = new ArrayList<>();
        whiteList.add("V2_db_test");
        return whiteList;
    }
}
