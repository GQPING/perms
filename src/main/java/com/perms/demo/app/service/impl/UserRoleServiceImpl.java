package com.perms.demo.app.service.impl;

import com.perms.demo.app.domain.UserRole;
import com.perms.demo.app.mapper.UserRoleMapper;
import com.perms.demo.app.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author chengxianwei
 * @description 用户和角色关联表(UserRole)服务实现类
 * @date 2022-02-08
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {
    
    @Autowired
    private UserRoleMapper userRoleMapper;

    /**
     * 通过ID查询单条数据
     *
     * @param userId 主键
     * @return 实例对象
     */
    @Override
    public UserRole queryById(Long userId) {
        return this.userRoleMapper.queryById(userId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<UserRole> queryAllByLimit(int offset, int limit) {
        return this.userRoleMapper.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param userRole 实例对象
     * @return 实例对象
     */
    @Override
    public UserRole insert(UserRole userRole) {
        this.userRoleMapper.insert(userRole);
        return userRole;
    }

    /**
     * 修改数据
     *
     * @param userRole 实例对象
     * @return 实例对象
     */
    @Override
    public UserRole update(UserRole userRole) {
        this.userRoleMapper.update(userRole);
        return this.queryById(userRole.getUserId());
    }

    /**
     * 通过主键删除数据
     *
     * @param userId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long userId) {
        return this.userRoleMapper.deleteById(userId) > 0;
    }
}
