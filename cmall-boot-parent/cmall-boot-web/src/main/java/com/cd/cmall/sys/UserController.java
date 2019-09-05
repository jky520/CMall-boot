package com.cd.cmall.sys;

import com.cd.cmall.entity.common.R;
import com.cd.cmall.service.sys.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/{id}")
    public R show(@PathVariable int id) {
        return R.isOk().data(userService.load(id));
    }

}
