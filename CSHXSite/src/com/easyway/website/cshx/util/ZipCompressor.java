package com.easyway.website.cshx.util;

import java.io.File;

import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.Expand;

public class ZipCompressor {	
	public static void unzip(File destFile, String zipFilePath) {
		File zipFile = new File(zipFilePath);
		  if (!zipFile.exists())
		   throw new RuntimeException("zip file " + zipFilePath
		     + " does not exist.");
		  Project proj = new Project();
		  Expand expand = new Expand();
		  expand.setProject(proj);
		  expand.setTaskType("unzip");
		  expand.setTaskName("unzip");
		  expand.setSrc(zipFile);
		  expand.setDest(destFile);
		  expand.setEncoding("UTF-8");
		  expand.execute();
	}	
	
	public static void main(String[] args){
		unzip(new File("D:\\testest"),"D:\\g4studio\\website\\html\\html.zip");
	}
}
