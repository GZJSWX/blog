package com.wangxin.blog.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class BlogController {

    @GetMapping("/index")
    public String index(){
        return "admin/index";
    }
    @GetMapping("/blogs")
    public String blogs(){
        return "admin/blogs";
    }
}
