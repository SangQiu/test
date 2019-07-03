/**
 * UserDTO  2019/07/03
 *
 * Copyright (c) 2019, DEEPEXI Inc. All rights reserved.
 * DEEPEXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.deepexi.daqiutest.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;

/**
 * @description: user
 * @program: UserDO
 * @author: admin
 * @mail: admin@deepexi.com
 * @create: 2019/07/03 16:18:14
 **/
@TableName("user")
public class UserDO extends SuperEntity {


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

