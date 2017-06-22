package com.just4fun.service;

import com.just4fun.entity.SmallYellow;

/**
 * Created by PoliceUncle on 2017/5/1.
 */
public interface SmallYellowService {
    SmallYellow findSmallYellowByNum(String num);

    void insertIntoSmallYellow(SmallYellow smallYellow);

    void updateSmallYellowByNum(SmallYellow smallYellow);

    void deleteSmallYellowByNum(String numString);
}
