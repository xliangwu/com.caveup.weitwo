package com.caveup.weitwo.biz.domain.dataobject;

import java.io.Serializable;
import java.util.UUID;

public class Entity implements Serializable {

    private static final long serialVersionUID = 1L;

    private long              id;
    private boolean           active;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static String getSequence() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
