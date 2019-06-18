package com.softlab.lyzy.service.impl;

import com.softlab.lyzy.core.mapper.THJZMapper;
import com.softlab.lyzy.core.model.THJZ;
import com.softlab.lyzy.service.THJZService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class THJZServiceImpl implements THJZService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final THJZMapper thjzMapper;

    @Autowired
    public THJZServiceImpl(THJZMapper thjzMapper){
        this.thjzMapper = thjzMapper;
    }


    @Override
    public int update(THJZ thjz) {
       int flag = thjzMapper.update(thjz, null);
       return flag;
    }
}
