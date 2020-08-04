package com.example.fzzakr.Data_Base_SQlite;

public class SQ_litedata_storage {
    private  String phoneNumber;
    private String userMessage;


    public SQ_litedata_storage(String phoneNumber, String userMessage) {
        this.phoneNumber = phoneNumber;
        this.userMessage = userMessage;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserMessage() {
        return userMessage;
    }

    public void setUserMessage(String userMessage) {
        this.userMessage = userMessage;
    }
}
