package com.perms.demo.app.controller;

import com.perms.demo.app.domain.SysUser;
import com.perms.demo.app.service.SysUserService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author chengxianwei
 * @description 用户信息表(User)控制层
 * @date 2022-02-08
 */
@RestController
@RequestMapping("user")
@Slf4j
@Api("用户信息表(User)控制层")
public class SysUserController {
    /**
     * 服务对象
     */
    @Autowired
    private SysUserService sysUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysUser selectOne(Long id) {
        return this.sysUserService.queryById(id);
    }

}
