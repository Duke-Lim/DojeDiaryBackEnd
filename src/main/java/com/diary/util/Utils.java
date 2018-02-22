package com.diary.util;

import java.util.HashMap;
import java.util.Iterator;

public class Utils {
	public static HashMap<String, Object> changeToUpperMapKey(HashMap<String, Object> reqMap) {
		Iterator<String> iterator = reqMap.keySet().iterator();
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		
		while (iterator.hasNext()) {
			String key = iterator.next();
			resultMap.put(key.toUpperCase(), reqMap.get(key));
		}

		return resultMap;
	}
}
