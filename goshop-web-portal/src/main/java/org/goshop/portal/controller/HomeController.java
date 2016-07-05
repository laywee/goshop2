package org.goshop.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    /**
     * 打开首页
     */
    @RequestMapping("/index.do")
    public String index() {
        return "index";
    }


}
