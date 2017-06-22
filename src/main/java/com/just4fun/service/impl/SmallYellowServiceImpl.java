package com.just4fun.service.impl;

import com.just4fun.entity.SmallYellow;
import com.just4fun.mapper.SmallYellowMapper;
import com.just4fun.service.SmallYellowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by PoliceUncle on 2017/5/1.
 */
@Service("smallYellowService")
public class SmallYellowServiceImpl implements SmallYellowService {
    @Autowired
    SmallYellowMapper smallYellowMapper;

    @Override
    public SmallYellow findSmallYellowByNum(String num) {
        return smallYellowMapper.findSmallYellowByNum(num);
    }

    @Override
    public void insertIntoSmallYellow(SmallYellow smallYellow) {
        smallYellowMapper.insertIntoSmallYellow(smallYellow);
    }

    @Override
    public void updateSmallYellowByNum(SmallYellow smallYellow) {
        smallYellowMapper.updateSmallYellowByNum(smallYellow);
    }

    @Override
    public void deleteSmallYellowByNum(String numString) {
        smallYellowMapper.deleteSmallYellowByNum(numString);
    }
}
