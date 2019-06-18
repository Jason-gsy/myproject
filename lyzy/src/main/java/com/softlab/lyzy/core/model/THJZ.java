package com.softlab.lyzy.core.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("thjz")
public class THJZ {

    /**
     * 碳汇量
     *
     */
    private double c0;

    /**
     * 碳汇价格
     *
     */
    private double p0;

    /**
     * 森林蓄积量 (单位:m3)
     *
     */
    private double g;

    /**
     * 基本木材密度 (单位:t/m3)
     *
     */
    private double svd;

    /**
     * 生物量转换系数
     *
     */
    private double bef;

    /**
     * 含碳率, 采用IPCC国家清单指南推荐值0.5
     *
     */
    private double c1;


    /**
     * V为碳汇价值 (单位:元/tC)
     *
     */
    private double v;


    /**
     *  GR为蓄积量生长率
     *
     */
    private double gr;


    /**
     * CR为蓄积量消耗率
     *
     */
    private double cr;


    /**
     * P为单位固碳价值 (单位:元/tC)
     *
     */
    private double p1;


    /**
     * 森林碳储量
     *
     */
    @TableField(exist = false)
    private double r;

}
