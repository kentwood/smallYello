package com.just4fun.entity;

import java.util.List;

/**
 * Created by PoliceUncle on 2017/5/26.
 */
public class NodeMessage {
    private int nodeID;
    private List<MyTask> tasks;

    public int getNodeID() {
        return nodeID;
    }

    public void setNodeID(int nodeID) {
        this.nodeID = nodeID;
    }

    public List<MyTask> getTasks() {
        return tasks;
    }

    public void setTasks(List<MyTask> tasks) {
        this.tasks = tasks;
    }
}
