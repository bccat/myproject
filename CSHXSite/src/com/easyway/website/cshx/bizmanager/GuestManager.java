package com.easyway.website.cshx.bizmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.easyway.website.cshx.mapper.GuestMapper;

@Component
public class GuestManager {
	
	@Autowired
	private GuestMapper guest;
	
	public void save(String clientip,String content,String mail,String phone) {
		guest.insert(clientip, content, mail, phone);
	}
}
