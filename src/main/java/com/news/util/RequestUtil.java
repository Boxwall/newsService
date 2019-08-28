package com.news.util;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

public class RequestUtil {
	// 获取当前用户IP
	public static String getRemoteHost(HttpServletRequest request) {
		String ip = request.getHeader("x-forwarded-for");
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("http_client_ip");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("HTTP_X_FORWARDED_FOR");
		}
		if (ip != null && ip.indexOf(",") != -1) {
			ip = ip.substring(ip.lastIndexOf(",") + 1, ip.length()).trim();
		}
		if ("0:0:0:0:0:0:0:1".equals(ip)) {
			ip = "127.0.0.1";
		}
		return ip;
	}

	// 获取请求的url
	public static String getUrl(HttpServletRequest request) {
		String url = "";

		try {
			url = request.getRequestURL().toString();
		} catch (Exception e) {
		}
		return url;
	}

	// 获取请求参数
	public static Map<String, String> getParameters(HttpServletRequest request) {
		Map<String, String[]> map = request.getParameterMap();
		Map<String, String> result = new HashMap<String, String>();
		Set<Entry<String, String[]>> keSet = map.entrySet();
		for (Iterator<Entry<String, String[]>> itr = keSet.iterator(); itr.hasNext();) {
			Map.Entry<String, String[]> me = (Map.Entry<String, String[]>) itr.next();
			Object ok = me.getKey();
			Object ov = me.getValue();
			String[] value = new String[1];
			if (ov instanceof String[]) {
				value = (String[]) ov;
			} else {
				value[0] = ov.toString();
			}

			for (int k = 0; k < value.length; k++) {
				result.put(ok.toString(), value[k]);
			}
		}
		return result;
	}
	
	//获取请求头
	public static Map<String,String> getHeaders(HttpServletRequest request){

		Map<String, String> result = new HashMap<String, String>();
		
		Enumeration<String> headerNames = request.getHeaderNames();
		
		while(headerNames.hasMoreElements()) {
			String key = headerNames.nextElement();
			result.put(key,request.getHeader(key));
		}
		
		return result;
	}
}
