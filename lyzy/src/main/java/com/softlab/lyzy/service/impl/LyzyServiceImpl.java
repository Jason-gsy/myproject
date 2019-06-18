package com.softlab.lyzy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.softlab.lyzy.core.mapper.LyzyMapper;
import com.softlab.lyzy.core.model.BolixianXBM;
import com.softlab.lyzy.service.LyzyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Service
public class LyzyServiceImpl implements LyzyService {


    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final LyzyMapper lyzyMapper;

    @Autowired
    public LyzyServiceImpl(LyzyMapper lyzyMapper){
        this.lyzyMapper = lyzyMapper;
    }


    @Override
    //写的不对，暂时没用
    public int updateByCondition(BolixianXBM bolixianXBM){
        UpdateWrapper<BolixianXBM> uw = new UpdateWrapper<>();

        int update = lyzyMapper.update(null, uw);
        return update;
    }



    @Override
    public List<BolixianXBM> selectAll(BolixianXBM bolixianXBM) {
        QueryWrapper<BolixianXBM> qw = new QueryWrapper<>();
        if (null != bolixianXBM.getDCDW() && "" != bolixianXBM.getDCDW()){
            qw.and(wrapper -> wrapper.eq("DCDW", bolixianXBM.getDCDW()));
        }
        if (null != bolixianXBM.getZFLLX() && "" != bolixianXBM.getZFLLX()){
            qw.and(wrapper -> wrapper.eq("Z_FLLX", bolixianXBM.getZFLLX()));
        }
        if (null != bolixianXBM.getZDL() && "" != bolixianXBM.getZDL()){
            qw.and(wrapper -> wrapper.eq("Z_DL", bolixianXBM.getZDL()));
        }
        if (null != bolixianXBM.getYSSZZ() && "" != bolixianXBM.getYSSZZ() ){
            qw.and(wrapper -> wrapper.eq("YSSZZ", bolixianXBM.getYSSZZ()));
        }
        if (null != bolixianXBM.getLJ() && "" != bolixianXBM.getLJ()){
            qw.and(wrapper -> wrapper.eq("LJ",bolixianXBM.getLJ()));
        }
        if (null != bolixianXBM.getJYCS() && "" != bolixianXBM.getJYCS()){
            qw.and(wrapper -> wrapper.eq("JYCS",bolixianXBM.getJYCS()));
        }
        if (null != bolixianXBM.getLDLX() && "" != bolixianXBM.getLDLX()){
            qw.and(wrapper -> wrapper.eq("LDLX",bolixianXBM.getLDLX()));
        }
        if (null != bolixianXBM.getYSSZ() && "" != bolixianXBM.getYSSZ()){
            qw.and(wrapper -> wrapper.eq("YSSZ", bolixianXBM.getYSSZ()));
        }
        if (null != bolixianXBM.getLDZLDJ() && ""!= bolixianXBM.getLDZLDJ() ){
            qw.and(wrapper -> wrapper.eq("LDZLDJ", bolixianXBM.getLDZLDJ()));
        }
        List<BolixianXBM> lyzyList = lyzyMapper.selectList(qw);
        return lyzyList;
    }

    @Override
    public List<Map<String, Object>> show() {
        List<Map<String, Object>> al = new ArrayList<>();
        List <BolixianXBM> list = lyzyMapper.selectXBMJ1();
        for (BolixianXBM list0 : list){
            Map <String, Object> map = new HashMap<>();
            String dcdw = list0.getDCDW();
            map.put("dcdw", dcdw);
            map.put("lcdwdm", list0.getLCDWDM());
            map.put("xbmj", String.format("%.2f", list0.getSum()));
            al.add(map);
        }

        return al;
    }

    @Override
    public List<Map<String, Object>> showBaiduApi() {
        List<Map<String, Object>> al = new ArrayList<>();
        List<BolixianXBM>  rtv = lyzyMapper.selectXBMJ();
        for (BolixianXBM rtv0 : rtv){
            Map <String, Object> map = new HashMap<>();
            map.put("name", rtv0.getXIANGNAME());
            map.put("value", String.format("%.2f", rtv0.getSum()));
            al.add(map);
        }
        return  al;
    }


}
