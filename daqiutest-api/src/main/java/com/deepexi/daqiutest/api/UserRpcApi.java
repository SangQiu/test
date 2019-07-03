/**
 * UserRpcApi  2019/07/03
 *
 * Copyright (c) 2019, DEEPEXI Inc. All rights reserved.
 * DEEPEXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.deepexi.daqiutest.api;

import com.deepexi.daqiutest.domain.UserDTO;

/**
 * @description: userrpc调用接口
 * @program: UserRpcApi
 * @author: admin
 * @mail: admin@deepexi.com
 * @create: 2019/07/03 16:18:14
 **/
public interface UserRpcApi {

    /**
     * @description: 根据id获取详细信息
     * @param id :
     * @return: com.deepexi.daqiutest.domain.UserDTO
     * @author: admin
     * @date: 2019/07/03 16:18:14
     */
    UserDTO getUserById(Integer  id);

    /**
     * @description: 添加
     * @param UserDTO
     * @return: java.lang.Boolean
     * @author: admin
     * @date: 2019/07/03 16:18:14
     */
    Boolean createUser(UserDTO UserDTO);
}
