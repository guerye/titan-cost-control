package com.riozenc.prepaid.webapp.service.impl;

import com.riozenc.prepaid.webapp.service.ICimService;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;

@TransactionService
public class CimServiceImpl implements ICimService {
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public HashMap<String, Object> meterReadingInit(List<Long> ids) {

        HttpResult httpResult = restTemplate.postForObject("http://CIM-SERVER/cimServer/meterReadingInit?method=meterReadingInitDaily", ids, HttpResult.class);
        HashMap<String, Object> cimMap = (HashMap<String, Object>) httpResult.getResultData();
        return cimMap;
    }
}
