package com.riozenc.costControl.webapp.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.riozenc.costControl.webapp.domain.BmDataDomain;
import org.apache.commons.lang.CharSet;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.*;
import java.nio.charset.Charset;
import java.util.List;

@Controller
@RequestMapping("dataAnalysis")
public class DataAnalysisController {

    @RequestMapping("getDataFileFromFtp")
    @ResponseBody
    public void getDataFileFromFtp(@RequestBody String paramJson) throws IOException {
        JSONObject paramJSONObject = JSONObject.parseObject(paramJson);

            FTPClient ftpClient=new FTPClient();//import org.apache.commons.net.ftp.FTPClient;
            ftpClient.connect("172.21.29.55", 21);//连接ftp
            ftpClient.login("Administrator", "wisdom.df6100");//登陆ftp
            if (FTPReply.isPositiveCompletion(ftpClient.getReplyCode()))//是否连接成功,成功true,失败false
            {

                InputStream inputStream=ftpClient.retrieveFileStream("20200826.txt");//根据指定名称获取指定文件
                List<BmDataDomain>list=JSON.parseObject(inputStream,List.class);
                System.out.println("sss");
            }

    }
}
