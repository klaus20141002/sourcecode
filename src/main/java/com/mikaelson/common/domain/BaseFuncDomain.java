package com.mikaelson.common.domain;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import com.mikaelson.constants.CommonConstants;
import com.mikaelson.utils.Utils;

@MappedSuperclass
public class BaseFuncDomain extends BaseDomain{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int isDeleted;

	@Column(name = "is_deleted", nullable = false)
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	@Override
	public String toString() {
		  return ", id=" + id + ", createBy=" + createBy + ", createDate="
          + Utils.formatDate(CommonConstants.DATE_FORMAT_YYMMDD, createDate)
          + ",lastUpdateBy=" + lastUpdateBy + ", lastUpdateDate="
          + Utils.formatDate(CommonConstants.DATE_FORMAT_YYMMDD, lastUpdateDate) + ",isDeleted=" +isDeleted + "]";
	}
	
}
