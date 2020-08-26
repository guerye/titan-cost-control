package com.riozenc.costControl.webapp.service.impl;

import com.riozenc.costControl.webapp.service.ICimService;
import com.riozenc.titanTool.annotation.TransactionService;
import com.riozenc.titanTool.properties.Global;
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

        HttpResult httpResult = restTemplate.postForObject("meterReadingInit?method=meterReadingInitDaily", ids, HttpResult.class);
        HashMap<String, Object> cimMap = (HashMap<String, Object>) httpResult.getResultData();
        return cimMap;
    }
}
