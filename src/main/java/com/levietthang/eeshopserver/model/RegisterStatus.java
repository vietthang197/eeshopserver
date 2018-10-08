package com.levietthang.eeshopserver.model;

import java.io.Serializable;

public class RegisterStatus implements Serializable {
    private boolean registerStatus;
    private String message;

    public RegisterStatus() {
    }

    public RegisterStatus(boolean registerStatus, String message) {
        this.registerStatus = registerStatus;
        this.message = message;
    }

    public boolean isRegisterStatus() {
        return registerStatus;
    }

    public void setRegisterStatus(boolean registerStatus) {
        this.registerStatus = registerStatus;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
