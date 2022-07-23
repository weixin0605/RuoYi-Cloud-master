package com.ruoyi.base.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ruoyi.base.domain.Menu;
import com.ruoyi.base.service.MenuService;
import com.ruoyi.common.core.domain.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api("BaseController")
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
    @ApiOperation("分页测试")
    @GetMapping("/base/page")
    public R<Page<Menu>> page(){
        Page<Menu> page = new Page<>(1,10);
        menuService.page(page);
        return R.ok(page);
    }
}
