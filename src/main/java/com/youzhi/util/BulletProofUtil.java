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
	
	/**
	 * 防止SQL注入
	 */
	public static String antiSQLInjection(String msg) {
		return StringEscapeUtils.escapeSql(msg); 
	}
	
	/**
	 * 过滤js脚本 (识别<script>)
	 */
	public static String filterJSScript(String msg) {
		return StringEscapeUtils.escapeHtml(msg); 
	}
	
	public static void main(String[] args) {
		System.out.println(filterJSScript("<script>alert('hello world'); </script>"));
	}
	

}
