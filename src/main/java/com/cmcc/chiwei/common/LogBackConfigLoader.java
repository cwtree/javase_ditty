/**  
 * Project Name:cmcc.cvt  
 * File Name:LogBackConfigLoader.java  
 * Package Name:com.cmcc.dpi.cvt.common  
 * Date:2018年2月1日下午4:19:55  
 * Copyright (c) 2018, chiwei@chinamobile.com All Rights Reserved.  
 *  
*/

package com.cmcc.chiwei.common;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.util.StatusPrinter;

/**  
 * ClassName:LogBackConfigLoader <br/>  
 * Function: TODO ADD FUNCTION. <br/>  
 * Reason:   TODO ADD REASON. <br/>  
 * Date:     2018年2月1日 下午4:19:55 <br/>  
 * @author   chiwei  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */
public class LogBackConfigLoader {

	/**
	 * 
	 * @param externalConfigFileLocation
	 * @throws Exception
	 */
    public static void load(String externalConfigFileLocation) throws Exception {
        LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
        JoranConfigurator configurator = new JoranConfigurator();
        configurator.setContext(lc);
        lc.reset();
        configurator.doConfigure(externalConfigFileLocation);
        StatusPrinter.printInCaseOfErrorsOrWarnings(lc);
    }
}
