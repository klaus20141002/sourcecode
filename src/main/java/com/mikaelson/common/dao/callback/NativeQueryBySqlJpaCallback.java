///************************************************************************************
// * @File name   :      NativeQueryBySqlJpaCallback.java
// *
// * @Author      :      Wu Bin
// *
// * @Date        :      2011-6-9
// *
// * @Copyright Notice: 
// * Copyright (c) 2014 DMS, Inc. All  Rights Reserved.
// * This software is published under the terms of the DMS Software
// * License version 1.0, a copy of which has been included with this
// * distribution in the LICENSE.txt file.
// * 
// * 
// * ----------------------------------------------------------------------------------
// * Date                          Who              Version               Comments
// * 2011-6-9 上午11:02:52             Wu Bin          1.0             Initial Version
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
///**
// *
// */
//public class NativeQueryBySqlJpaCallback<T> implements JpaCallback<List<T>> {
//
//    // native query sql
//    private String nativeQuerySql;
//
//    /**
//     * 不需要page的sql
//     * @Date        :      2011-6-9
//     * @param nativeQuerySql String
//     */
//    public NativeQueryBySqlJpaCallback(String nativeQuerySql) {
//        this.nativeQuerySql = nativeQuerySql;
//    }
//
//    /**
//     * overridden:
//     * 
//     * @Date : 2011-6-9
//     * @see org.springframework.orm.jpa.JpaCallback#doInJpa(javax.persistence.EntityManager)
//     **/
//    @SuppressWarnings("unchecked")
//    @Override
//    public List<T> doInJpa(EntityManager em) throws PersistenceException {
//        Query nativeQuery = em.createNativeQuery(nativeQuerySql);
//        return nativeQuery.getResultList();
//    }
//
//}
