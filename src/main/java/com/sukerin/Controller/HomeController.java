package com.sukerin.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Albert on 2017/12/16.
 */
@Controller
public class HomeController {

    @RequestMapping("")
    public String home(){
        return "index";
    }
}
