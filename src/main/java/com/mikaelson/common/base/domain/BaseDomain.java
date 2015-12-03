package com.mikaelson.common.base.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseDomain implements java.io.Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// the primary id of domain
    protected Long id;

    // creator of current record
    protected Long createBy=new Long(0);

    // protected Date createDate
    protected Date createDate;

    // modifier id of last modifier
    protected Long lastUpdateBy=new Long(0);

    // protected Date updateDate;
    protected Date lastUpdateDate;

    @Column(name = "CREATE_DATE", nullable = false)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Column(name = "CREATE_BY")
    public Long getCreateBy() {
        return createBy;
    }
    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    @Column(name = "LAST_UPDATE_BY")
    public Long getLastUpdateBy() {
        return lastUpdateBy;
    }
    public void setLastUpdateBy(Long lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }
    @Column(name = "LAST_UPDATE_DATE", nullable = false)
    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

}
