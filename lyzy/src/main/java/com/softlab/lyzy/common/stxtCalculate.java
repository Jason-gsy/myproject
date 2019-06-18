package com.softlab.lyzy.common;

import com.softlab.lyzy.core.model.STXTFW;


public class stxtCalculate {

    public static double gt(STXTFW STXTFW){//调节水量
        return 10 * STXTFW.getA() * (STXTFW.getP() - STXTFW.getE() - STXTFW.getC());
    }

    public static double utiao(STXTFW STXTFW){//年调节水量价值
        return 10 * STXTFW.getCk() * STXTFW.getA() * (STXTFW.getP() - STXTFW.getE() - STXTFW.getC());
    }

    public static double usz(STXTFW STXTFW){//净化水质
        return 10 * STXTFW.getK() * STXTFW.getA() * (STXTFW.getP() - STXTFW.getE() - STXTFW.getC());
    }

    public static double ggt(STXTFW STXTFW){//固土
        return 10 * STXTFW.getA() * (STXTFW.getX2() - STXTFW.getX1());
    }

    public static double ugt(STXTFW STXTFW){//固土功能价值量
        return STXTFW.getA() * STXTFW.getCt() * (STXTFW.getX2() - STXTFW.getX1());
    }

    public static double gn(STXTFW STXTFW){//保肥 为减少的氮流失量
        return STXTFW.getA() * STXTFW.getN() * (STXTFW.getX2() - STXTFW.getX1());
    }

    public static double gp(STXTFW STXTFW){//保肥 为减少的磷流失量
        return STXTFW.getA() * STXTFW.getP2() * (STXTFW.getX2() - STXTFW.getX1());
    }

    public static double gk(STXTFW STXTFW){//保肥 为减少的钾流失量
        return STXTFW.getA() * STXTFW.getK2() * (STXTFW.getX2() - STXTFW.getX1());
    }

    public static double ufei(STXTFW STXTFW){//保肥功能价值量
        return STXTFW.getA() * (STXTFW.getX2() - STXTFW.getX1()) * (STXTFW.getN2() * STXTFW.getC1()/ STXTFW.getR1() + STXTFW.getP3() * STXTFW.getC1() / STXTFW.getR2() + STXTFW.getK3() * STXTFW.getC2() / STXTFW.getR3() + STXTFW.getM() * STXTFW.getC3());
    }

    public static double gzbgt(STXTFW STXTFW){//固碳释氧实物量评估
        return 1.63 * STXTFW.getRt() * STXTFW.getA() * STXTFW.getBn();
    }

    public static double gtrgt(STXTFW STXTFW){//土壤固碳实物量
        return STXTFW.getA() * STXTFW.getFtr();
    }

    public static double utan(STXTFW STXTFW){//固碳价值量
        return STXTFW.getA() * STXTFW.getCt() * (1.63 * STXTFW.getRt() * STXTFW.getBn() + STXTFW.getFtrt());
    }

    public static double gy(STXTFW STXTFW){//释氧
        return 1.91 * STXTFW.getA() * STXTFW.getBn();
    }

    public static double uy(STXTFW STXTFW){//释氧价值量
        return 1.19 * STXTFW.getCy() * STXTFW.getA() * STXTFW.getBn();
    }

    public static double gflz(STXTFW STXTFW){//生产负离子量
        return 5.256 * Math.pow(10, 15) * STXTFW.getQflz() * STXTFW.getA() * STXTFW.getH();
    }

    public static double uflz(STXTFW STXTFW){//负离子价值量
        return 5.256 * Math.pow(10, 15) * STXTFW.getA() * STXTFW.getH() * STXTFW.getKflz() * (STXTFW.getQflz() - 600);
    }

    public static double geyhl(STXTFW STXTFW){//吸收污染物
        return STXTFW.getQso2() * STXTFW.getA();
    }

    public static double ueyhl(STXTFW STXTFW){//二氧化硫价值量
        return STXTFW.getKso2() * STXTFW.getQso2() * STXTFW.getA();
    }

    public static double gfhw(STXTFW STXTFW){//吸收氟化物量
        return STXTFW.getQfhw() * STXTFW.getA();
    }

    public static double ufu(STXTFW STXTFW){//氟化物价值量
        return STXTFW.getKfhw() * STXTFW.getQfhw() * STXTFW.getA();
    }

    public static double gdyhw(STXTFW STXTFW){//吸收氮氧化物量
        return STXTFW.getQdyhw() * STXTFW.getA();
    }

    public static double udyhw(STXTFW STXTFW){//氮氧化物价值量
        return STXTFW.getKdyhw() * STXTFW.getQdyhw() * STXTFW.getA();
    }

    public static double gzjs(STXTFW STXTFW){//吸收重金属量
        return STXTFW.getQzjs() * STXTFW.getA();
    }

    public static double uzjs(STXTFW STXTFW){//重金属量价值量
        return STXTFW.getKzjs() * STXTFW.getQzjs() * STXTFW.getA();
    }

    public static double gdc(STXTFW STXTFW){//滞 尘
        return STXTFW.getQzc() * STXTFW.getA();
    }

    public static double uzc(STXTFW STXTFW){//滞尘价值量
        return STXTFW.getKzc() * STXTFW.getQzc() * STXTFW.getA();
    }

    public static double gd(STXTFW STXTFW){//固氮量
        return STXTFW.getA() * STXTFW.getNyy() * STXTFW.getBn();
    }

    public static double gl(STXTFW STXTFW){//固磷量
        return STXTFW.getA() * STXTFW.getPyy() * STXTFW.getBn();
    }

    public static double gj(STXTFW STXTFW){//固钾量
        return STXTFW.getA() * STXTFW.getKyy() * STXTFW.getBn();
    }

    public static double uyy(STXTFW STXTFW){//林木营养积累价值量
        return STXTFW.getA() * STXTFW.getBn() * (STXTFW.getNyy() * STXTFW.getC1() / STXTFW.getR1() + STXTFW.getPyy() * STXTFW.getC1() / STXTFW.getR2() + STXTFW.getKyy() * STXTFW.getC3() / STXTFW.getR3());
    }




}
