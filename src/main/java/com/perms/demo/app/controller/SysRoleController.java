package com.perms.demo.app.controller;

import com.perms.demo.app.domain.SysRole;
import com.perms.demo.app.service.SysRoleService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author chengxianwei
 * @description 角色信息表(Role)控制层
 * @date 2022-02-08
 */
@RestController
@RequestMapping("role")
@Slf4j
@Api("角色信息表(Role)控制层")
public class SysRoleController {
    /**
     * 服务对象
     */
    @Autowired
    private SysRoleService sysRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysRole selectOne(Long id) {
        return this.sysRoleService.queryById(id);
    }

}
