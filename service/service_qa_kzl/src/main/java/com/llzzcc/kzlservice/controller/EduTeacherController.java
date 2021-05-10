package com.llzzcc.kzlservice.controller;


import com.llzzcc.kzlservice.config.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 讲师 前端控制器
 * </p>
 *
 * @author llzzcc
 * @since 2021-05-10
 */
@RestController
@RequestMapping("/kzlservice/edu-teacher")
public class EduTeacherController {
    @PostMapping("login")
    public R login(){
        return R.ok().data("token","admin-user");
    }
    @GetMapping("getinfo")
    public R getinfo(){
        return R.ok().data("roles","[admin]")
                .data("name","admin")
                .data("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
    }
    @PostMapping("logout")
    public R logout(){
        return R.ok();
    }
}

