package com.just4fun.entity;

import java.util.List;

/**
 * Created by PoliceUncle on 2017/5/26.
 */
public class TaskMessage {
    private int resCode;
    private String resMsg;
    private List<NodeMessage> result;

    public int getResCode() {
        return resCode;
    }

    public void setResCode(int resCode) {
        this.resCode = resCode;
    }

    public String getResMsg() {
        return resMsg;
    }

    public void setResMsg(String resMsg) {
        this.resMsg = resMsg;
    }

    public List<NodeMessage> getResult() {
        return result;
    }

    public void setResult(List<NodeMessage> result) {
        this.result = result;
    }


}
