package com.restful.web.services.service;

import com.restful.web.services.model.Demo;
import com.restful.web.services.repository.DemoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DemoService {

    @Autowired
    private DemoRepo demoRepo;

    public Demo addData(Demo demo){
        return demoRepo.save(demo);
    }

    public Optional<Demo> getData(Long id){
        return demoRepo.findById(id);
    }
}
