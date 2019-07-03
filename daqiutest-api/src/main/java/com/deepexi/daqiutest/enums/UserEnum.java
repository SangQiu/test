/**
 * UserEnum  2019/07/03
 *
 * Copyright (c) 2019, DEEPEXI Inc. All rights reserved.
 * DEEPEXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.deepexi.daqiutest.enums;

import com.deepexi.util.constant.BaseEnumType;

/**
 * @description: user 枚举
 * @program: UserEnum
 * @author: admin
 * @mail: admin@deepexi.com
 * @create: 2019/07/03 16:18:14
 **/
public enum UserEnum implements BaseEnumType {

    UNKNOWN_ERROR("500", "系统出异常啦!请联系管理员!!!");

    private String code;

    private String msg;

    UserEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
