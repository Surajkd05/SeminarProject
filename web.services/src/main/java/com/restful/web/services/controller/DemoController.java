package com.restful.web.services.controller;

import com.restful.web.services.model.Demo;
import com.restful.web.services.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/demo")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @PostMapping(path = "/")
    public Demo addData(@RequestBody Demo demo){
        return demoService.addData(demo);
    }

    @GetMapping(path = "/")
    public Optional<Demo> getData(@RequestParam Long id){
        return demoService.getData(id);
    }
}
