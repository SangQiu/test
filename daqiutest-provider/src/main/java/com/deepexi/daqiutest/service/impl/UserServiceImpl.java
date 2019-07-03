/**
 * UserServiceImpl  2019/07/03
 *
 * Copyright (c) 2019, DEEPEXI Inc. All rights reserved.
 * DEEPEXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.deepexi.daqiutest.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.dubbo.rpc.RpcContext;
import com.deepexi.daqiutest.domain.UserDO;
import com.deepexi.daqiutest.domain.UserCreateVO;
import com.deepexi.daqiutest.domain.UserDTO;
import com.deepexi.daqiutest.manager.service.UserBaseService;
import com.deepexi.daqiutest.mapper.UserMapper;
import com.deepexi.daqiutest.service.UserService;
import com.deepexi.util.extension.ApplicationException;
import com.deepexi.util.pageHelper.PageBean;
import com.github.pagehelper.PageHelper;
import com.deepexi.util.BeanHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description: rpc调用接口实现
 * @program: UserRpcApi
 * @author: admin
 * @mail: admin@deepexi.com
 * @create: 2019/07/03 16:18:14
 **/
@Service
public class UserServiceImpl implements UserService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserBaseService userBaseService;

    @Autowired
    private UserMapper userMapper;

    /**
     * @param page :    页码
     * @param size :    分页大小
     * @Description:
     * @return: com.deepexi.util.pageHelper.PageBean
     * @Author: admin
     * @Date: 2019/07/03 16:18:14
     */
    @Override
    public PageBean getUserList(Integer page, Integer size) {
        PageHelper.startPage(page, size);
        List<UserDTO> userTasks = userMapper.selectPageVo();
        return new PageBean<>(userTasks);
    }

    /**
     * @param userCreateVO :
     * @Description:
     * @return: java.lang.Boolean
     * @Author: admin
     * @Date: 2019/07/03 16:18:14
     */
    @Override
    public Boolean createUser(UserCreateVO userCreateVO) {
        UserDO user = new UserDO();
        BeanHelper.copyProperties(user, userCreateVO);
        userBaseService.createUser(user);
        return true;
    }

    /**
     * @param id :
     * @Description:
     * @return: java.lang.Boolean
     * @Author: admin
     * @Date: 2019/07/03 16:18:14
     */
    @Override
    public Boolean deleteUserById(Integer  id) {
        userBaseService.deleteUserById(id);
        return true;
    }

    /**
     * @param id :
     * @Description:
     * @return: com.deepexi.daqiutest.domain.eo.User
     * @Author: admin
     * @Date: 2019/07/03 16:18:14
     */
    @Override
    @SentinelResource(value = "testSentinel", fallback = "doFallback", blockHandler = "exceptionHandler")
    public UserDTO getUserById(Integer  id) {
        // dubbo生产者被消费者调用时，客户端隐式传入的参数
        String tenantId = RpcContext.getContext().getAttachment("tenantId");
        logger.info("获取客户端隐式参数，tenantId：{}", tenantId);
        UserDO user = userBaseService.getUserById(id);
        return BeanHelper.copyProperties(new UserDTO(),user);
    }

    /**
     * @param i :
     * @Description:
     * @return: java.lang.String
     * @Author: admin
     * @Date: 2019/07/03 16:18:14
     */
    public String doFallback(long i) {
        // Return fallback value.
        return "Oops, degraded";
    }
}
