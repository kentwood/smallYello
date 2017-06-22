package com.just4fun.entity;

import java.util.Date;
import java.util.List;

/**
 * Created by PoliceUncle on 2017/5/26.
 */
public class MyTask {
    private String taskID;
    private List<TaskConditions> taskConditons;
    private Long traceDuration;
    private String packageName;
    private Integer taskState;
    private Date createTime;

    public Long getTraceDuration() {
        return traceDuration;
    }

    public void setTraceDuration(Long traceDuration) {
        this.traceDuration = traceDuration;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Integer getTaskState() {
        return taskState;
    }

    public void setTaskState(Integer taskState) {
        this.taskState = taskState;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getTaskID() {
        return taskID;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public List<TaskConditions> getTaskConditons() {
        return taskConditons;
    }

    public void setTaskConditons(List<TaskConditions> taskConditons) {
        this.taskConditons = taskConditons;
    }
}
