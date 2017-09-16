package com.helloworld.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author dongchunxu
 * @version 1.0
 * Created at 2017/9/16 上午4:03
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "success";
    }
}
