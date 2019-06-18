package com.softlab.lyzy.web.api;

import com.softlab.lyzy.common.thjzCalculate;
import com.softlab.lyzy.common.util.JsonUtil;
import com.softlab.lyzy.common.util.RestData;
import com.softlab.lyzy.core.model.THJZ;
import com.softlab.lyzy.service.THJZService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
@RestController
public class THJZApi {

    private Logger logger =  LoggerFactory.getLogger(this.getClass());

    private final THJZService thjzService;

    @Autowired
    public THJZApi(THJZService thjzService){
        this.thjzService = thjzService;
    }


    /**
     * 修改参数
     *
     * @param thjz
     * @return
     */
    @PostMapping(value = "/updateTHJZ")
    public RestData updateTHJZ(@RequestBody THJZ thjz){
        logger.info("updateTHJZ: " + JsonUtil.getJsonString(thjz));
        int flag = thjzService.update(thjz);
        return new RestData(flag);
    }


    /**
     * 共三个公式
     *
     * Q表示森林碳汇的总价值
     * R为森林碳储量 (单位:104/t)
     * V为碳汇价值 (单位:元/tC)
     *
     * @param thjz
     * @return
     */
    @PostMapping(value = "/Q")
    public RestData Q(@RequestBody THJZ thjz){
        logger.info("Q: " + JsonUtil.getJsonString(thjz));
        int flag = thjzService.update(thjz);
        return new RestData(thjzCalculate.Q(thjz));
    }

    @PostMapping(value = "/R")
    public RestData R(@RequestBody THJZ thjz){
        logger.info("R: " + JsonUtil.getJsonString(thjz));
        int flag = thjzService.update(thjz);
        return new RestData(thjzCalculate.R(thjz));
    }

    @PostMapping(value = "/V")
    public RestData V(@RequestBody THJZ thjz){
        logger.info("V: " + JsonUtil.getJsonString(thjz));
        int flag = thjzService.update(thjz);
        return new RestData(thjzCalculate.V(thjz));
    }


}
















//@RequestBody(file,title,content,oppid)

// file, community

