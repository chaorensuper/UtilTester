package com.youzhi.handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jfinal.handler.Handler;


/**
 * 防Xss攻击, handler类
 * @author tianhao
 *
 */
public class XssHandler extends Handler {

	@Override
	public void handle(String target, HttpServletRequest request, HttpServletResponse response, boolean[] isHandled) {
		request = new XssHttpServletRequestWrapper(request); 
		next.handle(target, request, response, isHandled);
	}

}
