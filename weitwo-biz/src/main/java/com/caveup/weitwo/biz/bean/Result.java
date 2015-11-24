package com.caveup.weitwo.biz.bean;

/**
 * Store the result of action process
 * 
 * @author xw80329
 */
public final class Result {

    private boolean valid;
    private ErrorCode errorCode;

    public Result() {
    }

    public Result(boolean status, ErrorCode errorCode) {
        this.valid = status;
        this.errorCode = errorCode;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

}
