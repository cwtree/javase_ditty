package com.cmcc.chiwei;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.cmcc.chiwei.common.LogBackConfigLoader;

/**
 * 
 * @author chiwei
 *
 */
public class Bootstrap {

	private static Logger logger = LoggerFactory.getLogger(Bootstrap.class);

	public static void main(String[] args) {
		try {
			LogBackConfigLoader.load("config/logback.xml");
		} catch (Exception e) {
			logger.error("日志加载错误", e);
		}
		logger.info("========System Start=======");
		
	}
}
