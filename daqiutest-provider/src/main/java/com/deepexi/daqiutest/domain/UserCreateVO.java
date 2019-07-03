/**
 * UserCreateVO  2019/07/03
 *
 * Copyright (c) 2019, DEEPEXI Inc. All rights reserved.
 * DEEPEXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.deepexi.daqiutest.domain;

import java.util.Date;
import java.io.Serializable;
import javax.ws.rs.QueryParam;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * @description: user
 * @program: UserVO
 * @author: admin
 * @mail: admin@deepexi.com
 * @create: 2019/07/03 16:18:14
 **/
public class UserCreateVO implements Serializable {

    private static final long serialVersionUID = -4966178075613641466L;

    private Integer  id;

    @NotNull(message = "name不能为空")
    private String name;

    @NotNull(message = "phone不能为空")
    private String phone;

    @NotNull(message = "meiju不能为空")
    private String meiju;

    public void setId(Integer  id){
        this.id = id;
    }

    public Integer  getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getPhone(){
        return this.phone;
    }

    public void setMeiju(String meiju){
        this.meiju = meiju;
    }

    public String getMeiju(){
        return this.meiju;
    }

}

