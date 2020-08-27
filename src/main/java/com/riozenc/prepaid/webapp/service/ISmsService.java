package com.riozenc.prepaid.webapp.service;

import com.riozenc.titanTool.spring.web.http.HttpResult;

public interface ISmsService {

	public HttpResult sendWarnSms();
	
	public HttpResult sendTripSms();
	

}
