package com.softlab.lyzy.service.impl;

import com.softlab.lyzy.core.mapper.STXTMapper;
import com.softlab.lyzy.core.model.STXTFW;
import com.softlab.lyzy.service.STXTService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class STXTServiceImpl implements STXTService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final STXTMapper STXTMapper;

    @Autowired
    public STXTServiceImpl(STXTMapper STXTMapper){
        this.STXTMapper = STXTMapper;
    }


    @Override
    public int updateSLS(STXTFW STXTFW) {
        int flag = STXTMapper.update(STXTFW, null);
        return flag;
    }


    @Override
    public STXTFW selectSLS(STXTFW STXTFW) {
        List<STXTFW> list = STXTMapper.selectList(null);
        if (null != list && 1 == list.size()){
            return list.get(0);
        }
        return null;
    }


}
