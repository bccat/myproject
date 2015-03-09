package com.easyway.website.cshx.bizmanager;

import java.util.List;

import net.sf.json.JSONObject;
import net.sf.json.util.JSONUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.easyway.website.cshx.mapper.CoachInfoMapper;
import com.easyway.website.cshx.model.po.CoachInfoPo;

@Component
public class CoachInfoManager {
	
	@Autowired
	private CoachInfoMapper coachInfoMapper;
	
	public List<CoachInfoPo> queryCoachInfo(CoachInfoPo conditions) {
		return  coachInfoMapper.query(conditions);
	}
}
