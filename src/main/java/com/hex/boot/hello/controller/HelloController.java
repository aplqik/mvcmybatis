package com.hex.boot.hello.controller;

import com.hex.boot.hello.mapper.DeptMapper;
import com.hex.boot.hello.model.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloController {
    @Autowired
    private DeptMapper deptMapper;
    @RequestMapping("/hello")
    public String hello(HttpServletRequest request, @RequestParam(value = "name", defaultValue = "springboot-thymeleaf") String name) {
        Dept dept = deptMapper.selectByPrimaryKey(1L);
        request.setAttribute("name", dept.getDeptName());
        return "hello";
    }
}
