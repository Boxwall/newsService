package com.news.util.redis;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.alibaba.fastjson.JSON;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.exceptions.JedisDataException;

public class JedisUtil {
	private static int defaultTimeOut = 600;// 默认10分钟过期时间

	// 判空
	private static boolean isKeyNull(String key) {

		if (key == null || "".equals(key)) {
			return true;
		}
		return false;
	}

	public static boolean set(String key, String value) {
		if (isKeyNull(key)) {
			// throw new NullPointerException("Empty key value");
			return false;
		}
		Jedis jedis = null;
		try {
			jedis = JedisPoolUtil.getJedis();
			if (jedis.set(key, value).equalsIgnoreCase("ok")) {
				return true;
			} else {
				return false;
			}
		} finally {
			JedisPoolUtil.closeJedis(jedis);
		}
	}

	public static String get(String key) {
		if (isKeyNull(key)) {
			throw new NullPointerException("Empty key value");
		}
		Jedis jedis = null;
		try {
			jedis = JedisPoolUtil.getJedis();
			return jedis.get(key);
		} finally {
			JedisPoolUtil.closeJedis(jedis);
		}
	}

	public static int setKeyWithExpire(String key, Integer timeOut, String value) {
		if (isKeyNull(key)) {
			return 0;
		}
		Jedis jedis = null;
		if (timeOut <= 0) {
			timeOut = defaultTimeOut;
		}
		try {
			jedis = JedisPoolUtil.getJedis();
			if (jedis.setex(key, timeOut, value).equalsIgnoreCase("ok")) {
				return 1;
			} else {
				return 0;
			}
		} finally {
			JedisPoolUtil.closeJedis(jedis);
		}
	}

	// 设置hash中的值
	public static long hashSet(String key, String field, String value) {
		if (isKeyNull(key)) {
			throw new NullPointerException("Empty key value");
		}
		Jedis jedis = null;
		try {
			jedis = JedisPoolUtil.getJedis();
			return jedis.hset(key, field, value);
		} finally {
			JedisPoolUtil.closeJedis(jedis);
		}
	}

	// 获取hash中的值
	public static String hashGet(String key, String field) {
		if (isKeyNull(key)) {
			throw new NullPointerException("Empty key value");
		}
		return null;
	}
}
