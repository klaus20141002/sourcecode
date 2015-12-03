package com.mikaelson.common.base.domain;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseDolIntfDomain extends BaseDataIntfDomain{
    
    private static final long serialVersionUID = 1L;
    
    private Long eventId;
    @Column(name = "event_id")
    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
    }
}
