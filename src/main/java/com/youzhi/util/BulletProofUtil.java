package com.youzhi.util;
import org.apache.commons.lang.StringEscapeUtils;

/**
 * 
 * @author tianhao
 * 
 *   
 *
 */
public class BulletProofUtil {
	
	public static String antiSQLInjection(String msg) {
		return StringEscapeUtils.escapeSql(msg); 
	}

}
