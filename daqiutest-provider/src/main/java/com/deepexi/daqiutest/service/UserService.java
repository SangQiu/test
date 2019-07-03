/**
 * UserService  2019/07/03
 *
 * Copyright (c) 2019, DEEPEXI Inc. All rights reserved.
 * DEEPEXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.deepexi.daqiutest.service;

import com.deepexi.daqiutest.domain.UserCreateVO;
import com.deepexi.daqiutest.domain.UserDTO;
import com.deepexi.util.extension.ApplicationException;
import com.deepexi.util.pageHelper.PageBean;

/**
 * @description: userrest接口调用实现类接口
 * @program: UserRpcApi
 * @author: admin
 * @mail: admin@deepexi.com
 * @create: 2019/07/03 16:18:14
 **/
public interface UserService {

    /**
     * @Description: 条件分页查询
     * @return: PageBean
     * @Author: admin
     * @Date: 2019/07/03 16:18:14
     */
    PageBean getUserList(Integer page, Integer size);

    /**
     * @Description: 根据id获取
     * @return: com.deepexi.daqiutest.domain.UserDTO
     * @Author: admin
     * @Date: 2019/07/03 16:18:14
     */
    UserDTO getUserById(Integer  id);

    /**
     * @Description: 创建
     * @return: java.lang.Boolean
     * @Author: admin
     * @Date: 2019/07/03 16:18:14
     */
    Boolean createUser(UserCreateVO userCreateVO);

    /**
     * @Description: 根据id删除
     * @return: java.lang.Boolean
     * @Author: admin
     * @Date: 2019/07/03 16:18:14
     */
    Boolean deleteUserById(Integer  id);
}
