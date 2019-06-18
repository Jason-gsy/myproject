package com.softlab.lyzy.service;

import com.softlab.lyzy.core.model.BolixianXBM;

import java.util.List;
import java.util.Map;

public interface LyzyService {

    /**
     * 写的不对，暂时没用
     * @param bolixianXBM
     * @return
     */
    int updateByCondition(BolixianXBM bolixianXBM);


    /**
     * 查询
     * @param bolixianXBM
     * @return
     */
    List<BolixianXBM> selectAll(BolixianXBM bolixianXBM);

    /**
     * 小班面积
     * @return
     */
    List<Map<String, Object>> show();

    /**
     * 百度API小班面积
     * @return
     */
    List<Map<String, Object>> showBaiduApi();

}
