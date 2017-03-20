package com.misfan.sms.service;

import com.misfan.sms.dao.BaseDao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * Created by skyvan on 2016/8/16.
 */
@Service
@Transactional
public class BaseServiceImpl<T> implements BaseService<T> {
    Log log = LogFactory.getLog(BaseServiceImpl.class);
    @Resource
    private BaseDao baseDao;


}
