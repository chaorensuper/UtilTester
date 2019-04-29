package com.youzhi.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import org.apache.commons.lang.StringEscapeUtils;
import com.jfinal.kit.StrKit;

/**
 * 防止Xss攻击, 包装类
 * @author youzhi8d
 *
 */

public class XssHttpServletRequestWrapper extends HttpServletRequestWrapper {
	private HttpServletRequest xssRequest; 
	
	public XssHttpServletRequestWrapper(HttpServletRequest request) {
		super(request);
		xssRequest = request;
	}

	
	public String getParameter(String name) {
		String value = xssRequest.getParameter(name); 
		
		if (!StrKit.isBlank(value)) {
			value = cleanXss(value); 
		}
		
 		return value; 
	}
	
	public String cleanXss(String value) {
		return StringEscapeUtils.escapeHtml(value); 
	}

}
