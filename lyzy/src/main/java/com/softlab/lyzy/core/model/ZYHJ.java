package com.softlab.lyzy.core.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("ziyuanhuanjing")
public class ZYHJ {

    /**
     *LCC土地资源承载力 (人)
     *
     */
    @TableField(exist = false)
    private double lcc;

    /**
     *A为适耕土地的最佳开发规模 (k/m2)
     *
     */
    private double a;

    /**
     *α为复种指数
     *
     */
    private double fzzs;

    /**
     * β为粮作比例
     *
     */
    private double lzbl;

    /**
     * P为粮食单产
     *
     */
    private double p;

    /**
     *  Gp为人均粮食消费标准 (kg/人)
     *
     */

    private double gp;

    /**
     *  Mk为现状人均建设用地规模 (m2/人)
     *
     */
    private double mk;

    /**
     *  mc为适建土地 (适宜作为城镇、农村居民点用地) 的最佳开发规模;
     *
     */
    private double mc;

    /**
     * WCC为水资源承载力
     *
     */
    @TableField(exist = false)
    private double wcc;

    /**
     * W为水资源总量
     *
     */
    private double w;

    /**
     *  Wp 为人均综合用水量
     *
     */
    private double wp;

    /**
     *  Rw为区域水环境承载力
     *
     */
    @TableField(exist = false)
    private double rw;

    /**
     *  Qi为第i功能区的可利用水资源量
     *
     */
    private double qi;

    /**
     * Ci为第i功能区的目标浓度
     *
     */
    private double ci;

    /**
     * k为污染物综合降解系数, 根据河道水质降解系数参考值, 选定COD的综合降解系数为0.02 (1/d)
     *
     */
    private double k;

    /**
     * Ci0为第i功能区污染物的本底浓度, 无监测条件的区域, 该参数假设为0
     *
     */
    private double ci0;

    /**
     * R为区域污水污染物实际排放量
     *
     */
    private double r;

    /**
     * p为区域人口数量
     *
     */
    private double pr;

    /**
     * Wr为大气环境承载人口规模
     *
     */
    @TableField(exist = false)
    private double wr;

    /**
     * q为地理区域总量控制系数, 参照《国家制定地方大气污染物排放标准的技术方法》, 取q=3.64, 单位:km2*104
     *
     */
    private double q;

    /**
     * Cki为国家和地方有关大气环境质量标准所规定的相应区域年日平均浓度限值, 参照《环境空气质量标准》中的二级标准, 各地区的二氧化硫年均值浓度在0.06 mg/m3以内, 因此 =0.060, 单位:mg/m3
     *
     */
    private double cki;

    /**
     * C0为背景浓度, 无监测条件的区域可设置为0
     *
     */
    private double c0;

    /**
     * Si为相应区域面积
     *
     */
    private double si;

    /**
     * S为总量控制面积
     *
     */
    private double s;

    /**
     * Wk为区域大气污染物实际排放量。
     *
     */
    private double wk;

    /**
     *RECC为资源环境承载力
     *
     */
    @TableField(exist = false)
    private double recc;







}
