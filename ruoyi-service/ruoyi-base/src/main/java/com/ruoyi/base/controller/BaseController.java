package com.ruoyi.base.controller;

import com.ruoyi.base.domain.Menu;
import com.ruoyi.base.service.MenuService;
import com.ruoyi.common.core.domain.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BaseController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/base/test")
    public R test(){
        return R.ok();
    }


    @GetMapping("/base/list")
    public R<List<Menu>> list(){
        List<Menu> list = menuService.list();
        return R.ok(list);
    }
}
