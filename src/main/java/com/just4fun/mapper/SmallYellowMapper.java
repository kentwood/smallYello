package com.just4fun.mapper;

import com.just4fun.entity.SmallYellow;

/**
 * Created by PoliceUncle on 2017/4/30.
 */
public interface SmallYellowMapper {
    SmallYellow findSmallYellowByNum(String numString);

    void insertIntoSmallYellow(SmallYellow smallYellow);

    void updateSmallYellowByNum(SmallYellow smallYellow);

    void deleteSmallYellowByNum(String numString);
}
