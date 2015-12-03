package com.mikaelson.common.base.dto;

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
	 * @Date        :      2015年12月3日
	 *
	 * @return the createBy
	 */
	public long getCreateBy() {
		return createBy;
	}

	/**
	 * @Date        :      2015年12月3日
	 *
	 * @param createBy the createBy to set
	 */
	public void setCreateBy(long createBy) {
		this.createBy = createBy;
	}

	/**
	 * @Date        :      2015年12月3日
	 *
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * @Date        :      2015年12月3日
	 *
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	/**
	 * @Date        :      2015年12月3日
	 *
	 * @return the lastUpdateBy
	 */
	public long getLastUpdateBy() {
		return lastUpdateBy;
	}

	/**
	 * @Date        :      2015年12月3日
	 *
	 * @param lastUpdateBy the lastUpdateBy to set
	 */
	public void setLastUpdateBy(long lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}

	/**
	 * @Date        :      2015年12月3日
	 *
	 * @return the lastUpdateDate
	 */
	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	/**
	 * @Date        :      2015年12月3日
	 *
	 * @param lastUpdateDate the lastUpdateDate to set
	 */
	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	/**
	 * @Date        :      2015年12月3日
	 *
	 * @return the errorMsg
	 */
	public String getErrorMsg() {
		return errorMsg;
	}

	/**
	 * @Date        :      2015年12月3日
	 *
	 * @param errorMsg the errorMsg to set
	 */
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

    
    
    
}
