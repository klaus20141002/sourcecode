//package com.mikaelson.common.dao.callback;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceException;
//import javax.persistence.Query;
//
//import com.mikaelson.utils.Pager;
//
//public class NativeQueryByPagingAndRsmJpaCallback<T> implements JpaCallback<List<T>> {
//    // native query sql
//    private String nativeQuerySql;
//    // count native query sql
//    private String countNativeQuerySql;
//    // instance of Pager
//    private Pager pager;
//    // sql result set mapping's name
//    private String sqlResultSetMappingName;
//
//    /**
//     * construct an instance of NativeQueryByPagingAndRsmJpaCallback.
//     * 
//     * @Date : 2011-3-23
//     * @param nativeQuerySql
//     *            - native query sql
//     * @param countNativeQuerySql
//     *            - native count sql
//     * @param pager
//     *            - instance of Pager
//     * @param sqlResultSetMappingName
//     *            - sql result set mapping's name
//     */
//    public NativeQueryByPagingAndRsmJpaCallback(String nativeQuerySql, String countNativeQuerySql,
//        Pager pager, String sqlResultSetMappingName) {
//        this.nativeQuerySql = nativeQuerySql;
//        this.countNativeQuerySql = countNativeQuerySql;
//        this.pager = pager;
//        this.sqlResultSetMappingName = sqlResultSetMappingName;
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
//        Query nativeQuery = em.createNativeQuery(nativeQuerySql, sqlResultSetMappingName);
//
//        Query countNativeQuery = em.createNativeQuery(countNativeQuerySql);
//        int actualSize = Integer.parseInt(countNativeQuery.getSingleResult().toString());
//        if (null != pager) {
//            pager.rebuild(actualSize);
//            nativeQuery.setFirstResult((pager.getCurrentPage() - 1) * pager.getPageSize());
//            nativeQuery.setMaxResults(pager.getPageSize());
//        }
//        return nativeQuery.getResultList();
//    }
//
//}
