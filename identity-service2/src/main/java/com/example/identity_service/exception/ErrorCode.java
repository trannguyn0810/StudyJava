package com.example.identity_service.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "Uncategorized error"),
    INVALID_KEY(1001, "Invalid messege key"),
    USER_EXISTED(1002, "User existed"),
    USERNAME_INVALID(1003, "Username must be at leats 3 characters"),
    PASSWORD_INVALID(1004, "Username must be at leats 8 characters")
    ;

    ErrorCode(int code, String messege) {
        this.code = code;
        this.messege = messege;
    }

    private int code;
    private String messege;

    public int getCode() {
        return code;
    }

    public String getMessege() {
        return messege;
    }
}
