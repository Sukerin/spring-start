package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * Created by Doctor on 2017/6/13.
 */
@Controller
public class TestController {
    @RequestMapping("/test")
    @ResponseBody
    public Object test(){

        return "merlini";
    }
}
