package com.easyway.website.cshx.common;

import java.beans.PropertyEditorSupport;

import org.springframework.web.util.HtmlUtils;

public class StringHtmlEscapeEditor extends PropertyEditorSupport {
	public void setAsText(String text) 
	{
		if (text == null) 
		{
			setValue(null);
		}
		else 
		{
			String value = text.trim();
			setValue(HtmlUtils.htmlEscape(value));
		}
	}

	public String getAsText() 
	{
		Object value = getValue();
		return (value != null ? value.toString() : "");
	}
}
