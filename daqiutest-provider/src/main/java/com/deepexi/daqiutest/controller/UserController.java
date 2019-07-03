/**
 * UserController  2019/07/03
 *
 * Copyright (c) 2019, DEEPEXI Inc. All rights reserved.
 * DEEPEXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.deepexi.daqiutest.controller;

import com.deepexi.daqiutest.domain.UserCreateVO;
import com.deepexi.daqiutest.domain.UserUpdateVO;
import com.deepexi.daqiutest.service.UserService;
import com.deepexi.util.config.Payload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * @description: User rest接口
 * @program: UserController
 * @author: admin
 * @mail: admin@deepexi.com
 * @date: 2019/07/03 16:18:14
 **/
@Validated
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    /**
     * @description: 分页查询
     * @param page : 第几页
     * @param size : 每页查询数据条数
     * @return: com.deepexi.util.config.Payload
     * @author: admin
     * @date: 2019/07/03 16:18:14
     */
    @GetMapping
    public Payload getUserList(@RequestParam(name = "page", required = false, defaultValue = "1") Integer page,
                                  @RequestParam(name = "size", required = false, defaultValue = "10") Integer size) {
        return new Payload(userService.getUserList(page, size));
    }

    /**
    * @description: 根据id查询
    * @param id :
    * @return: com.deepexi.util.config.Payload
    * @author: admin
    * @date: 2019/07/03 16:18:14
    */
    @GetMapping("/{id:[a-zA-Z0-9]+}")
    public Payload getUserById(@PathVariable("id") Integer  id) {
        return new Payload(userService.getUserById(id));
    }

    /**
     * @description: 创建
     * @param userCreateVO :
     * @return: com.deepexi.util.config.Payload
     * @author: admin
     * @date: 2019/07/03 16:18:14
     */
    @PostMapping
    public Payload createUser(@RequestBody UserCreateVO userCreateVO) {
        return new Payload(userService.createUser(userCreateVO));
    }

    /**
     * @description: 更新
     * @param id :
     * @param userUpdateVO :
     * @return: com.deepexi.util.config.Payload
     * @author: admin
     * @date: 2019/07/03 16:18:14
     */
    @PutMapping("/{id:[a-zA-Z0-9]+}")
    public Payload updateUserById(@PathVariable("id") String id, UserUpdateVO userUpdateVO) {
        return new Payload(null);
    }

    /**
     * @description: 根据id删除
     * @param id :
     * @return: com.deepexi.util.config.Payload
     * @author: admin
     * @date: 2019/07/03 16:18:14
     */
    @DeleteMapping("/{id:[a-zA-Z0-9]+}")
    public Payload deleteUserById(@PathVariable("id") Integer  id) {
        return new Payload(userService.deleteUserById(id));
    }
}
