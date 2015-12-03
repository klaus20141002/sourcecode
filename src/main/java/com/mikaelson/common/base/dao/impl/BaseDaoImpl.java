package com.mikaelson.common.base.dao.impl;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.springframework.orm.jpa.JpaTemplate;
import org.springframework.orm.jpa.support.JpaDaoSupport;

import com.mikaelson.common.base.dao.IBaseDao;
import com.mikaelson.common.base.domain.BaseDomain;
import com.mikaelson.utils.Pager;

/**
 * IBaseDao's implementation.
 * {@inheritDoc} overridden:
 * 
 * @param <T>-indicates the Type of DAO, ex: Domain.
 * @param <PK>-indicates the Type of PK, ex: Long
 */
public class BaseDaoImpl<T extends BaseDomain, PK extends Serializable> extends JpaDaoSupport
    implements IBaseDao<T, PK> {
    // sql key word: from
    public static final String SQL_KEY_WORD_FROM = " from ";
    // count clause constant
    public static final String SQL_COUNT_CLAUSE = "select count(*) ";

    // domain Class instance
    private Class<T> clazz;

    // logger instance
    protected Logger logger;

    // instance of EntityManager
    @PersistenceContext
    private EntityManager entityManager;

    /**
     * @Date        :      2015年12月3日
     * @param jpaTemplate
     */
    @Resource(name = "jpaTemplate")
    public void setJpaTemplateWrap(JpaTemplate jpaTemplate) {
        this.setJpaTemplate(jpaTemplate);
    }

    /**
     * @Date        :      2015年12月3日
     * @return
     */
    public Logger getLogger() {
        return logger;
    }

    /**
     * @Date        :      2015年12月3日
     * @param logger
     */
    @Resource(name = "logger")
    public void setLogger(Logger logger) {
        this.logger = logger;
    }


    /**
     * @Date        :      2015年12月3日
     * @param clazz
     */
    public BaseDaoImpl(Class<T> clazz) {
        this.clazz = clazz;
    }

    
    /**
     * {@inheritDoc} 
     * overridden:
     * @Date        :      2015年12月3日
     * @see com.mikaelson.common.base.dao.IBaseDao#findById(java.lang.Object)
    **/
    public T findById(PK id) {
        try{
            T obj = (T) getJpaTemplate().find(clazz, id);
            return obj;
        }catch(Exception e){

            e.printStackTrace();
            return null;
        }

    }


    /**
     * {@inheritDoc} 
     * overridden:
     * @Date        :      2015年12月3日
     * @see com.mikaelson.common.base.dao.IBaseDao#save(java.lang.Object)
    **/
    public T save(T obj) {
        if (obj == null) {
            return null;
        }
        if(obj.getCreateBy() == null){
        	obj.setCreateBy(0L);
        }
        if(obj.getLastUpdateBy() == null){
        	obj.setLastUpdateBy(0L);
        }
        // obj.setDeleted(CommonConstants.NOT_DELETED_FLAG);
        if (obj.getCreateDate() == null) {
            obj.setCreateDate(new Date());
        }
        if (obj.getLastUpdateDate() == null) {
            obj.setLastUpdateDate(new Date());
        }
//        User currentUser = UserUtil.getCurrentUser();
//        if(obj.getCreateBy() == null || obj.getCreateBy() == 0){
//        	if(currentUser != null){
//        		obj.setCreateBy(currentUser.getId());
//        		logger.debug("Create by Current user="+ currentUser.getUserCode()+","+currentUser.getId());
//        	}
//        }
//        if(obj.getLastUpdateBy() == null || obj.getLastUpdateBy() == 0){
//        	if(currentUser != null){
//        		obj.setLastUpdateBy(currentUser.getId());
//        		logger.debug("Update by Current user="+ currentUser.getUserCode()+","+currentUser.getId());
//        	}
//        }
        getJpaTemplate().persist(obj);
        return obj;
    }


    /**
     * {@inheritDoc} 
     * overridden:
     * @Date        :      2015年12月3日
     * @see com.mikaelson.common.base.dao.IBaseDao#remove(java.lang.Object)
    **/
    @Override
    public void remove(T obj) {

        if (obj == null) {
            return;
        }
        getJpaTemplate().remove(obj);
    }

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#getEntityManager()
	**/
	@Override
	public EntityManager getEntityManager() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#flush()
	**/
	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#clear()
	**/
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#update(java.lang.Object)
	**/
	@Override
	public void update(T obj) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#updateByQuery(java.lang.String)
	**/
	@Override
	public void updateByQuery(String queryStr) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#updateByQueryAndMap(java.lang.String, java.util.Map)
	**/
	@Override
	public void updateByQueryAndMap(String queryStr, Map<String, ?> paraMap) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#updateByQUeryAndVaParam(java.lang.String, java.lang.Object[])
	**/
	@Override
	public void updateByQUeryAndVaParam(String queryStr, Object... params) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#removeByQuery(java.lang.String)
	**/
	@Override
	public void removeByQuery(String queryStr) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#removeByQueryAndMap(java.lang.String, java.util.Map)
	**/
	@Override
	public void removeByQueryAndMap(String queryStr, Map<String, ?> paraMap) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#removeByQueryAndVaParam(java.lang.String, java.lang.Object[])
	**/
	@Override
	public void removeByQueryAndVaParam(String queryStr, Object... params) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#remove(long)
	**/
	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#getListByQuery(java.lang.String)
	**/
	@Override
	public List<T> getListByQuery(String queryStr) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#getListByQueryWithPaging(java.lang.String, java.lang.String, com.mikaelson.utils.Pager)
	**/
	@Override
	public List<T> getListByQueryWithPaging(String queryStr,
			String countQueryStr, Pager pager) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#getListByQueryWithDefaultPaging(java.lang.String, com.mikaelson.utils.Pager)
	**/
	@Override
	public List<T> getListByQueryWithDefaultPaging(String queryStr, Pager pager) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#getListByQueryWithMap(java.lang.String, java.util.Map)
	**/
	@Override
	public List<T> getListByQueryWithMap(String queryStr, Map<String, ?> paraMap) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#getListByQueryWithVaParam(java.lang.String, java.lang.Object[])
	**/
	@Override
	public List<T> getListByQueryWithVaParam(String queryStr, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#countByQuery(java.lang.String)
	**/
	@Override
	public int countByQuery(String queryStr) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#countByQueryWithMap(java.lang.String, java.util.Map)
	**/
	@Override
	public int countByQueryWithMap(String queryStr, Map<String, ?> paraMap) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#countByQueryWithVaParam(java.lang.String, java.lang.Object[])
	**/
	@Override
	public int countByQueryWithVaParam(String queryStr, Object... params) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#getListByNamedQuery(java.lang.String)
	**/
	@Override
	public List<T> getListByNamedQuery(String queryName) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#getListByNamedQueryWithPaging(java.lang.String, java.lang.String, com.mikaelson.utils.Pager)
	**/
	@Override
	public List<T> getListByNamedQueryWithPaging(String queryName,
			String countQueryName, Pager pager) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#getListByNamedQueryWithMap(java.lang.String, java.util.Map)
	**/
	@Override
	public List<T> getListByNamedQueryWithMap(String queryName,
			Map<String, ?> paraMap) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#getListByNamedQueryWithVaParam(java.lang.String, java.lang.Object[])
	**/
	@Override
	public List<T> getListByNamedQueryWithVaParam(String queryName,
			Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#countByNamedQuery(java.lang.String)
	**/
	@Override
	public int countByNamedQuery(String queryName) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#countByNamedQueryWithMap(java.lang.String, java.util.Map)
	**/
	@Override
	public int countByNamedQueryWithMap(String queryName, Map<String, ?> paraMap) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#countByNamedQueryWithVaParam(java.lang.String, java.lang.Object[])
	**/
	@Override
	public int countByNamedQueryWithVaParam(String queryName, Object... params) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#getListByNativeQuery(java.lang.String)
	**/
	@Override
	public List<T> getListByNativeQuery(String nativeQuerySql) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#getListByNativeQueryWithPaging(java.lang.String, java.lang.String, com.mikaelson.utils.Pager)
	**/
	@Override
	public List<T> getListByNativeQueryWithPaging(String nativeQuerySql,
			String countNativeQuerySql, Pager pager) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#getListByNativeQueryWithMap(java.lang.String, java.util.Map)
	**/
	@Override
	public List<T> getListByNativeQueryWithMap(String nativeQuerySql,
			Map<String, ?> paraMap) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#getListByNativeQueryWithVaParam(java.lang.String, java.lang.Object[])
	**/
	@Override
	public List<T> getListByNativeQueryWithVaParam(String nativeQuerySql,
			Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#getListByNativeQueryAndRSMapping(java.lang.String, java.lang.String)
	**/
	@Override
	public List<T> getListByNativeQueryAndRSMapping(String nativeQuerySql,
			String sqlResultSetMappingName) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#getListByNativeQueryWithPagingAndRSMapping(java.lang.String, java.lang.String, java.lang.String, com.mikaelson.utils.Pager)
	**/
	@Override
	public List<T> getListByNativeQueryWithPagingAndRSMapping(
			String nativeQuerySql, String sqlResultSetMappingName,
			String countNativeQuerySql, Pager pager) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#getListByNativeQueryWithMapAndRSMapping(java.lang.String, java.lang.String, java.util.Map)
	**/
	@Override
	public List<T> getListByNativeQueryWithMapAndRSMapping(
			String nativeQuerySql, String sqlResultSetMappingName,
			Map<String, ?> paraMap) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#getListByNativeQueryWithVaParamAndRSMapping(java.lang.String, java.lang.String, java.lang.Object[])
	**/
	@Override
	public List<T> getListByNativeQueryWithVaParamAndRSMapping(
			String nativeQuerySql, String sqlResultSetMappingName,
			Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#countByNativeQuery(java.lang.String)
	**/
	@Override
	public int countByNativeQuery(String nativeQuerySql) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#countByNativeQueryWithMap(java.lang.String, java.util.Map)
	**/
	@Override
	public int countByNativeQueryWithMap(String nativeQuerySql,
			Map<String, ?> paraMap) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#countByNativeQueryWithVaParam(java.lang.String, java.lang.Object[])
	**/
	@Override
	public int countByNativeQueryWithVaParam(String nativeQuerySql,
			Object... params) {
		// TODO Auto-generated method stub
		return 0;
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#getListByQueryWithVaParamAndPaging(java.lang.String, java.lang.String, com.mikaelson.utils.Pager, java.lang.Object[])
	**/
	@Override
	public List<T> getListByQueryWithVaParamAndPaging(String querySql,
			String countSql, Pager pager, Object... params) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#getAll()
	**/
	@Override
	public List<T> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * {@inheritDoc} 
	 * overridden:
	 * @Date        :      2015年12月3日
	 * @see com.mikaelson.common.base.dao.IBaseDao#updateByNativeQueryAndMap(java.lang.String, java.util.Map)
	**/
	@Override
	public void updateByNativeQueryAndMap(String queryStr,
			Map<String, ?> paraMap) {
		// TODO Auto-generated method stub
		
	}


    
}
