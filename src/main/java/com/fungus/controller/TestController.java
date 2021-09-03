package com.fungus.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

@Api(tags = "测试")
@Controller
@RequestMapping("/test")
public class TestController {

    @ApiOperation(value = "测试2")
    @GetMapping("/1")
    public String tesd1(HttpServletResponse response){
        return "1";
    }

    /**
     * Author: HuYuQiao
     * Description: 浏览器下载--excel
     */
    @ApiOperation(value = "测试1")
    @GetMapping("/testRespExcel")
    public void testRespExcel(HttpServletResponse response ){
    }




}
