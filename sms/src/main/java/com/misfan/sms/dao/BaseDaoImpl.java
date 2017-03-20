package com.misfan.sms.dao;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.io.Serializable;

/**
 * Created by skyvan on 2016/8/15.
 */
@Transactional
@Repository
public class BaseDaoImpl implements BaseDao {
    private static Log log = LogFactory.getLog(BaseDaoImpl.class);

    @Resource
    HibernateTemplate hibernateTemplate;

    @Override
    public <T> T getEntity(Class<T> clazz, Serializable id) {
        return hibernateTemplate.get(clazz, id);
    }
}
