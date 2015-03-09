package com.easyway.website.cshx.quartz;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Component;

@Component
public class GetWeatherInfoTask {
	
	private static String weatherInfo = null;
	
	public static String getWeatherInfo(){
		if(weatherInfo == null || weatherInfo.isEmpty()){
			GetWeatherInfoTask task = new GetWeatherInfoTask();
			task.update();
		}
		return weatherInfo;
	}
	
	public void update(){
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			HttpGet httpget = new HttpGet(getConfig("weather_httpservice")
					+ "location=" + "长沙" + "&output=json" + "&ak="
					+ getConfig("ak"));

			System.out.println("executing request " + httpget.getURI());

			CloseableHttpResponse httpresponse = httpclient.execute(httpget);
			try {
				HttpEntity entity = httpresponse.getEntity();
				if (entity != null) {
					System.out.println("Response content length: "
							+ entity.getContentLength());
					weatherInfo = EntityUtils.toString(entity);
				}
				System.out.println("------------------------------------");
			} finally {
				httpresponse.close();
			}
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				httpclient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public String getConfig(String key) {
		String value = null;
		Properties properties = new Properties();
		InputStream inputStream = getClass().getClassLoader()
				.getResourceAsStream("config/system/config.properties");
		try {
			properties.load(inputStream);
			inputStream.close();
			value = properties.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
}
