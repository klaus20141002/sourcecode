/******************************************************************************
 * @File name   :      FileTransfer.java
 *
 * @Author      :      Hasee
 *
 * @Date        :      2015年12月3日
 *
 * @Copyright Notice: 
 * Copyright (c) 2020 Mikaelson Niklaus, Inc. All  Rights Reserved.
 * This software is published under the terms of the Mikaelson Niklaus Software
 * License version 1.0, a copy of which has been included with this
 * distribution in the LICENSE.txt file.
 * 
 * 
 * ----------------------------------------------------------------------------
 * Date                   Who         Version        Comments
 * 2015年12月3日 下午10:23:32        Hasee     1.0            Initial Version
 *****************************************************************************/
package com.mikaelson.common.file.domain;

import java.util.Date;

import javax.persistence.Column;

import com.mikaelson.common.base.domain.BaseDomain;

/**
 *
 */

/**
 *
 */
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@Entity
//@Table(name = "tl_common_file_log")
//@AttributeOverrides({
//		@AttributeOverride(name = "createDate", column = @Column(name = "CREATE_DATE", nullable = false, columnDefinition = "DATE DEFAULT SYSDATE")),
//		@AttributeOverride(name = "lastUpdateDate", column = @Column(name = "LAST_UPDATE_DATE", nullable = false, columnDefinition = "DATE DEFAULT SYSDATE")),
//		@AttributeOverride(name = "lastUpdateBy", column = @Column(name = "LAST_UPDATE_BY", nullable = false, columnDefinition = "number(18) default 0")),
//		@AttributeOverride(name = "createBy", column = @Column(name = "CREATE_BY", nullable = false, columnDefinition = "number(18) default 0")) })
public class FileTransfer extends BaseDomain {

	private static final long serialVersionUID = 1L;
	private String fileName;
	private int transferType;
	private String status;
	private Date startTime;
	private Date endTime;
	private String transferDesc;
	
	/**
	 * @Date        :      2015年12月3日
	 * @return
	 */
//	@Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_common_file_log")
//    @SequenceGenerator(name = "seq_common_file_log", sequenceName = "seq_common_file_log", allocationSize = 1)
    public Long getId() {
        return id;
    }

    /**
     * @Date        :      2015年12月3日
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }
	/**
	 * @Date        :      2015年12月3日
	 *
	 * @return the fileName
	 */
	@Column(name = "FILE_NAME", nullable = false)
	public String getFileName() {
		return fileName;
	}
	/**
	 * @Date        :      2015年12月3日
	 *
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	/**
	 * @Date        :      2015年12月3日
	 *
	 * @return the transferType
	 */
	@Column(name = "TRANSFER_TYPE", nullable = false)
	public int getTransferType() {
		return transferType;
	}
	/**
	 * @Date        :      2015年12月3日
	 *
	 * @param transferType the transferType to set
	 */
	public void setTransferType(int transferType) {
		this.transferType = transferType;
	}
	/**
	 * @Date        :      2015年12月3日
	 *
	 * @return the status
	 */
	@Column(name = "STATUS", length = 100, nullable = false)
	public String getStatus() {
		return status;
	}
	/**
	 * @Date        :      2015年12月3日
	 *
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @Date        :      2015年12月3日
	 *
	 * @return the startTime
	 */
	@Column(name = "START_TIME")
	public Date getStartTime() {
		return startTime;
	}
	/**
	 * @Date        :      2015年12月3日
	 *
	 * @param startTime the startTime to set
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	/**
	 * @Date        :      2015年12月3日
	 *
	 * @return the endTime
	 */
	@Column(name = "END_TIME")
	public Date getEndTime() {
		return endTime;
	}
	/**
	 * @Date        :      2015年12月3日
	 *
	 * @param endTime the endTime to set
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	/**
	 * @Date        :      2015年12月3日
	 *
	 * @return the transferDesc
	 */
	@Column(name = "transfer_desc", nullable = true)
	public String getTransferDesc() {
		return transferDesc;
	}
	/**
	 * @Date        :      2015年12月3日
	 *
	 * @param transferDesc the transferDesc to set
	 */
	public void setTransferDesc(String transferDesc) {
		this.transferDesc = transferDesc;
	}
	

}
