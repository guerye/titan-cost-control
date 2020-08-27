package com.riozenc.prepaid.webapp.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.type.TypeReference;
import com.riozenc.prepaid.webapp.domain.DailyChargeDomain;
import com.riozenc.prepaid.webapp.service.ICimService;
import com.riozenc.prepaid.webapp.service.ISmsService;
import com.riozenc.titanTool.common.json.utils.JSONUtil;
import com.riozenc.titanTool.spring.web.http.HttpResult;

@Controller
@RequestMapping("sms")
public class SmsController {

	@Autowired
    @Qualifier("smsServiceImpl")
    private ISmsService smsService;
	//尊敬的{0}户号:{1}，截至{2}年{3}月{4}日，实时余额为｛5｝元，请及时充值
	
    @RequestMapping("sendSms")
    @ResponseBody
    public HttpResult sendSms(@RequestBody String body) throws IOException {
         
		List<DailyChargeDomain> dailyChargeList = 
				JSONUtil.readValue(body, new TypeReference<List<DailyChargeDomain>>() {});
		
		
		
		
		return null;
		
		
		
		
		
    } 
    
}
