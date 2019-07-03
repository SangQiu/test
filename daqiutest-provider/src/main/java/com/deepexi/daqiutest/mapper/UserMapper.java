/**
 * UserMapper  2019/07/03
 *
 * Copyright (c) 2019, DEEPEXI Inc. All rights reserved.
 * DEEPEXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.deepexi.daqiutest.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.deepexi.daqiutest.domain.UserDO;
import com.deepexi.daqiutest.domain.UserDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description: user 持久层mapper
 * @program: User
 * @author: admin
 * @mail: admin@deepexi.com
 * @create: 2019/07/03 16:18:14
 **/
public interface UserMapper extends BaseMapper<UserDO> {

    /**
     * @param  : 分页查询
     * @description:
     * @return: java.util.List<com.deepexi.daqiutest.domain.UserDTO>
     * @author: admin
     * @Date: 2019/07/03 16:18:14
     */
    List<UserDTO> selectPageVo();
}
