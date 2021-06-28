/*
 * Copyright 2021 Shulie Technology, Co.Ltd
 * Email: shulie@shulie.io
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.shulie.tro.web.app.request.leakverify;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * @Author: fanxx
 * @Date: 2021/1/5 8:52 下午
 * @Description:
 */
@Data
public class LeakVerifyTaskStartRequest {

    /**
     * 引用类型：压测场景
     */
    @NotNull
    private Integer refType;

    /**
     * 压测场景id
     */
    @NotNull
    private Long refId;

    /**
     * 业务活动id
     */
    @NotEmpty
    private List<Long> businessActivityIds;

    /**
     * 报告id
     */
    @NotNull
    private Long reportId;

    /**
     * 验证频率 单位：分钟
     */
    @NotNull
    private Integer timeInterval;
}