package com.softlab.lyzy.web.api;

import com.softlab.lyzy.common.util.JsonUtil;
import com.softlab.lyzy.common.util.RestData;
import com.softlab.lyzy.core.model.BolixianXBM;
import com.softlab.lyzy.service.LyzyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
@RestController
public class LyzyApi {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private final LyzyService lyzyService;

    @Autowired
    public LyzyApi(LyzyService lyzyService) {
        this.lyzyService = lyzyService;
    }


    /**
     * 多条件查询
     *
     * @param bolixianXBM
     * @return
     */
    @RequestMapping(value = "/select", method = RequestMethod.POST)
    public RestData selectAllNew(@RequestBody BolixianXBM bolixianXBM) {
        logger.info("select：" + JsonUtil.getJsonString(bolixianXBM));
        List<BolixianXBM> list = lyzyService.selectAll(bolixianXBM);
        return new RestData(list);
    }


    /**
     * 修改
     * （暂时无用）
     * 写的不对，暂时没用
     *
     * @param bolixianXBM
     * @return
     */
//    @RequestMapping(value = "/update", method = RequestMethod.POST)
//    public RestData update(@RequestBody BolixianXBM bolixianXBM) {
//        int flag = lyzyService.updateByCondition(bolixianXBM);
//        return new RestData(flag);
//    }


    /**
     * 小班面积汇总表
     *
     * @return
     */
    @RequestMapping(value = "/show", method = RequestMethod.GET)
    public RestData show() {
        logger.info("show: 小班面积");
        List<Map<String, Object>> mapList = lyzyService.show();
        return new RestData(mapList);
    }


    @RequestMapping(value = "/show1", method = RequestMethod.GET)
    public RestData show1() {
        logger.info("show1: 小班面积");
        List<Map<String, Object>> mapList = lyzyService.showBaiduApi();
        return new RestData(mapList);
    }





}