package com.softlab.lyzy.common;

import com.softlab.lyzy.core.model.SWLGS;

public class swlgsCalculate {


    /**
     * 林木地上生 物 量  与 立 木 材 积之比V ( g / cm 3 或 t / m 3 )就是生物量转换因子（BCF）
     *
     * @param swlgs
     * @return
     */
    public static double bcf1(SWLGS swlgs){
        return 0.89292 * Math.pow(swlgs.getD(), 0.21514) * Math.pow(swlgs.getH(), -0.40100);
    }

    public static double bcf2(SWLGS swlgs){
        return 1.27630 * Math.pow(swlgs.getD(), -0.006815) * Math.pow(swlgs.getH(), -0.40100);
    }


    public static double v1(SWLGS swlgs){
        return 0.07669 * Math.pow(swlgs.getD(), 1.80035) * Math.pow(swlgs.getH(), 0.99246);
    }

    public static double v2(SWLGS swlgs){
        return 0.11426 * Math.pow(swlgs.getD(), 1.55262) * Math.pow(swlgs.getH(), 0.99246);
    }


    /**
     * 林木地下生物量 与地上生物量之比就是根茎比（ RSR）。
     *
     * @param swlgs
     * @return
     */
    public static double rsr1(SWLGS swlgs){
        return 0.64849 * Math.pow(swlgs.getD(), 0.38706) * Math.pow(swlgs.getH(), -0.64126);
    }

    public static double rsr2(SWLGS swlgs){
        return 0.11192 * Math.pow(swlgs.getD(), 1.47865) * Math.pow(swlgs.getH(), -0.64126);
    }
}
