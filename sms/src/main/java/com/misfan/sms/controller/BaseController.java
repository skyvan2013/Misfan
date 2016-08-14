package com.misfan.sms.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by skyvan on 2016/8/14.
 */
@Controller

public class BaseController {
    private static Log logger = LogFactory.getLog(BaseController.class);
    @RequestMapping("/test")
    public String index(){
        logger.info("hello spring mvc!");
        return "index";
    }
}
