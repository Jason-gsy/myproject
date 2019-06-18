package com.softlab.lyzy.common;

import com.softlab.lyzy.core.model.RGL;

public class renCalculate {

    public  static double Th2(RGL RGL){//樟子松人工林地位级指数导向曲线
        return RGL.getA() * (Math.exp(RGL.getK() * (-1) / RGL.getT()));
    }

    public  static double SCI2(RGL RGL){//樟子松人工林地位级指数
        return RGL.getTh2() * Math.exp((-1) * RGL.getK() * (1 / RGL.getTI() - 1 / RGL.getT()));
    }

    public static double Th3(RGL RGL){//其它林分类型的地位级指数导向曲线
        return RGL.getA() * Math.pow(1 - Math.exp((-1) * RGL.getK() * RGL.getT()) , RGL.getC0());
    }

    public static double SCI3(RGL RGL){//其它林分类型的地位级指数
        return RGL.getTh3() * (Math.pow(1 - Math.exp((-1) * RGL.getK() * RGL.getTI()), RGL.getC0()) / Math.pow(1 - Math.exp((-1) * RGL.getK() * RGL.getT()) , RGL.getC0()));
    }

    public static double N(RGL RGL){//各林分类型最大密度方程
        return RGL.getJj() * Math.pow(RGL.getDg(), (-1) * RGL.getXl());
    }

    public static double SDI(RGL RGL){//各林分类型的林分密度指数
        return RGL.getN() * Math.pow(RGL.getD0() / RGL.getDg(), (-1) * RGL.getXl());
    }

    public static double BAS2(RGL RGL){//樟子松各林分类型每公顷断面积预估模型
        return RGL.getA0() * Math.pow(RGL.getSci2(), RGL.getA1()) * Math.pow(1 - Math.exp((-1) * RGL.getK0() * Math.pow(RGL.getSdi() / 10000, RGL.getK1()) * (RGL.getT() - RGL.getT0())), RGL.getC1());
    }

    public static double VOL2(RGL RGL){//樟子松各林分类型每公顷蓄积量预估模型
        return RGL.getBas2() * RGL.getTh2() * (RGL.getD0()/ RGL.getTh2() + RGL.getD1());
    }

    public static double BAS3(RGL RGL){//各林分类型每公顷断面积预估模型
        return RGL.getA0() * Math.pow(RGL.getSci3(), RGL.getA1()) * Math.pow(1 - Math.exp((-1) * RGL.getK0() * Math.pow(RGL.getSdi() / 10000, RGL.getK1()) * (RGL.getT() - RGL.getT0())), RGL.getC1());
    }

    public static double VOL3(RGL RGL){//各林分类型每公顷蓄积量预估模型
        return BAS3(RGL) * RGL.getTh3() * (RGL.getD0()/ RGL.getTh3() + RGL.getD1());
    }

}
