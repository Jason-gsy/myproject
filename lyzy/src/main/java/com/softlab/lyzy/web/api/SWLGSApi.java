package com.softlab.lyzy.web.api;

import com.softlab.lyzy.common.swlgsCalculate;
import com.softlab.lyzy.common.util.JsonUtil;
import com.softlab.lyzy.common.util.RestData;
import com.softlab.lyzy.core.model.SWLGS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
@RestController
public class SWLGSApi {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 生物量转换因子函数
     * @param swlgs
     * @return
     */
    @PostMapping(value = "/BCF")
    public RestData BCF(@RequestBody SWLGS swlgs){
        if (swlgs.getD() >= 5.0){
            return new RestData(swlgsCalculate.bcf1(swlgs));
        }
        return new RestData(swlgsCalculate.bcf2(swlgs));
    }


    @PostMapping(value = "/CJ")
    public RestData CJ(@RequestBody SWLGS swlgs){
        if (swlgs.getD() >= 5.0){
            return new RestData(swlgsCalculate.v1(swlgs));
        }
        return new RestData(swlgsCalculate.v2(swlgs));
    }


    /**
     * 根茎比函数
     *
     * @param swlgs
     * @return
     */
    @PostMapping(value = "/RSR")
    public RestData RSR(@RequestBody SWLGS swlgs){
        logger.info("SWLGS:" + JsonUtil.getJsonString(swlgs));
        if (swlgs.getD() >= 5.0){
            return new RestData(swlgsCalculate.rsr1(swlgs));
        }
        return new RestData(swlgsCalculate.rsr2(swlgs));
    }
}
