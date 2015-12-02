///************************************************************************************
// * @File name   :      QueryWithPagingJpaCallback.java
// *
// * @Author      :      Jianxi Wu
// *
// * @Date        :      2011-3-9
// *
// * @Copyright Notice: 
// * Copyright (c) 2014 DMS, Inc. All  Rights Reserved.
// * This software is published under the terms of the DMS Software
// * License version 1.0, a copy of which has been included with this
// * distribution in the LICENSE.txt file.
// * 
// * 
// * ----------------------------------------------------------------------------------
// * Date                         Who                 Version         Comments
// * 2011-3-9 上午10:04:14         Jianxi Wu            1.0            Initial Version
// * 2011-10-13 上午10:04:14       tun.tan              1.0            update count 
// ************************************************************************************/
//package com.cap.bts.framework.common.dao.callback;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceException;
//import javax.persistence.Query;
//
//import org.springframework.orm.jpa.JpaCallback;
//
//import com.cap.bts.framework.common.util.Pager;
//
///**
// *JpaCallback's implementation of JPA's Query with Paging support.
// * 
// * @param <T>
// *            - domain type
// */
//public class QueryWithPagingAndParamJpaCallback<T> implements JpaCallback<List<T>> {
//
//    // JP-Query string
//    private String queryStr;
//    // JP-Query count string
//    private String countQueryStr;
//    // instance of Pager
//    private Pager pager;
//    
//    private Object[] params;
//
//    /**
//     * Construct an instance of QueryWithPagingJpaCallback.
//     * 
//     * @Date : 2011-3-23
//     * @param queryStr
//     *            - JP-Query string
//     * @param countQueryStr
//     *            - JP-Query count string
//     * @param pager
//     *            - instance of Pager
//     */
//    public QueryWithPagingAndParamJpaCallback(String queryStr, String countQueryStr, Object[] params, Pager pager) {
//        this.queryStr = queryStr;
//        this.countQueryStr = countQueryStr;
//        this.pager = pager;
//        this.params = params;
//    }
//    
//    private void prepareQueryParam(Query query, Object... params) {
//        if (null != params) {
//            for (int i = 0; i < params.length; i++) {
//                query.setParameter(i + 1, params[i]);
//            }
//        }
//    }
//
//    /**
//     * 
//     * {@inheritDoc} overridden:
//     * 
//     * @Date : 2011-3-28
//     * @see org.springframework.orm.jpa.JpaCallback#doInJpa(javax.persistence.EntityManager)
//     * 
//     */
//    @SuppressWarnings("unchecked")
//    @Override
//    public List<T> doInJpa(EntityManager em) throws PersistenceException {
//        Query query = em.createQuery(queryStr);
//        prepareQueryParam(query, params);
//        Query countQuery = em.createQuery(countQueryStr);
//        prepareQueryParam(countQuery, params);
//        /**
//         * count 统计修改
//         *
//         */         
//        int actualSize = 0;
//        Object singleRsult=countQuery.getSingleResult();
//        if(singleRsult==null){
//        	actualSize=0;
//        }else
//        	actualSize = Integer.parseInt(singleRsult.toString());
//        if (null != pager) {
//            pager.rebuild(actualSize);
//            query.setFirstResult((pager.getCurrentPage() - 1) * pager.getPageSize());
//            query.setMaxResults(pager.getPageSize());
//        }
//        return query.getResultList();
//    }
//
//}
