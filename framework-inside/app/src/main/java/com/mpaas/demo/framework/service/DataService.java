package com.mpaas.demo.framework.service;

import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.mpaas.demo.framework.Constant;
import com.mpaas.demo.framework.api.IDataService;
import com.mpaas.mobile.metainfo.Service;

/**
 * Created by mengfei on 2018/7/23.
 */
@Service(
    interfaceClazz = IDataService.class,
    isLazy = false
)
public class DataService extends IDataService {
    @Override
    public String getData() {
        LoggerFactory.getTraceLogger().debug(Constant.TAG, "Service success");
        return "Data from service";
    }
}
