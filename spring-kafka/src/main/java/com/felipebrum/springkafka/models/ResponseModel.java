package com.felipebrum.springkafka.models;

public class ResponseModel {
    private String status;

    public ResponseModel(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
