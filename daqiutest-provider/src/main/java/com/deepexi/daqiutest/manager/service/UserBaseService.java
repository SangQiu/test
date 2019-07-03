/**
 * UserBaseService  2019/07/03
 *
 * Copyright (c) 2019, DEEPEXI Inc. All rights reserved.
 * DEEPEXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.deepexi.daqiutest.manager.service;

import com.deepexi.daqiutest.domain.UserDO;

/**
 * @description: user通用基础接口
 * @program: User
 * @author: admin
 * @mail: admin@deepexi.com
 * @date: 2019/07/03 16:18:14
 **/
public interface UserBaseService {

    /**
     * @description: 新增
     */
    void createUser(UserDO userDO);

    /**
     * @description: 根据id删除
     */
    void deleteUserById(Integer  id);

    /**
     * @description: 根据id查询
     */
    UserDO getUserById(Integer  id);
}
