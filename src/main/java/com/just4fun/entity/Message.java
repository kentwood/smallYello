package com.just4fun.entity;

/**
 * Created by PoliceUncle on 2017/6/4.
 */
import java.util.ArrayList;
import java.util.List;

public class Message {
    private int resCode;
    private String resMsg;
    List<MyHostStation> result = new ArrayList();

    public Message() {
    }

    public int getResCode() {
        return this.resCode;
    }

    public void setResCode(int resCode) {
        this.resCode = resCode;
    }

    public String getResMsg() {
        return this.resMsg;
    }

    public void setResMsg(String resMsg) {
        this.resMsg = resMsg;
    }

    public List<MyHostStation> getResult() {
        return this.result;
    }

    public void setResult(List<MyHostStation> result) {
        this.result = result;
    }
}