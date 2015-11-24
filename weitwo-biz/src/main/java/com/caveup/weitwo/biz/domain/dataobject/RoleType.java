package com.caveup.weitwo.biz.domain.dataobject;

public enum RoleType {

    USER("user"),
    ROOT("root");

    private String abbr;

    private RoleType(String abbr) {
        this.abbr = abbr;
    }

    public String getAbbr() {
        return abbr;
    }
}
