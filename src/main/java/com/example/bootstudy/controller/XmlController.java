package com.example.bootstudy.controller;

import com.example.bootstudy.entity.XmlEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class XmlController {

    /**
     * consumes： 指定处理请求的提交内容类型（Content-Type），例如application/json, text/html;
     * produces:    指定返回的内容类型，仅当request请求头中的(Accept)类型中包含该指定类型才返回；
     * 参考：http://blog.sina.com.cn/s/blog_6472d0800102xjpm.html
     */
    @GetMapping(value = "/xml", produces = MediaType.APPLICATION_XML_VALUE)
    public XmlEntity getEntityByXml() {
        return new XmlEntity("张三",18,"error");
    }

    @GetMapping(value = "/json", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public XmlEntity getEntityByJSON() {
        return new XmlEntity("张三", 18, "error");
    }
}
