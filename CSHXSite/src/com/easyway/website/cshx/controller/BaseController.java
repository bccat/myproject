package com.easyway.website.cshx.controller;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import com.easyway.website.cshx.common.StringHtmlEscapeEditor;

public abstract class BaseController implements IController {
	protected final static String REDIRECT = "redirect:";
	protected final static String FORWARD = "forward:";
	
    @InitBinder
	public void initBinder(WebDataBinder binder){
		binder.registerCustomEditor(String.class, new StringHtmlEscapeEditor());
	}
}
