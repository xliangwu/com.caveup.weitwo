package com.caveup.weitwo.biz.bean;

public interface JSON<T> {

    /**
     * Convert JSON message to object
     * 
     * @param json
     * @return
     */
    public void fromJson(String json);

    /**
     * To JOSN text
     * 
     * @param t
     * @return
     */
    public String toJson();
}
