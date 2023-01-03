package com.deehow.cxf.client.controller;

import com.deehow.cxf.client.service.CreateMaterailClient;
import com.deehow.cxf.client.utils.CxfClientUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class CreateMaterailController {

    @PostMapping("/test/query")
    public String query(@RequestBody Map<String, Object> param) {
        String xmlStr = param.get("xmlStr").toString();
        CreateMaterailClient createMaterailClient = CxfClientUtils.create("http://www.xxx.com/xxx?wsdl", CreateMaterailClient.class);
        return createMaterailClient.createMaterail(xmlStr);
    }
}
