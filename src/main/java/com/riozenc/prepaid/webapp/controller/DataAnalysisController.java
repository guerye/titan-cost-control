package com.riozenc.prepaid.webapp.controller;

import com.alibaba.fastjson.JSON;
import com.riozenc.prepaid.webapp.domain.BmDataDomain;
import com.riozenc.prepaid.webapp.service.ICimService;
import com.riozenc.titanTool.properties.Global;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("dataAnalysis")
public class DataAnalysisController {

    @Autowired
    @Qualifier("cimServiceImpl")
    private ICimService iCimService;

    @RequestMapping("getDataFileFromFtp")
    @ResponseBody
    public void getDataFileFromFtp(@RequestBody String paramJson) throws IOException {
            FTPClient ftpClient=new FTPClient();//import org.apache.commons.net.ftp.FTPClient;
            ftpClient.connect(Global.getConfig("ftpIp"), 21);//连接ftp
            ftpClient.login(Global.getConfig("ftpUserName"),Global.getConfig("ftpPassWord"));//登陆ftp
            if (FTPReply.isPositiveCompletion(ftpClient.getReplyCode()))//是否连接成功,成功true,失败false
            {

                InputStream inputStream=ftpClient.retrieveFileStream(paramJson);//根据指定名称获取指定文件
                List<BmDataDomain>list=JSON.parseObject(inputStream,List.class);
                List<Long> ids=new ArrayList<Long>();
                HashMap<String,Object> cimMap= iCimService.meterReadingInit(ids);
                System.out.println("s");
            }

    }
}
