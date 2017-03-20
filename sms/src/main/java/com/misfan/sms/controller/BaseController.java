package com.misfan.sms.controller;

import com.misfan.sms.common.Configuration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by skyvan on 2016/8/14.
 */

abstract public class BaseController {
    private static Logger logger = LogManager.getLogger(BaseController.class);

    @Autowired
    protected HttpServletRequest request;

    @ModelAttribute(Configuration.APP_SIDE_MENU_ID)
    abstract protected Object assginSideMenu();


}
