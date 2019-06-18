package com.softlab.lyzy.core.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.softlab.lyzy.core.model.BolixianXBM;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LyzyMapper extends BaseMapper<BolixianXBM>{

    @Select("select SUM(XBMJ) as sum, DCDW, LCDWDM from bolixian_xbm2017 GROUP BY DCDW, LCDWDM")
    List<BolixianXBM> selectXBMJ1();


    @Select("select XIANG_NAME, SUM(XBMJ) as sum from bolixian_xbm2017 GROUP BY XIANG_NAME")
    List<BolixianXBM> selectXBMJ();

}
