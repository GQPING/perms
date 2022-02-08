package com.perms.demo.app.controller;

import com.perms.demo.app.domain.UserRole;
import com.perms.demo.app.service.UserRoleService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author chengxianwei
 * @description 用户和角色关联表(UserRole)控制层
 * @date 2022-02-08
 */
@RestController
@RequestMapping("userRole")
@Slf4j
@Api("用户和角色关联表(UserRole)控制层")
public class UserRoleController {
    /**
     * 服务对象
     */
    @Autowired
    private UserRoleService userRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UserRole selectOne(Long id) {
        return this.userRoleService.queryById(id);
    }

}
