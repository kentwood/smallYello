package com.just4fun.controller;

import com.just4fun.entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by PoliceUncle on 2017/5/15.
 */
@Controller
@RequestMapping("yinmeizi")
public class YinmeiziController {
    @RequestMapping("taskList")
    public @ResponseBody TaskMessage getStation(HttpServletResponse response) {
        response.addHeader("Access-Control-Allow-Origin", "*");
        TaskMessage taskMessage = new TaskMessage();
        taskMessage.setResCode(0);
        taskMessage.setResMsg("success");
        List<NodeMessage> result = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            NodeMessage nodeMessage = new NodeMessage();
            nodeMessage.setNodeID(i);
            List<MyTask> tasks = new ArrayList<>();
            for (int j = 1; j < 10; j++) {
                MyTask myTask = new MyTask();
                myTask.setCreateTime(new Date());
                myTask.setPackageName("bingo");
                myTask.setTaskID("task-username-" + j);
                myTask.setTaskState(0);
                myTask.setTraceDuration(1200L);
                List<TaskConditions> taskConditions = new ArrayList<>();
                for (int k = 0; k < 4; k++) {
                    TaskConditions taskConditions1 = new TaskConditions();
                    taskConditions1.setId("haha" + k);
                    taskConditions.add(taskConditions1);
                }
                myTask.setTaskConditons(taskConditions);
                tasks.add(myTask);
            }
            nodeMessage.setTasks(tasks);
            result.add(nodeMessage);
        }
        taskMessage.setResult(result);
        return taskMessage;
    }

    @RequestMapping({"hostStation"})
    @ResponseBody
    public Message getHostStation(HttpServletResponse response) {
        response.addHeader("Access-Control-Allow-Origin", "*");
        Message message = new Message();
        message.setResCode(0);
        message.setResMsg("success");
        ArrayList result = new ArrayList();

        for(int i = 1; i < 10; ++i) {
            HostStation hostStation = new HostStation();
            hostStation.setId(i);
            hostStation.setName("bignog-" + i);
            hostStation.setUrl("192.168.1." + (i + 1));
            hostStation.setVersion("V800R002010");
            hostStation.setStartTime(new Date());
            hostStation.setStatus(i%4);
            result.add(hostStation);
        }

        message.setResult(result);
        return message;
    }
}
