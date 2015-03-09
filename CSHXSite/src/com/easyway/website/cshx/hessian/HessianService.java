package com.easyway.website.cshx.hessian;

import java.io.InputStream;

public interface HessianService {
    public String sayHello(String username);
    
    public void upateWebSite(InputStream is);
    
    public void uploadUserImages(String filename,InputStream is);
}