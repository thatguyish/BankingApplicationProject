package com.bankingapplicationmain.bankingapplicationmain.details.success;

import com.bankingapplicationmain.bankingapplicationmain.models.Bill;


public class BillByIdSuccessfullyFound {
    private Integer code;
    private String message;
    private Iterable<Bill> data;

    public BillByIdSuccessfullyFound(Integer code, String message, Iterable<Bill> data) {
        this.code = code;
        this.message = message;
        this.data = data;

    }

    public BillByIdSuccessfullyFound() {

    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Iterable<Bill> getData() {
        return data;
    }

    public void setData(Iterable<Bill> data) {
        this.data = data;
    }
}
