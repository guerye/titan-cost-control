package com.riozenc.prepaid.webapp.service;

import java.util.List;

import com.riozenc.prepaid.webapp.domain.DailyChargeDomain;
import com.riozenc.titanTool.spring.web.http.HttpResult;

public interface ISmsService {

	public HttpResult sendWarnSms(List<DailyChargeDomain> dcl);
	
	public HttpResult sendCutSms(List<DailyChargeDomain> dcl);
	

}
