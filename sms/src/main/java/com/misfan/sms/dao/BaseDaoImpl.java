package com.misfan.sms.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * Created by skyvan on 2016/8/15.
 */
@Transactional
@Repository
public class BaseDaoImpl<T> implements BaseDao<T> {
    private static Log log = LogFactory.getLog(BaseDaoImpl.class);
    @Resource
    HibernateTemplate hibernateTemplate;

}
