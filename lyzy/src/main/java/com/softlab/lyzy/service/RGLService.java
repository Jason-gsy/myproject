package com.softlab.lyzy.service;

import com.softlab.lyzy.core.model.RGL;


public interface RGLService {

    int updateRGL(RGL rgl);

    RGL selectRGL(RGL rgl);

    double[] bas2(RGL rgl);

    double[] bas3(RGL rgl);

    double[] vol2(RGL rgl);

    double[] vol3(RGL rgl);

}
