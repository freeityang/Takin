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

package com.pamirs.tro.entity.domain.dto.linkmanage;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @Auther: vernon
 * @Date: 2019/12/23 20:00
 * @Description:这个是为了应前端要求,专门匹配的的模型
 */
@Data
@ApiModel(value = "entrancedto", description = "入口查询出参")
public class EntranceDto {
    @ApiModelProperty(name = "label", value = "应用名")
    private String label;
    @ApiModelProperty(name = "label", value = "应用名")
    private String value;
    @ApiModelProperty(name = "entrance", value = "当前应用下的入口集合")
    private List<EntranceDto> children;
}