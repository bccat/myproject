package com.easyway.website.cshx.mapper;

import org.apache.ibatis.annotations.Param;

public interface GuestMapper{
	
	public void insert(@Param("clientip") String clientip,@Param("content") String content,
			@Param("mail") String mail,@Param("phone") String phone);
}
