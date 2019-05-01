package com.yan1less.readdb.controller;


import com.yan1less.readdb.pojo.A.AareaDeail;
import com.yan1less.readdb.pojo.B.BFront;
import com.yan1less.readdb.pojo.D.DFront;
import com.yan1less.readdb.pojo.blogtext;

import com.yan1less.readdb.mapper.MySQLMapper;
import com.yan1less.readdb.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Yan1less
 * @Date 2019/4/24 17:33
 * @Description TODO
 **/
@RestController
@RequestMapping("/dashboard")
public class MyController {
    @Autowired
    private MySQLMapper mapper;

    @Autowired
    private MyService service;


    @RequestMapping("/test")
    public String test(){
        return "hello";
    }

//    @RequestMapping("/test11")
//    public List<blogtext> test11(){
//        return mapper.selectAll();
//    }

    @RequestMapping("/aarea.json")
    public AareaDeail Aarea(){
        return service.selectAarea();
    }

    @RequestMapping("/barea.json")
    public BFront Barea(){
        return service.selectBarea();
    }

    @RequestMapping("/darea.json")
    public String Darea(){
        return service.selectDarea();
    }

    @RequestMapping("/earea.json")
    public String Earea(){
        return service.selectEarea();
    }

    @RequestMapping("/farea.json")
    public String Farea(){
        return service.selectFarea();
    }

    @RequestMapping("/garea.json")
    public String Garea(){
        return service.selectGarea();
    }

}
