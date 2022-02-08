package com.perms.demo.app.controller;

import com.perms.demo.app.domain.SysMenu;
import com.perms.demo.app.service.SysMenuService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author chengxianwei
 * @description 菜单权限表(Menu)控制层
 * @date 2022-02-08
 */
@RestController
@RequestMapping("menu")
@Slf4j
@Api("菜单权限表(Menu)控制层")
public class SysMenuController {
    /**
     * 服务对象
     */
    @Autowired
    private SysMenuService sysMenuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysMenu selectOne(Long id) {
        return this.sysMenuService.queryById(id);
    }

}
