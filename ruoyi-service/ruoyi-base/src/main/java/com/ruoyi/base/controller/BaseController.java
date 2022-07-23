package com.ruoyi.base.controller;

import com.ruoyi.common.core.domain.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping("/base/test")
    public R test(){
        return R.ok();
    }
}
