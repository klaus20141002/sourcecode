package com.mikaelson.utils;

import com.mikaelson.common.base.dto.BaseDto;

/**
 * Class including Paging information.
 */
public class Pager extends BaseDto{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    // current page no.
    private int currentPage = 1;
    // page size
    private int pageSize = 30;
    private int defaultGroupPageSize = 10;
    // total pages
    private int totalPages;
    // total record size
    private int totalSize;

    
    public int getDefaultGroupPageSize() {
		return defaultGroupPageSize;
	}

	public void setDefaultGroupPageSize(int defaultGroupPageSize) {
		this.defaultGroupPageSize = defaultGroupPageSize;
	}

	/**
     * get current page number.
     * 
     * @Date : 2011-3-4
     * 
     * @return the currentPage
     */
    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * set current page number.
     * 
     * @Date : 2011-3-4
     * 
     * @param currentPage
     *            the currentPage to set
     */
    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    /**
     * get page size
     * 
     * @Date : 2011-3-4
     * 
     * @return the pageSize
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * set page size
     * 
     * @Date : 2011-3-4
     * 
     * @param pageSize
     *            the pageSize to set
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * get total pages
     * 
     * @Date : 2011-3-4
     * 
     * @return the totalPages
     */
    public int getTotalPages() {
        return totalPages;
    }

    /**
     * set total pages
     * 
     * @Date : 2011-3-4
     * 
     * @param totalPages
     *            the totalPages to set
     */
    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    /**
     * get total size
     * 
     * @Date : 2011-3-4
     * 
     * @return the totalSize
     */
    public int getTotalSize() {
        return totalSize;
    }

    /**
     * set total size
     * 
     * @Date : 2011-3-4
     * 
     * @param totalSize
     *            the totalSize to set
     */
    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

    /**
     * According to total size and page size, rebuild current page and total
     * pages.
     * 
     * @Date : 2011-3-23
     * @param totalSize
     *            - total size of records
     */
    public void rebuild(int totalSize) {
        setTotalSize(totalSize);
        setTotalPages((totalSize - 1) / getPageSize() + 1);
        if (this.currentPage < 1) {
            setCurrentPage(1);
        }
        if (this.currentPage > this.totalPages) {
            setCurrentPage(this.totalPages);
        }
    }

}
