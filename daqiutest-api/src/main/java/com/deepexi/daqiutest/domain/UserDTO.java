/**
 * UserDTO  2019/07/03
 *
 * Copyright (c) 2019, DEEPEXI Inc. All rights reserved.
 * DEEPEXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.deepexi.daqiutest.domain;

import java.util.Date;
import java.io.Serializable;

/**
 * @description: user
 * @program: UserDTO
 * @author: admin
 * @mail: admin@deepexi.com
 * @create: 2019/07/03 16:18:14
 **/
public class UserDTO implements Serializable {

    private static final long serialVersionUID = -4966178075613641466L;


    private String name;

    private String phone;

    private String meiju;


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

