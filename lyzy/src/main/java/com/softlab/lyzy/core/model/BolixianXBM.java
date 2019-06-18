package com.softlab.lyzy.core.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;


/**
 * Created by LiXiwen on 2019/4/18 20:24.
 **/

@Data
@TableName("bolixian_xbm2017")
public class BolixianXBM {

    @TableField(value = "GJGYL_BHDJ")
    private String GJGYLBHDJ;

    @TableField (value = "ID")
    private String ID;

    @TableField(value = "DCDW")
    private String DCDW;

    @TableField(value = "LCDWDM")
    private String LCDWDM;

    @TableField(value = "DCY")
    private String DCY;

    @TableField(value = "LB")
    private Integer LB;

    @TableField(value = "LZQ")
    private String LZQ;

    @TableField(value = "XB")
    private Integer XB;

    @TableField(value = "TD_SUOYQ")
    private String TDSUOYQ;

    @TableField(value = "LM_SHIYQ")
    private String LMSHIYQ;

    @TableField(value = "TD_SHIYQ")
    private String TDSHIYQ;

    @TableField(value = "LM_SUOYQ")
    private String LMSUOYQ;

    @TableField(value = "Z_FLLX")
    private String ZFLLX;

    @TableField(value = "SQDJ")
    private String SQDJ;

    @TableField(value = "BHDJ")
    private String BHDJ;

    @TableField(value = "Z_GCLB")
    private String ZGCLB;

    @TableField(value = "Z_DL")
    private String ZDL;

    @TableField(value = "Z_LZ")
    private String ZLZ;

    @TableField(value = "Z_QY")
    private String ZQY;

    @TableField(value = "Z_CZMD")
    private Integer ZCZMD;

    @TableField(value = "Z_CZMD")
    private Integer ZZLND;

    @TableField(value = "JHND")
    private String JHND;

    @TableField(value = "Z_MGQZS")
    private Integer ZMGQZS;

    @TableField(value = "Z_YBD")
    private String ZYBD;

    @TableField(value = "Z_SMD")
    private String ZSMD;

    @TableField(value = "Z_ZGD")
    private Integer ZZGD;

    @TableField(value = "Z_SCJD")
    private String ZSCJD;

    @TableField(value = "Z_ZRD")
    private String ZZRD;

    @TableField(value = "LFG")
    private Double LFG;

    @TableField(value = "KJD")
    private String KJD;

    @TableField(value = "CCLDJ")
    private String CCLDJ;

    @TableField(value = "YS_SG1")
    private Double YSSG1;

    @TableField(value = "YS_ZJ2")
    private Double YSZJ1;

    @TableField(value = "YS_SG2")
    private Double YSSG2;

    @TableField(value = "YS_ZJ2")
    private Double YSZJ2;

    @TableField(value = "YS_SG3")
    private Double YSSG3;

    @TableField(value = "YS_ZJ3")
    private Double YSZJ3;

    @TableField(value = "SS_SZ1")
    private String SSSZ1;

    @TableField(value = "SS_ZJ1")
    private Double SSZJ1;

    @TableField(value = "SS_SG1")
    private Double SSSG1;

    @TableField(value = "SS_ZS1")
    private Integer SSZS1;

    @TableField(value = "SS_SZ2")
    private String SSSZ2;

    @TableField(value = "SS_ZJ2")
    private Double SSZJ2;

    @TableField(value = "SS_SG2")
    private Double SSSG2;

    @TableField(value = "SS_ZS2")
    private Integer SSZS2;

    @TableField(value = "KD_SZ1")
    private String KDSZ1;

    @TableField(value = "KD_ZJ1")
    private Double KDZJ1;

    @TableField(value = "KD_SG1")
    private Double KDSG1;

    @TableField(value = "KD_ZS1")
    private Integer KDZS1;

    @TableField(value = "KD_SZ2")
    private String KDSZ2;

    @TableField(value = "KD_ZJ2")
    private Double KDZJ2;

    @TableField(value = "KD_SG2")
    private Double KDSG2;

    @TableField(value = "KD_ZS2")
    private Integer KDZS2;

    @TableField(value = "KL_SZ1")
    private String KLSZ1;

    @TableField(value = "KL_ZJ1")
    private Double KLZJ1;

    @TableField(value = "KL_SG1")
    private Double KLSG1;

    @TableField(value = "KL_ZS1")
    private Integer KLZS1;

    @TableField(value = "KL_SZ2")
    private String KLSZ2;

    @TableField(value = "KL_ZJ2")
    private Double KLZJ2;

    @TableField(value = "KL_SG2")
    private Double KLSG2;

    @TableField(value = "KL_ZS2")
    private Integer KLZS2;

    @TableField(value = "SP_SZ1")
    private String SPSZ1;

    @TableField(value = "SP_ZJ1")
    private Double SPZJ1;

    @TableField(value = "SP_SG1")
    private Double SPSG1;

    @TableField(value = "SP_ZS1")
    private Integer SPZS1;

    @TableField(value = "SP_SZ2")
    private String SPSZ2;

    @TableField(value = "SP_ZJ2")
    private Double SPZJ2;

    @TableField(value = "SP_SG2")
    private Double SPSG2;

    @TableField(value = "SP_ZS2")
    private Integer SPZS2;

    @TableField(value = "XM_ZGD")
    private Integer XMZGD;

    @TableField(value = "XM_MC1")
    private String XMMC1;

    @TableField(value = "XM_MC2")
    private String XMMC2;

    @TableField(value = "XM_MC3")
    private String XMMC3;

    @TableField(value = "XM_MC4")
    private String XMMC4;

    @TableField(value = "DB_ZGD")
    private Integer DBZGD;

    @TableField(value = "DB_MC1")
    private String DBMC1;

    @TableField(value = "DB_MC2")
    private String DBMC2;

    @TableField(value = "DB_MC3")
    private String DBMC3;

    @TableField(value = "DB_MC4")
    private String DBMC4;

    @TableField(value = "T_SZ1")
    private String TSZ1;

    @TableField(value = "T_MG1")
    private Double TMG1;

    @TableField(value = "T_DJ1")
    private Double TDJ1;

    @TableField(value = "T_FB1")
    private String TFB1;

    @TableField(value = "T_ZS1")
    private Integer TZS1;

    @TableField(value = "T_ZHS1")
    private String TZHS1;

    @TableField(value = "T_SZ2")
    private String T_SZ2;

    @TableField(value = "T_MG2")
    private Double TMG2;

    @TableField(value = "T_DJ2")
    private Double TDJ2;

    @TableField(value = "T_FB2")
    private String TFB2;

    @TableField(value = "T_ZS2")
    private Integer TZS2;

    @TableField(value = "T_ZHS2")
    private String TZHS2;

    @TableField(value = "HZ_MJBZ")
    private Integer HZMJBZ;

    @TableField(value = "HZ_SSXJ")
    private Integer HZSSXJ;

    @TableField(value = "HZ_FSSJ")
    private String HZFSSJ;

    @TableField(value = "BH_SZ1")
    private String BHSZ1;

    @TableField(value = "BH_ZL1")
    private String BHZL1;

    @TableField(value = "BH_SZ2")
    private String BHSZ2;

    @TableField(value = "BH_SHCD1")
    private String BHSHCD1;

    @TableField(value = "BH_ZL2")
    private String BHZL2;

    @TableField(value = "BH_SHCD2")
    private String BHSHCD2;

    @TableField(value = "CH_SZ1")
    private String CHSZ1;

    @TableField(value = "CH_ZL1")
    private String CHZL1;

    @TableField(value = "CH_SHCD1")
    private String CHSHCD1;

    @TableField(value = "CH_SZ2")
    private String CHSZ2;

    @TableField(value = "CH_ZL2")
    private String CHZL2;

    @TableField(value = "CH_SHCD2")
    private String CHSHCD2;

    @TableField(value = "LD_DM")
    private String LDDM;

    @TableField(value = "LD_PW")
    private String LDPW;

    @TableField(value = "LD_PX")
    private String LDPX;

    @TableField(value = "LD_PD")
    private Integer LDPD;

    @TableField(value = "LD_A1HD")
    private Integer LDA1HD;

    @TableField(value = "LD_ABHD")
    private Integer LDABHD;

    @TableField(value = "LD_TRMC")
    private String LDTRMC;

    @TableField(value = "HAI_BA")
    private Integer HAIBA;

    @TableField(value = "CS1")
    private Integer CS1;

    @TableField(value = "CS2")
    private Integer CS2;

    @TableField(value = "CS3")
    private Integer CS3;

    @TableField(value = "CS4")
    private Integer CS4;

    @TableField(value = "CS5")
    private Integer CS5;

    @TableField(value = "CS6")
    private Integer CS6;

    @TableField(value = "CS7")
    private Integer CS7;

    @TableField(value = "CS8")
    private Integer CS8;

    @TableField(value = "CS9")
    private Integer CS9;

    @TableField(value = "CS10")
    private Integer CS10;

    @TableField(value = "SZ1")
    private String SZ1;

    @TableField(value = "SZ2")
    private String SZ2;

    @TableField(value = "SZ3")
    private String SZ3;

    @TableField(value = "SZ4")
    private String SZ4;

    @TableField(value = "SZ5")
    private String SZ5;

    @TableField(value = "SZ6")
    private String SZ6;

    @TableField(value = "SZ7")
    private String SZ7;

    @TableField(value = "SZ8")
    private String SZ8;

    @TableField(value = "SZ9")
    private String SZ9;

    @TableField(value = "SZ10")
    private String SZ10;

    @TableField(value = "NL1")
    private Integer NL1;

    @TableField(value = "NL2")
    private Integer NL2;

    @TableField(value = "NL3")
    private Integer NL3;

    @TableField(value = "NL4")
    private Integer NL4;

    @TableField(value = "NL5")
    private Integer NL5;

    @TableField(value = "NL6")
    private Integer NL6;

    @TableField(value = "NL7")
    private Integer NL7;

    @TableField(value = "NL8")
    private Integer NL8;

    @TableField(value = "NL9")
    private Integer NL9;

    @TableField(value = "NL10")
    private Integer NL10;

    @TableField(value = "ZJ1")
    private Double ZJ1;

    @TableField(value = "ZJ2")
    private Double ZJ2;

    @TableField(value = "ZJ3")
    private Double ZJ3;

    @TableField(value = "ZJ4")
    private Double ZJ4;

    @TableField(value = "ZJ5")
    private Double ZJ5;

    @TableField(value = "ZJ6")
    private Double ZJ6;

    @TableField(value = "ZJ7")
    private Double ZJ7;

    @TableField(value = "ZJ8")
    private Double ZJ8;

    @TableField(value = "ZJ9")
    private Double ZJ9;

    @TableField(value = "ZJ10")
    private Double ZJ10;

    @TableField(value = "SG1")
    private Double SG1;

    @TableField(value = "SG2")
    private Double SG2;

    @TableField(value = "SG3")
    private Double SG3;

    @TableField(value = "SG4")
    private Double SG4;

    @TableField(value = "SG5")
    private Double SG5;

    @TableField(value = "SG6")
    private Double SG6;

    @TableField(value = "SG7")
    private Double SG7;

    @TableField(value = "SG8")
    private Double SG8;

    @TableField(value = "SG9")
    private Double SG9;

    @TableField(value = "SG10")
    private Double SG10;

    @TableField(value = "ZS1")
    private Integer ZS1;

    @TableField(value = "ZS2")
    private Integer ZS2;

    @TableField(value = "ZS3")
    private Integer ZS3;

    @TableField(value = "ZS4")
    private Integer ZS4;

    @TableField(value = "ZS5")
    private Integer ZS5;

    @TableField(value = "ZS6")
    private Integer ZS6;

    @TableField(value = "ZS7")
    private Integer ZS7;

    @TableField(value = "ZS8")
    private Integer ZS8;

    @TableField(value = "ZS9")
    private Integer ZS9;

    @TableField(value = "ZS10")
    private Integer ZS10;

    @TableField(value = "TU_DI_THLX")
    private String TUDITHLX;

    @TableField(value = "SHA_HUA_LX")
    private String SHAHUALX;

    @TableField(value = "SHI_DI_LX")
    private String SHIDILX;

    @TableField(value = "BIANH_YY")
    private String BIANHYY;

    @TableField(value = "BIANH_ND")
    private String BIANHND;

    @TableField(value = "BG_DCND")
    private Integer BGDCND;

    @TableField(value = "LIND_CD")
    private Integer LINDCD;

    @TableField(value = "LIND_KD")
    private Integer LINDKD;

    @TableField(value = "ZDGNQ")
    private String ZDGNQ;

    @TableField(value = "TUBAN_LX")
    private String TUBANLX;

    @TableField(value = "LYGNFQ")
    private String LYGNFQ;

    @TableField(value = "QLJG")
    private String QLJG;

    @TableField(value = "TRGXDJ")
    private String TRGXDJ;

    @TableField(value = "YUNS_JL")
    private String YUNSJL;

    @TableField(value = "LDBHDJ")
    private String LDBHDJ;

    @TableField(value = "YSSZZ")
    private String YSSZZ;

    @TableField(value = "YSSZ")
    private String YSSZ;

    @TableField(value = "LJ")
    private String LJ;

    @TableField(value = "LZ")
    private String LZ;

    @TableField(value = "DVJ")
    private String DVJ;

    @TableField(value = "JYCS")
    private String JYCS;

    @TableField(value = "LDLX")
    private String LDLX;

    @TableField(value = "LDZLDJ")
    private String LDZLDJ;

    @TableField(value = "MGQXJ")
    private Double MGQXJ;

    @TableField(value = "SPXJ")
    private Double SPXJ;

    @TableField(value = "KLXJ")
    private Double KLXJ;

    @TableField(value = "SSMXJ")
    private Double SSMXJ;

    @TableField(value = "KDMXJ")
    private Double KDMXJ;

    @TableField(value = "XBMJ")
    private Double XBMJ;

    @TableField(value = "SFBC")
    private String SFBC;

    @TableField(value = "GHHZFS")
    private String GHHZFS;

    @TableField(value = "GHSSND")
    private Integer GHSSND;

    @TableField(value = "GHSZ")
    private String GHSZ;

    @TableField(value = "GHLZ")
    private String GHLZ;

    @TableField(value = "GHGCLB")
    private String GHGCLB;

    @TableField(value = "DIE_BEI")
    private String DIEBEI;

    @TableField(value = "LINCHANG")
    private String LINCHANG;

    @TableField(value = "GCLB_ZHD")
    private String GCLBZHD;

    @TableField(value = "BEI_ZHU")
    private String BEIZHU;

    @TableField(value = "LDGLBM")
    private String LDGLBM;

    @TableField(value = "LD_TRZD")
    private String LDTRZD;

    @TableField(value = "LD_SSHL")
    private Integer LDSSHL;

    @TableField(value = "LD_KLHD")
    private Integer LDKLHD;

    @TableField(value = "LD_LY")
    private String LDLY;

    @TableField(value = "LD_DMQY")
    private String LDDMQY;

    @TableField(value = "XB2016")
    private Integer XB2016;

    @TableField(value = "X")
    private Integer X;

    @TableField(value = "Y")
    private Integer Y;

    @TableField(value = "XB2017")
    private Integer XB2017;

    @TableField(value = "ID_LIANG")
    private Integer IDLIANG;

    @TableField(value = "SHAPE_AREA")
    private Double SHAPEAREA;

    @TableField(value = "SHAPE_LENG")
    private Double SHAPELENG;

    @TableField(value = "Q_LCDWDM")
    private String QLCDWDM;

    @TableField(value = "Q_LB")
    private Integer QLB;

    @TableField(value = "Q_XB")
    private Integer QXB;

    @TableField(value = "Q_TD_SUOYQ")
    private String QTDSUOYQ;

    @TableField(value = "Q_FLLX")
    private String QFLLX;

    @TableField(value = "Q_SQDJ")
    private String QSQDJ;

    @TableField(value = "Q_BH_DJ")
    private String QBHDJ;

    @TableField(value = "Q_GCLB")
    private String QGCLB;

    @TableField(value = "Q_DL")
    private String QDL;

    @TableField(value = "Q_LZ")
    private String QLZ;

    @TableField(value = "Q_LDBHDJ")
    private String QLDBHDJ;

    @TableField(value = "逻辑错误")
    private String 逻辑错误;

    @TableField(value = "SHI")
    private String SHI;

    @TableField(value = "SHI_NAME")
    private String SHINAME;

    @TableField(value = "XIAN")
    private String XIAN;

    @TableField(value = "XIAN_NAME")
    private String XIANNAME;

    @TableField(value = "XIANG")
    private String XIANG;

    @TableField(value = "XIANG_NAME")
    private String XIANGNAME;

    @TableField(value = "CUN")
    private String CUN;

    @TableField(value = "CUN_NAME")
    private String CUN_NAME;

    @TableField(value = "GLLX")
    private String GLLX;

    @TableField(exist = false)
    private Double sum;

}
