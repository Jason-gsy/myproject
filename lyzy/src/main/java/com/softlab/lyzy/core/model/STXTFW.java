package com.softlab.lyzy.core.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Created by LiXiwen on 2019/5/8 15:38.
 **/

@Data
@TableName("slstxtfwgnpg")
public class STXTFW {

    /**
     * 林分面积
     */
    @TableField(value = "a")
    private double a;
    /**
     * 降水量
     */
    @TableField(value = "p")
    private double p;

    /**
     * 林分蒸散量
     */
    @TableField(value = "e")
    private double e;

    /**
     * 地表径流量
     */
    @TableField(value = "c")
    private double c;

    /**
     * C库
     */
    @TableField(value = "ck")
    private double ck;

    /**
     * 水的净化费用
     */
    @TableField(value = "k")
    private double k;

    /**
     * 林地土壤侵蚀模数
     */
    @TableField(value = "x1")
    private double x1;

    /**
     * 无林地土壤侵蚀模数
     */
    @TableField(value = "x2")
    private double x2;

    /**
     * C土
     */
    @TableField(value = "ct")
    private double ct;

    /**
     *ρ 为林地土壤容重
     */
    @TableField(value = "rz")
    private double rz;

    /**
     * 为减少的氮流失量
     */
    @TableField(value = "gn")
    private double gn;

    /**
     * 为减少的磷流失量
     */
    @TableField(value = "gp")
    private double gp;

    /**
     * 为减少的钾流失量
     */
    @TableField(value = "gk")
    private double gk;

    /**
     * 为土壤含氮量
     */
    private double n;

    /**
     * 土壤含磷量
     */
    private double p2;

    /**
     * 土壤含钾量
     */
    private double k2;

    /**
     * 林分土壤平均含氮量
     */
    private double n2;

    /**
     * 为林分土壤平均含磷量
     */
    private double p3;

    /**
     * 林分土壤含钾量
     */
    private double k3;

    /**
     * 林分土壤有机质含量
     */
    private double m;

    /**
     * 为磷酸二铵化肥含氮量
     */
    private double r1;

    /**
     * 为磷酸二铵化肥含磷量
     */
    private double r2;

    /**
     * 为氯化钾化肥含钾量
     */
    private double r3;

    /**
     * 为磷酸二铵化肥价格
     */
    private double c1;

    /**
     * 为氯化钾化肥价格
     */

    private double c2;

    /**
     * 为有机质价格
     */
    private double c3;

    /**
     * 为CO 2 中碳的含量， 为 27.27%；
     */
    private double rt;

    /**
     * 为林分净生产力
     */
    private double bn;

    /**
     * 为单位面积林分土壤年固碳量，
     */
    private double ftr;

    /**
     * 固碳价格
     */
    private double ct3;

    /**
     * 为单位面积林分土壤年固碳量
     */
    private double ftrt;

    /**
     * 为氧气价格
     */
    private double cy;

    /**
     * Q 负离子 为林分负离子浓度
     */
    private double qflz;

    /**
     * H为林分高度
     */
    private double h;

    /**
     * L为负离子寿命
     */
    private double l;

    /**
     * 为负离子生产费用，
     */
    private double kflz;

    /**
     * 为单位面积林分吸收二氧化硫量
     */
    private double qso2;

    /**
     * 为二氧化硫治理费用
     */
    private double kso2;

    /**
     * 为单位面积林分吸收氟化物量
     */
    private double qfhw;

    /**
     * 为氟化物治理费用
     */
    private double kfhw;

    /**
     * 为单位面积林分年吸收氮氧化物量
     */
    private double qdyhw;

    /**
     * 为氮氧化物治理费用
     */
    private double kdyhw;

    /**
     * 为单位面积林分年吸收重金属量
     */
    private double qzjs;

    /**
     * 为重金属污染治理费用， 单
     */
    private double kzjs;

    /**
     * 为林分年滞尘量
     */
    private double qzc;

    /**
     * 为降尘清理费用
     */
    private double kzc;

    /**
     * 为林分固氮量
     */
    private double gd;

    /**
     * 为林分固磷量
     */
    private double gl;

    /**
     * 为林分固钾量
     */
    private double gj;

    /**
     * 为林木氮元素含量
     */
    private double nyy;

    /**
     * 为林木磷元素含量'
     */
    private double pyy;

    /**
     * 为林木钾元素含量
     */
    private double kyy;
}
