package com.softlab.lyzy.core.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.validation.constraints.NotNull;


@Data
@TableName("renGongLin")
public class RGL{

    @TableId(value = "type")
    private String type;

    @TableField(value = "a")
    private Double a;

    @TableField(value = "k")
    private Double k;

    @TableField(value = "c_0")
    private Double c0;

    @TableField(value = "tI")
    private Double tI;

    @TableField(value = "D0")
    private Double D0;

    @TableField(value = "Dg")
    private Double Dg;

    @TableField(value = "jj")
    private Double jj;

    @TableField(value = "xl")
    private Double xl;

    @TableField(value = "a_0")
    private Double a0;

    @TableField(value = "a_1")
    private Double a1;

    @TableField(value = "k_0")
    private Double k0;

    @TableField(value = "k_1")
    private Double k1;

    @TableField(value = "c_1")
    private Double c1;

    @TableField(value = "d_0")
    private Double d0;

    @TableField(value = "d_1")
    private Double d1;

    @TableField(value = "t0")
    private Double t0;

    @TableField(exist = false)
    private Double t;

    @TableField(exist = false)
    private Double th2;

    @TableField(exist = false)
    private Double th3;

    @TableField(exist = false)
    private Double sci2;

    @TableField(exist = false)
    private Double sci3;

    @TableField(exist = false)
    private Double N;

    @TableField(exist = false)
    private Double sdi;

    @TableField(exist = false)
    private Double bas2;

    @TableField(exist = false)
    private Double bas3;
}
