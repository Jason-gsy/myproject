package com.softlab.lyzy.core.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.softlab.lyzy.core.model.STXTFW;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface STXTMapper extends BaseMapper<STXTFW> {
}
