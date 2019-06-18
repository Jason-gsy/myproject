package com.softlab.lyzy.common;

import com.softlab.lyzy.core.model.ZYHJ;

public class zyhjCalculate {

    public static double lcc(ZYHJ zyhj){
        return Math.min(zyhj.getA() * zyhj.getFzzs() * zyhj.getLzbl() * zyhj.getP() / zyhj.getGp(), zyhj.getMc() / zyhj.getMk());
    }

    public static double wcc(ZYHJ zyhj){
        return 0.4 * zyhj.getW() / zyhj.getWp();
    }

    public static double rw(ZYHJ zyhj){
        return (zyhj.getQi() * (zyhj.getCi() - zyhj.getCi0()) + zyhj.getK() * zyhj.getQi() * zyhj.getCi()) / (zyhj.getR() / zyhj.getPr());
    }

    public static double wr(ZYHJ zyhj){
        return (zyhj.getQ() * (zyhj.getCki() * zyhj.getCi0()) * zyhj.getSi() / Math.sqrt(zyhj.getS())) / (zyhj.getWk() / zyhj.getPr());
    }

    public static double recc(ZYHJ zyhj){
        return Math.min(Math.min(zyhj.getLcc(), zyhj.getWcc()), Math.min(zyhj.getRw(), zyhj.getWr()));
    }
}
