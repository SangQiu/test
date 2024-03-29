/**
 * AppRuntimeEnv  2019/3/27
 *
 * Copyright (c) 2018, DEEPEXI Inc. All rights reserved.
 * DEEPEXI PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.deepexi.daqiutest.extension;

import com.deepexi.daqiutest.enums.ResultEnum;
import com.deepexi.util.IdGenerator;
import com.deepexi.util.extension.ApplicationException;
import org.springframework.stereotype.Component;

/**
 * author      : dormi330
 * date        : 2018/6/30
 * project     : mybatis
 * description : 应用运行上下文
 * 遇到过很多这样的场景, 与领域无关的东西, 渗透到领域模型里面去
 * 想通过某种方式解决这个问题,
 */
@Component
public class AppRuntimeEnv {

    /**
     * 租户编码
     */
    private ThreadLocal<String> tenantId = ThreadLocal.withInitial(() -> null);
    /**
     * token信息
     */
    private ThreadLocal<String> token = ThreadLocal.withInitial(() -> null);
    /**
     * requestId
     */
    private ThreadLocal<String> requestId = ThreadLocal.withInitial(IdGenerator::getUuId);

    public AppRuntimeEnv ensureToken(String token) throws Exception {
        if (null == token) {
            throw new ApplicationException(ResultEnum.TOKEN_NOT_FOUND);
        }
        this.token.set(token);
        return this;
    }

    public AppRuntimeEnv ensureTenantId(String tenantId) throws Exception {
        if (null == tenantId) {
            throw new ApplicationException(ResultEnum.TENANT_NOT_FOUND);
        }
        this.tenantId.set(tenantId);
        return this;
    }

    public String getTenantId() {
        return tenantId.get();
    }

    public void setTenantId(String tenantId) {
        this.tenantId.set(tenantId);
    }

    public String getToken() {
        return token.get();
    }

    public void setToken(String token) {
        this.token.set(token);
    }

    public String getRequestId() {
        return requestId.get();
    }

}