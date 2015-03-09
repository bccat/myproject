package com.easyway.website.cshx.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.easyway.website.cshx.quartz.GetWeatherInfoTask;

@Controller
public class WeatherInfoController extends BaseController {

	@RequestMapping("weatherinfo")
	@ResponseBody
	public String weather(HttpServletRequest request, HttpServletResponse response) {
		return GetWeatherInfoTask.getWeatherInfo();
	}
}
