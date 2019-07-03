/**
 * UserBaseServiceImpl  2019/07/03
 *
 * Copyright (c) 2019, DEEPEXI Inc. All rights reserved.
 * DEEPEXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.deepexi.daqiutest.manager.impl;

import com.deepexi.daqiutest.domain.UserDO;
import com.deepexi.daqiutest.manager.service.UserBaseService;
import com.deepexi.daqiutest.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: user 通用基础接口实现类
 * @program: User
 * @author: admin
 * @mail: admin@deepexi.com
 * @date: 2019/07/03 16:18:14
 **/
@Service
public class UserBaseServiceImpl implements UserBaseService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void createUser(UserDO userDO) {
        // 一些新增处理逻辑
        userMapper.insert(userDO);
    }

    @Override
    public void deleteUserById(Integer  id) {
        // 一些删除前处理逻辑
        userMapper.deleteById(id);
    }
    
    @Override
    public UserDO getUserById(Integer  id) {
        // 一些处理逻辑
        return userMapper.selectById(id);
    }
}
