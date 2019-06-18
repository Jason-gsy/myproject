package com.softlab.lyzy.web.api;

import com.softlab.lyzy.common.renCalculate;
import com.softlab.lyzy.common.util.JsonUtil;
import com.softlab.lyzy.common.util.RestData;
import com.softlab.lyzy.core.model.RGL;
import com.softlab.lyzy.service.RGLService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
@RestController
public class RGLApi {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    private final RGLService rglService;

    @Autowired
    public RGLApi(RGLService rglService) {
        this.rglService = rglService;
    }



    /**
     * 修改参数
     *
     * 若数据库原字段有值，传入null，不改变数据库
     * @param RGL
     * @return
     */
    @RequestMapping(value = "/updateRGL", method = RequestMethod.POST)
    public RestData update(@RequestBody RGL RGL) {
        logger.info("update：" + JsonUtil.getJsonString(RGL));
        int success = rglService.updateRGL(RGL);
        return new RestData(success);
    }



    /**
     * 查询唯一记录
     *
     * @param RGL
     * @return
     */
    @RequestMapping(value = "/selectRGL", method = RequestMethod.POST)
    public RestData selectRGL(@RequestBody RGL RGL) {
        logger.info("selectRGL：" + JsonUtil.getJsonString(RGL));
        RGL rgl = rglService.selectRGL(RGL);
        return new RestData(rgl);
    }


    /**
     * 共 10 个公式计算（按顺序）
     *
     * th2 樟子松林分平均高
     * th3 其他林分平均高
     * sci2 樟子松林分地位级指数
     * sci3 其它林分地位级指数
     * N 每公顷株数
     * sdi 各林分类型的林分密度指数
     * bas2 樟子松林分每公顷断面积
     * bas3 其他林分每公顷断面积
     * vol2 樟子松林分每公顷蓄积量
     * vol3 其他林分每公顷蓄积量
     *
     * @param RGL
     * @return
     */
    @RequestMapping(value = "/th2", method = RequestMethod.POST)
    public RestData th2(@RequestBody RGL RGL) {
        logger.info("TH2: "+ JsonUtil.getJsonString(RGL));
        int success = rglService.updateRGL(RGL);
        return new RestData(renCalculate.Th2(RGL));
    }

    @RequestMapping(value = "/th3", method = RequestMethod.POST)
    public RestData th3(@RequestBody RGL RGL) {
        logger.info("TH3: "+ JsonUtil.getJsonString(RGL));
        int success = rglService.updateRGL(RGL);
        return new RestData(renCalculate.Th3(RGL));
    }

    @RequestMapping(value = "/sci2", method = RequestMethod.POST)
    public RestData sci2(@RequestBody RGL RGL) {
        logger.info("SCI2: "+ JsonUtil.getJsonString(RGL));
        int success = rglService.updateRGL(RGL);
        return new RestData(renCalculate.SCI2(RGL));
    }

    @RequestMapping(value = "/sci3", method = RequestMethod.POST)
    public RestData sci3(@RequestBody RGL RGL) {
        logger.info("SCI3: "+ JsonUtil.getJsonString(RGL));
        int success = rglService.updateRGL(RGL);
        return new RestData(renCalculate.SCI3(RGL));
    }

    @RequestMapping(value = "/N", method = RequestMethod.POST)
    public RestData N(@RequestBody RGL RGL) {
        logger.info("N: "+ JsonUtil.getJsonString(RGL));
        int success = rglService.updateRGL(RGL);
        return new RestData(renCalculate.N(RGL));
    }

    @RequestMapping(value = "/sdi", method = RequestMethod.POST)
    public RestData sdi(@RequestBody RGL RGL) {
        logger.info("SDI: "+ JsonUtil.getJsonString(RGL));
        int success = rglService.updateRGL(RGL);
        return new RestData(renCalculate.SDI(RGL));
    }

    @RequestMapping(value = "/bas2", method = RequestMethod.POST)
    public RestData bas2(@RequestBody RGL RGL) {
        logger.info("BAS2: " + JsonUtil.getJsonString(RGL));
        int success = rglService.updateRGL(RGL);
        double[] ans = rglService.bas2(RGL);
        return new RestData(ans);
    }

    @RequestMapping(value = "/bas3", method = RequestMethod.POST)
    public RestData bas3(@RequestBody RGL RGL) {
        logger.info("BAS3: " + JsonUtil.getJsonString(RGL));
        int success = rglService.updateRGL(RGL);
        double[] ans = rglService.bas3(RGL);
        return new RestData(ans);
    }

    @RequestMapping(value = "/vol2", method = RequestMethod.POST)
    public RestData vol2(@RequestBody RGL RGL) {
        logger.info("VOL2: " + JsonUtil.getJsonString(RGL));
        int success = rglService.updateRGL(RGL);
        double[] ans = rglService.vol2(RGL);
        return new RestData(ans);
    }

    @RequestMapping(value = "/vol3", method = RequestMethod.POST)
    public RestData vol3(@RequestBody RGL RGL) {
        logger.info("VOL3: " + JsonUtil.getJsonString(RGL));
        int success = rglService.updateRGL(RGL);
        double[] ans = rglService.vol3(RGL);
        return new RestData(ans);
    }
}