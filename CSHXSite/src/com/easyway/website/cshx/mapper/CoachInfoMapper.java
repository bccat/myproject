package com.easyway.website.cshx.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.easyway.website.cshx.model.po.CoachInfoPo;

public interface CoachInfoMapper {
	public List<CoachInfoPo> query(@Param("conditions") CoachInfoPo conditions);
}
