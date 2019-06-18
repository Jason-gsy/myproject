package com.softlab.lyzy.service.impl;

import com.softlab.lyzy.core.mapper.ZYHJMapper;
import com.softlab.lyzy.core.model.ZYHJ;
import com.softlab.lyzy.service.ZYHJService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ZYHJServiceImpl implements ZYHJService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final ZYHJMapper zyhjMapper;

    @Autowired
    public ZYHJServiceImpl(ZYHJMapper zyhjMapper){
        this.zyhjMapper = zyhjMapper;
    }


    @Override
    public int update(ZYHJ zyhj) {
        int flag = zyhjMapper.update(zyhj, null);
        return flag;
    }
}
