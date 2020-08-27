package com.riozenc.prepaid.webapp.service.impl;

import com.riozenc.prepaid.webapp.domain.DailyChargeDomain;
import com.riozenc.prepaid.webapp.domain.SmsMessageDomain;
import com.riozenc.prepaid.webapp.domain.SmsSendDomain;
import com.riozenc.prepaid.webapp.domain.SmsSendLogDomain;
import com.riozenc.prepaid.webapp.service.ISmsService;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.properties.Global;
import com.riozenc.titanTool.spring.web.http.HttpResult;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

@TransactionService
public class SmsServiceImpl implements ISmsService {
    @Autowired
    private RestTemplate restTemplate;

    private final String smsUser = Global.getConfig("smsUser");
    private final String smsPassword = Global.getConfig("smsPassword");
    private final String interfaceId = Global.getConfig("interfaceId");
   // Global.getConfig("smsId.cut")
   // Global.getConfig("smsId.warn")

    
	@Override
	public HttpResult sendWarnSms(List<DailyChargeDomain> dcl) {
		/**
		 * 1、转化成短信模版需要的对象
		 * 2、查发送记录表，发送未发送过的短信。
		 * 3、如果不存在发送记录，新增一条
		 * 2、发送短信，接收返回结果
		 * 3、根据返回结果更新短信发送记录表
		 * 
		 * */
		
		
		
		
		List<SmsMessageDomain> data = new ArrayList<>();
		
		
		
		
		SmsSendDomain smsSendDomain = new SmsSendDomain();
		smsSendDomain.setSmsUser(smsUser);
		smsSendDomain.setSmsPassword(smsPassword);
		smsSendDomain.setInterfaceId(interfaceId);
		smsSendDomain.setSmsId(Global.getConfig("smsId.warn"));
		
		
		return null;
	}

	@Override
	public HttpResult sendCutSms(List<DailyChargeDomain> dcl) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<SmsSendLogDomain> getSendLog(List<DailyChargeDomain> dcl){
		/**
		 * 1、根据传入的list查询表里的记录
		 * 2、
		 * 
		 * */
		if(dcl==null) {
			return null;
		}
		List<SmsSendLogDomain> smsSendLogList = new ArrayList<>();
		if(dcl.size()>1000) {
			//smsSendLogList = 
		}
		else{
			
		}
		
		
		
		
		return null;

	}
	
	

}
