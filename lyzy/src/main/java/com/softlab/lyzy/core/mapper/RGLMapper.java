package com.softlab.lyzy.core.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.softlab.lyzy.core.model.RGL;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RGLMapper extends BaseMapper<RGL> {
}
