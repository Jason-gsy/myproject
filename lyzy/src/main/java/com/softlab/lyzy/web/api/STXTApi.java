package com.softlab.lyzy.web.api;

import com.softlab.lyzy.common.stxtCalculate;
import com.softlab.lyzy.common.util.JsonUtil;
import com.softlab.lyzy.common.util.RestData;
import com.softlab.lyzy.core.model.STXTFW;
import com.softlab.lyzy.service.STXTService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
@RestController
public class STXTApi {

    private Logger logger =  LoggerFactory.getLogger(this.getClass());

    private final STXTService slsService;

    @Autowired
    public STXTApi(STXTService slsService){
         this.slsService = slsService;
    }


    /**
     * 修改参数
     *
     * @param STXTFW
     * @return
     */
    @PostMapping(value = "/updateSTXT")
    public RestData up(@RequestBody STXTFW STXTFW){
        logger.info("updateSTXT: "+ JsonUtil.getJsonString(STXTFW));
        return new RestData(slsService.updateSLS(STXTFW));
    }

    /**
     * 查询唯一记录
     *
     * @param STXTFW
     * @return
     */

    @RequestMapping(value = "/selectSLS", method = RequestMethod.POST)
    public RestData selectRGL(@RequestBody STXTFW STXTFW) {
        logger.info("selectSLS：" + JsonUtil.getJsonString(STXTFW));
        STXTFW sls = slsService.selectSLS(STXTFW);
        return new RestData(sls);
    }


    /**
     * 共 30 个公式计算（按顺序）
     *
     * gt 调节水量
     * utiao 年调节水量价值
     * usz 净化水质
     * ggt 固土
     * ugt 固土功能价值量
     * gn 保肥 为减少的氮流失量
     * gp 保肥 为减少的磷流失量
     * gk 保肥 为减少的钾流失量
     * ufei 保肥功能价值量
     * gzbgt 固碳释氧实物量评估
     * gtrgt 土壤固碳实物量
     * utan 固碳价值量
     * gy 释氧
     * uy 释氧价值量
     * gflz 生产负离子量
     * uflz 负离子价值量
     * geyhl 吸收污染物
     * ueyhl 二氧化硫价值量
     * gfhw 吸收氟化物量
     * ufu 氟化物价值量
     * gdyhw 吸收氮氧化物量
     * udyhw 氮氧化物价值量
     * gzjs 吸收重金属量
     * uzjs 重金属量价值量
     * gdc 滞 尘
     * uzc 滞尘价值量
     * gd 固氮量
     * gl 固磷量
     * gj 固钾量
     * uyy 林木营养积累价值量
     *
     * @param STXTFW
     * @return
     */


    @PostMapping(value = "/gt")
    public RestData gt(@RequestBody STXTFW STXTFW){
        logger.info("gt: "+ JsonUtil.getJsonString(STXTFW));
        int flag = slsService.updateSLS(STXTFW);
        return new RestData(stxtCalculate.gt(STXTFW));
    }


    @PostMapping(value = "/utiao")
    public RestData utiao(@RequestBody STXTFW STXTFW){
        logger.info("utiao: "+ JsonUtil.getJsonString(STXTFW));
        int flag = slsService.updateSLS(STXTFW);
        return new RestData(stxtCalculate.utiao(STXTFW));
    }


    @PostMapping(value = "/usz")
    public RestData usz(@RequestBody STXTFW STXTFW){
        logger.info("usz: "+ JsonUtil.getJsonString(STXTFW));
        int flag = slsService.updateSLS(STXTFW);
        return new RestData(stxtCalculate.usz(STXTFW));
    }


    @PostMapping(value = "/ggt")
    public RestData ggt(@RequestBody STXTFW STXTFW){
        logger.info("ggt: "+ JsonUtil.getJsonString(STXTFW));
        int flag = slsService.updateSLS(STXTFW);
        return new RestData(stxtCalculate.ggt(STXTFW));
    }


    @PostMapping(value = "/ugt")
    public RestData ugt(@RequestBody STXTFW STXTFW){
        logger.info("ugt: "+ JsonUtil.getJsonString(STXTFW));
        int flag = slsService.updateSLS(STXTFW);
        return new RestData(stxtCalculate.ugt(STXTFW));
    }


    @PostMapping(value = "/gn")
    public RestData gn(@RequestBody STXTFW STXTFW){
        logger.info("gn: "+ JsonUtil.getJsonString(STXTFW));
        int flag = slsService.updateSLS(STXTFW);
        return new RestData(stxtCalculate.gn(STXTFW));
    }


    @PostMapping(value = "/gp")
    public RestData gp(@RequestBody STXTFW STXTFW){
        logger.info("gp: "+ JsonUtil.getJsonString(STXTFW));
        int flag = slsService.updateSLS(STXTFW);
        return new RestData(stxtCalculate.gp(STXTFW));
    }


    @PostMapping(value = "/gk")
    public RestData gk(@RequestBody STXTFW STXTFW){
        logger.info("gk: "+ JsonUtil.getJsonString(STXTFW));
        int flag = slsService.updateSLS(STXTFW);
        return new RestData(stxtCalculate.gk(STXTFW));
    }

    @PostMapping(value = "/ufei")
    public RestData ufei(@RequestBody STXTFW STXTFW){
        logger.info("ufei: "+ JsonUtil.getJsonString(STXTFW));
        int flag = slsService.updateSLS(STXTFW);
        return new RestData(stxtCalculate.ufei(STXTFW));
    }

    @PostMapping(value = "/gzbgt")
    public RestData gzbgt(@RequestBody STXTFW STXTFW){
        logger.info("gzbgt: "+ JsonUtil.getJsonString(STXTFW));
        int flag = slsService.updateSLS(STXTFW);
        return new RestData(stxtCalculate.gzbgt(STXTFW));
    }

    @PostMapping(value = "/gtrgt")
    public RestData gtrgt(@RequestBody STXTFW STXTFW){
        logger.info("gtrgt: "+ JsonUtil.getJsonString(STXTFW));
        int flag = slsService.updateSLS(STXTFW);
        return new RestData(stxtCalculate.gtrgt(STXTFW));
    }

    @PostMapping(value = "/utan")
    public RestData utan(@RequestBody STXTFW STXTFW){
        logger.info("utan: "+ JsonUtil.getJsonString(STXTFW));
        int flag = slsService.updateSLS(STXTFW);
        return new RestData(stxtCalculate.utan(STXTFW));
    }

    @PostMapping(value = "/gy")
    public RestData gy(@RequestBody STXTFW STXTFW){
        logger.info("gy: "+ JsonUtil.getJsonString(STXTFW));
        int flag = slsService.updateSLS(STXTFW);
        return new RestData(stxtCalculate.gy(STXTFW));
    }

    @PostMapping(value = "/uy")
    public RestData uy(@RequestBody STXTFW STXTFW){
        logger.info("uy: "+ JsonUtil.getJsonString(STXTFW));
        int flag = slsService.updateSLS(STXTFW);
        return new RestData(stxtCalculate.uy(STXTFW));
    }

    @PostMapping(value = "/gflz")
    public RestData gflz(@RequestBody STXTFW STXTFW){
        logger.info("gflz: "+ JsonUtil.getJsonString(STXTFW));
        int flag = slsService.updateSLS(STXTFW);
        return new RestData(stxtCalculate.gflz(STXTFW));
    }

    @PostMapping(value = "/uflz")
    public RestData uflz(@RequestBody STXTFW STXTFW){
        logger.info("uflz: "+ JsonUtil.getJsonString(STXTFW));
        int flag = slsService.updateSLS(STXTFW);
        return new RestData(stxtCalculate.uflz(STXTFW));
    }

    @PostMapping(value = "/geyhl")
    public RestData geyhl(@RequestBody STXTFW STXTFW){
        logger.info("geyhl: "+ JsonUtil.getJsonString(STXTFW));
        int flag = slsService.updateSLS(STXTFW);
        return new RestData(stxtCalculate.geyhl(STXTFW));
    }

    @PostMapping(value = "/ueyhl")
    public RestData ueyhl(@RequestBody STXTFW STXTFW){
        logger.info("ueyhl: "+ JsonUtil.getJsonString(STXTFW));
        int flag = slsService.updateSLS(STXTFW);
        return new RestData(stxtCalculate.ueyhl(STXTFW));
    }

    @PostMapping(value = "/gfhw")
    public RestData gfhw(@RequestBody STXTFW STXTFW){
        logger.info("gfhw: "+ JsonUtil.getJsonString(STXTFW));
        int flag = slsService.updateSLS(STXTFW);
        return new RestData(stxtCalculate.gfhw(STXTFW));
    }

    @PostMapping(value = "/ufu")
    public RestData ufu(@RequestBody STXTFW STXTFW){
        logger.info("ufu: "+ JsonUtil.getJsonString(STXTFW));
        int flag = slsService.updateSLS(STXTFW);
        return new RestData(stxtCalculate.ufu(STXTFW));
    }

    @PostMapping(value = "/gdyhw")
    public RestData gdyhw(@RequestBody STXTFW STXTFW){
        logger.info("gdyhw: "+ JsonUtil.getJsonString(STXTFW));
        int flag = slsService.updateSLS(STXTFW);
        return new RestData(stxtCalculate.gdyhw(STXTFW));
    }

    @PostMapping(value = "/udyhw")
    public RestData udyhw(@RequestBody STXTFW STXTFW){
        logger.info("udyhw: "+ JsonUtil.getJsonString(STXTFW));
        int flag = slsService.updateSLS(STXTFW);
        return new RestData(stxtCalculate.udyhw(STXTFW));
    }

    @PostMapping(value = "/gzjs")
    public RestData gzjs(@RequestBody STXTFW STXTFW){
        logger.info("gzjs: "+ JsonUtil.getJsonString(STXTFW));
        int flag = slsService.updateSLS(STXTFW);
        return new RestData(stxtCalculate.gzjs(STXTFW));
    }

    @PostMapping(value = "/uzjs")
    public RestData uzjs(@RequestBody STXTFW STXTFW){
        logger.info("uzjs: "+ JsonUtil.getJsonString(STXTFW));
        int flag = slsService.updateSLS(STXTFW);
        return new RestData(stxtCalculate.uzjs(STXTFW));
    }

    @PostMapping(value = "/gdc")
    public RestData gdc(@RequestBody STXTFW STXTFW){
        logger.info("gdc: "+ JsonUtil.getJsonString(STXTFW));
        int flag = slsService.updateSLS(STXTFW);
        return new RestData(stxtCalculate.gdc(STXTFW));
    }

    @PostMapping(value = "/uzc")
    public RestData uzc(@RequestBody STXTFW STXTFW){
        logger.info("uzc: "+ JsonUtil.getJsonString(STXTFW));
        int flag = slsService.updateSLS(STXTFW);
        return new RestData(stxtCalculate.uzc(STXTFW));
    }

    @PostMapping(value = "/gd")
    public RestData gd(@RequestBody STXTFW STXTFW){
        logger.info("gd: "+ JsonUtil.getJsonString(STXTFW));
        int flag = slsService.updateSLS(STXTFW);
        return new RestData(stxtCalculate.gd(STXTFW));
    }

    @PostMapping(value = "/gl")
    public RestData gl(@RequestBody STXTFW STXTFW){
        logger.info("gl: "+ JsonUtil.getJsonString(STXTFW));
        int flag = slsService.updateSLS(STXTFW);
        return new RestData(stxtCalculate.gl(STXTFW));
    }

    @PostMapping(value = "/gj")
    public RestData gj(@RequestBody STXTFW STXTFW){
        logger.info("gj: "+ JsonUtil.getJsonString(STXTFW));
        int flag = slsService.updateSLS(STXTFW);
        return new RestData(stxtCalculate.gj(STXTFW));
    }

    @PostMapping(value = "/uyy")
    public RestData uyy(@RequestBody STXTFW STXTFW){
        logger.info("uyy: "+ JsonUtil.getJsonString(STXTFW));
        int flag = slsService.updateSLS(STXTFW);
        return new RestData(stxtCalculate.uyy(STXTFW));
    }



}
