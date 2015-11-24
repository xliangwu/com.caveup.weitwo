package com.caveup.weitwo.biz.bean;

public enum ErrorCode {

    LOGIN_INVALID_ACCOUNT(1000, "Invalid account"),
    LOGIN_INVALID_PASSWORD(1001, "Invalid password"),
    LOGIN_ACCOUNT_INACTIVE(1002, "Account is not actived");

    private int errorCode;
    private String errorMsg;

    private ErrorCode(int errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }
}
