package com.just4fun.controller;

import com.just4fun.entity.SmallYellow;
import com.just4fun.service.SmallYellowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by PoliceUncle on 2017/4/30.
 */
@Controller
public class SmallYellowController {
    @Autowired
    SmallYellowService smallYellowService;

    @RequestMapping("getCode")
    public void getCode(HttpServletResponse response, String numString) {
        PrintWriter responseWriter = null;
        try {
            responseWriter = response.getWriter();
            SmallYellow smallYellow = smallYellowService.findSmallYellowByNum(numString);
            if (smallYellow == null) {
                responseWriter.write("NOTEXIST");
            } else {
                response.getWriter().write(smallYellow.getCodeString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (responseWriter != null){
                responseWriter.flush();
                responseWriter.close();
            }
        }
    }

    @RequestMapping("setCode")
    public void setCode(String numString, String codeString, HttpServletResponse response) {
        PrintWriter responseWriter = null;
        try {
            responseWriter = response.getWriter();
            SmallYellow smallYellow = smallYellowService.findSmallYellowByNum(numString);
            if (smallYellow == null) {
                smallYellow = new SmallYellow();
                smallYellow.setNumString(numString);
                smallYellow.setCodeString(codeString);
                smallYellowService.insertIntoSmallYellow(smallYellow);
                responseWriter.write("SUCCESS");
            } else {
                smallYellow.setNumString(numString);
                smallYellow.setCodeString(codeString);
                smallYellowService.updateSmallYellowByNum(smallYellow);
                response.getWriter().write("SUCCESS");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (responseWriter != null){
                responseWriter.flush();
                responseWriter.close();
            }
        }
    }

    @RequestMapping("createCode")
    public void createCode(String numString, String codeString, HttpServletResponse response) {
        PrintWriter responseWriter = null;
        try {
            responseWriter = response.getWriter();
            SmallYellow smallYellow = smallYellowService.findSmallYellowByNum(numString);
            if (smallYellow == null) {
                smallYellow = new SmallYellow();
                smallYellow.setNumString(numString);
                smallYellow.setCodeString(codeString);
                smallYellowService.insertIntoSmallYellow(smallYellow);
                responseWriter.write("SUCCESS");
            } else {
                response.getWriter().write("EXIST");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (responseWriter != null){
                responseWriter.flush();
                responseWriter.close();
            }
        }
    }

    @RequestMapping("updateCode")
    public void updateCode(String numString, String codeString, HttpServletResponse response) {
        PrintWriter responseWriter = null;
        try {
            responseWriter = response.getWriter();
            SmallYellow smallYellow = smallYellowService.findSmallYellowByNum(numString);
            if (smallYellow == null) {
                responseWriter.write("FAIL");
            } else {
                smallYellow.setNumString(numString);
                smallYellow.setCodeString(codeString);
                smallYellowService.updateSmallYellowByNum(smallYellow);
                response.getWriter().write("SUCCESS");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (responseWriter != null){
                responseWriter.flush();
                responseWriter.close();
            }
        }
    }

    @RequestMapping("deleteCode")
    public void deleteCode(String numString, HttpServletResponse response) {
        PrintWriter responseWriter = null;
        try {
            responseWriter = response.getWriter();
            SmallYellow smallYellow = smallYellowService.findSmallYellowByNum(numString);
            if (smallYellow == null) {
                responseWriter.write("FAIL");
            } else {
                smallYellowService.deleteSmallYellowByNum(numString);
                response.getWriter().write("SUCCESS");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (responseWriter != null){
                responseWriter.flush();
                responseWriter.close();
            }
        }
    }
}
