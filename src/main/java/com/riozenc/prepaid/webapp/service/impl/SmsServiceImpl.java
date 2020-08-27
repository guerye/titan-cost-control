package com.riozenc.prepaid.webapp.service.impl;

import com.riozenc.prepaid.webapp.service.ISmsService;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.spring.web.http.HttpResult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

@TransactionService
public class SmsServiceImpl implements ISmsService {
    @Autowired
    private RestTemplate restTemplate;

    
	@Override
	public HttpResult sendWarnSms() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HttpResult sendTripSms() {
		// TODO Auto-generated method stub
		return null;
	}

    

}
