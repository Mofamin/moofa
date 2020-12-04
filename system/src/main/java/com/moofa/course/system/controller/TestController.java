package com.moofa.course.system.controller;

import com.moofa.course.server.domain.Test;
import com.moofa.course.server.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {

    @Resource
    private TestService testService;


    @GetMapping("/test")
    public List<Test> test() {
        return testService.list();
    }
}
