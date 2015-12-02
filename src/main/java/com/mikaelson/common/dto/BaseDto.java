package com.mikaelson.common.dto;

import java.util.Date;

/**
 * The base Data Transfer Object.
 */
public class BaseDto implements java.io.Serializable {
    // serial version id
    private static final long serialVersionUID = 1L;
    
    // creator of current record
    protected long createBy;

    // protected Date createDate
    protected Date createDate;

    // modifier id of last modifier
    protected long lastUpdateBy;

    // protected Date updateDate;
    protected Date lastUpdateDate;
    
    private String errorMsg;

	/**
	 * @return the errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}

	/**
	 * @param errorMsg the errorMsg to set
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	/**
	 * @return the createBy
	 */
	public long getCreateBy() {
		return createBy;
	}

	/**
	 * @param createBy the createBy to set
	 */
	public void setCreateBy(long createBy) {
		this.createBy = createBy;
	}

	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * @return the lastUpdateBy
	 */
	public long getLastUpdateBy() {
		return lastUpdateBy;
	}

	/**
	 * @param lastUpdateBy the lastUpdateBy to set
	 */
	public void setLastUpdateBy(long lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}

	/**
	 * @return the lastUpdateDate
	 */
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	/**
	 * @param lastUpdateDate the lastUpdateDate to set
	 */
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	
	
    
    
    
}
