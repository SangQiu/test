/**
 * UserRpcApiImpl  2019/07/03
 *
 * Copyright (c) 2019, DEEPEXI Inc. All rights reserved.
 * DEEPEXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.deepexi.daqiutest.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.deepexi.daqiutest.service.UserService;
import com.deepexi.daqiutest.api.UserRpcApi;
import com.deepexi.daqiutest.domain.UserCreateVO;
import com.deepexi.daqiutest.domain.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import com.deepexi.util.BeanHelper;

/**
 * @description: rpc调用user接口实现类
 * @program: User
 * @author: admin
 * @mail: admin@deepexi.com
 * @date: 2019/07/03 16:18:14
 **/
@Service(version = "0")
public class UserRpcApiImpl implements UserRpcApi {

    @Autowired
    private UserService userService;

    @Override
    public UserDTO getUserById(Integer  id) {
        UserDTO user = userService.getUserById(id);
        return user;
    }

    @Override
    public Boolean createUser(UserDTO userDTO) {
        UserCreateVO user = new UserCreateVO();
        BeanHelper.copyProperties(user, userDTO);
        userService.createUser(user);
        return true;
    }
}
