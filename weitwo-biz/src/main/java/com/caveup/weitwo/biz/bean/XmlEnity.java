package com.caveup.weitwo.biz.bean;

public class XmlEnity<T> {

    private long lastModified;
    private T t;

    public long getLastModified() {
        return lastModified;
    }

    public T getT() {
        return t;
    }

    public void setLastModified(long lastModified) {
        this.lastModified = lastModified;
    }

    public void setT(T t) {
        this.t = t;
    }
}
