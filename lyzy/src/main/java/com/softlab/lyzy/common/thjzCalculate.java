package com.softlab.lyzy.common;

import com.softlab.lyzy.core.model.THJZ;

public class thjzCalculate {

    public static double Q(THJZ thjz){
        return thjz.getC0() * thjz.getP0();
    }

    public static double R(THJZ thjz){
        return thjz.getG() * thjz.getSvd() * thjz.getBef() * thjz.getC1();
    }

    public static double V(THJZ thjz){
        return thjz.getR() * (thjz.getGr() - thjz.getCr()) * thjz.getP1();
    }
}
