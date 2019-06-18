package com.softlab.lyzy.web.api;

import com.softlab.lyzy.common.util.JsonUtil;
import com.softlab.lyzy.common.util.RestData;
import com.softlab.lyzy.common.zyhjCalculate;
import com.softlab.lyzy.core.model.ZYHJ;
import com.softlab.lyzy.service.ZYHJService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
@RestController
public class ZYHJApi {

    private Logger logger =  LoggerFactory.getLogger(this.getClass());

    private final ZYHJService zyhjService;

    @Autowired
    public ZYHJApi(ZYHJService zyhjService){
        this.zyhjService = zyhjService;
    }

    /**
     * 一共四个公式
     *
     * LCC土地资源承载力 (人)
     * WCC为水资源承载力
     * Rw为区域水环境承载力
     * Wr为大气环境承载人口规模
     * RECC为资源环境承载力
     *
     *
     * @param zyhj
     * @return
     */
    @PostMapping(value = "/LCC")
    public RestData lcc(@RequestBody ZYHJ zyhj){
        logger.info("lcc:" + JsonUtil.getJsonString(zyhj));
        int flag = zyhjService.update(zyhj);
        return new RestData(zyhjCalculate.lcc(zyhj));
    }

    @PostMapping(value = "/WCC")
    public RestData wcc(@RequestBody ZYHJ zyhj){
        logger.info("wcc:" + JsonUtil.getJsonString(zyhj));
        int flag = zyhjService.update(zyhj);
        return new RestData(zyhjCalculate.wcc(zyhj));
    }

    @PostMapping(value = "/RW")
    public RestData rw(@RequestBody ZYHJ zyhj){
        logger.info("RW:" + JsonUtil.getJsonString(zyhj));
        int flag = zyhjService.update(zyhj);
        return new RestData(zyhjCalculate.rw(zyhj));
    }

    @PostMapping(value = "/Wr")
    public RestData Wr(@RequestBody ZYHJ zyhj){
        logger.info("wr:" + JsonUtil.getJsonString(zyhj));
        int flag = zyhjService.update(zyhj);
        return new RestData(zyhjCalculate.wr(zyhj));
    }

    @PostMapping(value = "/RECC")
    public RestData RECC(@RequestBody ZYHJ zyhj){
        logger.info("recc:" + JsonUtil.getJsonString(zyhj));
        int flag = zyhjService.update(zyhj);
        return new RestData(zyhjCalculate.recc(zyhj));
    }


}
