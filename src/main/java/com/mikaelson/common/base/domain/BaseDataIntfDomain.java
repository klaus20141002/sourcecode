package com.mikaelson.common.base.domain;

import javax.persistence.Column;
public class BaseDataIntfDomain extends BaseDomain{
    private static final long serialVersionUID = 1L;
    
    
    private String source;
    private String consumer;
    private Integer status;
    private String errorMessage;
    

    @Column(name = "source")
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    @Column(name = "consumer")
    public String getConsumer() {
        return consumer;
    }
    public void setConsumer(String consumer) {
        this.consumer = consumer;
    }
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    @Column(name = "error_message")
    public String getErrorMessage() {
        return errorMessage;
    }
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    
}
