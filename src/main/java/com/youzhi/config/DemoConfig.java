package com.youzhi.config;

import com.youzhi.handler.XssHandler;
import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.ext.handler.ContextPathHandler;
import com.jfinal.template.Engine;

public class DemoConfig extends JFinalConfig {

	@Override
	public void configConstant(Constants me) {
		
	}

	@Override
	public void configRoute(Routes routes) {
		
	}

	@Override
	public void configEngine(Engine engine) {
		
	}

	@Override
	public void configPlugin(Plugins plugins) {
		
	}

	@Override
	public void configInterceptor(Interceptors interceptors) {
		
	}

	@Override
	public void configHandler(Handlers handlers) {
		handlers.add(new XssHandler()); 
//		handlers.add(new FakeStaticHandler(".html"));
		handlers.add(new ContextPathHandler("ctx")); 
	}

}
