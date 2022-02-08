package com.perms.demo.app.controller;

import com.perms.demo.app.domain.RoleMenu;
import com.perms.demo.app.service.RoleMenuService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author chengxianwei
 * @description 角色和菜单关联表(RoleMenu)控制层
 * @date 2022-02-08
 */
@RestController
@RequestMapping("roleMenu")
@Slf4j
@Api("角色和菜单关联表(RoleMenu)控制层")
public class RoleMenuController {
    /**
     * 服务对象
     */
    @Autowired
    private RoleMenuService roleMenuService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public RoleMenu selectOne(Long id) {
        return this.roleMenuService.queryById(id);
    }

}
