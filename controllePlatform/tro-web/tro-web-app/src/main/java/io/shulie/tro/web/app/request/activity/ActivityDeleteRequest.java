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

package io.shulie.tro.web.app.request.activity;

import javax.validation.constraints.NotNull;

import io.shulie.tro.web.amdb.bean.common.EntranceTypeEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author shiyajian
 * create: 2020-12-29
 */
@Data
@ApiModel("业务活动修改对象")
public class ActivityDeleteRequest {

    @NotNull
    @ApiModelProperty("业务活动ID")
    private Long activityId;

    @ApiModelProperty("业务活动名称")
    private String activityName;

    @ApiModelProperty("应用id")
    private Long applicationId;

    @ApiModelProperty("应用名称")
    private String applicationName;

    @ApiModelProperty("应用类型")
    private EntranceTypeEnum type;

    private String method;

    private String rpcType;

    private String extend;

    private String serviceName;
}