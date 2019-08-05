package com.news.util;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

public class ResultUtil {
	
	public static String getJSONResult(Integer code,boolean flag,String describtion,Object data) {
		String result = null;
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("code", code);
		map.put("flag",flag);
		map.put("desc", describtion);
		map.put("data", data);
		
		JSONObject json = new JSONObject(map);
		
		result=json.toJSONString();
		
		return result;
	}
}
