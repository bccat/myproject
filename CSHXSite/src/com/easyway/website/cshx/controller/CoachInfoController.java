package com.easyway.website.cshx.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.easyway.website.cshx.bizmanager.CoachInfoManager;
import com.easyway.website.cshx.common.DataGridResult;
import com.easyway.website.cshx.common.ResponseCode;
import com.easyway.website.cshx.model.po.CoachInfoPo;

@Controller
public class CoachInfoController extends BaseController{
	
	@Autowired
	private CoachInfoManager coachInfomgr;
	
	@RequestMapping("coachinfo")
	@ResponseBody
	public DataGridResult<CoachInfoPo> query(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "city1", required = false) String city1,
			@RequestParam(value = "city2",required = false) String city2,
			@RequestParam(value = "date",required = false) String date) {
		DataGridResult<CoachInfoPo> dg = new DataGridResult<CoachInfoPo>();
		
		CoachInfoPo conditions = new CoachInfoPo();
		conditions.setBoardlocation(city1);
		conditions.setArrstationname(city2);
		conditions.setTraveldate(date);
		List<CoachInfoPo> infos = coachInfomgr.queryCoachInfo(conditions);
		dg.setRows(infos);
		return dg;
	}
	
	@RequestMapping("test")
	@ResponseBody
	public ResponseCode test(HttpServletRequest request, HttpServletResponse response){
		ResponseCode rc =new ResponseCode();
		rc.setMessage(System.getProperty("web.root"));
		return rc;
	}
	
	@RequestMapping("coachquery")
	public String coachquery(HttpServletRequest request, HttpServletResponse response,ModelMap model,	
			@RequestParam(value = "city1", required = false) String city1,
			@RequestParam(value = "city2",required = false) String city2,
			@RequestParam(value = "date",required = false) String date){	
		model.put("city1", city1);
		model.put("city2", city2);
		model.put("date", date);
		return "coachquery";
	}
}
