package com.softlab.lyzy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.softlab.lyzy.common.renCalculate;
import com.softlab.lyzy.core.mapper.RGLMapper;
import com.softlab.lyzy.core.model.RGL;
import com.softlab.lyzy.service.RGLService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RGLServiceImpl implements RGLService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final RGLMapper rglMapper;

    @Autowired
    public RGLServiceImpl(RGLMapper rglMapper) {
        this.rglMapper = rglMapper;
    }

    @Override
    public int updateRGL (RGL RGL){
        UpdateWrapper<RGL> wrapper = new UpdateWrapper<>();
        if (null != RGL.getType()){
            wrapper.eq("type",RGL.getType());
        }
        int flag = rglMapper.update(RGL, wrapper);
        return flag;
    }

    @Override
    public RGL selectRGL(RGL rgl) {
        QueryWrapper<RGL> qw = new QueryWrapper<>();
        if (null != rgl.getType()){
            qw.eq("type", rgl.getType());
        }
        List<RGL> list = rglMapper.selectList(qw);
        if (null != list && 1 == list.size()){
            return list.get(0);
        }
        return null;
    }

    @Override
    public double[] bas2 (RGL RGL){
        double[] bas = new double[10];
        int num = 0;
        for (int i = 10; i <= 100; i += 10) {
            RGL.setT((double) i);
            double bas0 = renCalculate.BAS2(RGL);
            bas[num++] = bas0;
        }
        return bas;
    }


    @Override
    public double[] bas3 (RGL RGL){
        double[] bas = new double[10];
        int num = 0;
        for (int i = 10; i <= 100; i += 10) {
            RGL.setT((double) i);
            double bas0 = renCalculate.BAS3(RGL);
            bas[num] = bas0;
            num++;
        }
        return bas;
    }

    @Override
    public double[] vol2 (RGL RGL){
        double[] vol = new double[10];
        int num = 0;
        for (int i = 10; i <= 100; i += 10) {
            RGL.setT((double) i);
            double vol0 = renCalculate.VOL2(RGL);
            vol[num] = vol0;
            num++;
        }
        return vol;
    }


    @Override
    public double[] vol3 (RGL RGL){
        double[] vol = new double[10];
        int num = 0;
        for (int i = 10; i <= 100; i += 10) {
            RGL.setT((double) i);
            double vol0 = renCalculate.VOL3(RGL);
            vol[num] = vol0;
            num++;
        }
        return vol;
    }



}
