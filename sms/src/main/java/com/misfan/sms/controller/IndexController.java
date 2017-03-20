package com.misfan.sms.controller;

import com.misfan.sms.common.Configuration;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by skyvan on 2016/8/17.
 */
@Controller
@RequestMapping(Configuration.BASE_REQUEST_MAPPING_URI_INDEX)
public class IndexController extends BaseController{

    private static Log log = LogFactory.getLog(IndexController.class);
    @RequestMapping({"/","/desktop"})
    public String index(){
        log.info("桌面看板");
        return "index";
    }


    @Override
    protected Object assginSideMenu() {
        return Configuration.BASE_REQUEST_MAPPING_URI_INDEX;
    }
}
