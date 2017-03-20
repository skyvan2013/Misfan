package com.misfan.sms.dao;

import java.io.Serializable;

/**
 * Created by skyvan on 2016/8/15.
 */
public interface BaseDao  {
    public <T> T getEntity(Class<T> clazz, Serializable id);
    
}
