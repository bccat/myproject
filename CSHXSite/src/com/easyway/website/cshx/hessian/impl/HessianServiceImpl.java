package com.easyway.website.cshx.hessian.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.easyway.website.cshx.hessian.HessianService;
import com.easyway.website.cshx.util.ZipCompressor;

public class HessianServiceImpl implements HessianService {

	@Override
	public String sayHello(String username) {
		return "hessianhello";
	}

	@Override
	public void upateWebSite(InputStream is) {
		String webRoot = System.getProperty("web.root");
		try {
			OutputStream out = new FileOutputStream(webRoot + File.separator + "html.zip");
			int nLength = 0;
			byte[] bData = new byte[1024];
			while (-1 != (nLength = is.read(bData))) {
				out.write(bData, 0, nLength);
			}
			out.close();
			
			ZipCompressor.unzip(new File(webRoot), webRoot + File.separator + "html.zip");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void uploadUserImages(String filename,InputStream is) {
		String webRoot = System.getProperty("web.root");
		try {
			File userImageDir = new File(webRoot + File.separator + "userImages" );
			if(!userImageDir.isDirectory()){
				userImageDir.mkdir();
			}
			
			OutputStream out = new FileOutputStream(webRoot + File.separator + "userImages" + File.separator + filename);
			int nLength = 0;
			byte[] bData = new byte[1024];
			while (-1 != (nLength = is.read(bData))) {
				out.write(bData, 0, nLength);
			}
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}
}
