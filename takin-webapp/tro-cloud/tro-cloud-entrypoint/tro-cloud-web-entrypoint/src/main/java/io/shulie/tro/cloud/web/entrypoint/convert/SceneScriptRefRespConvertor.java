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

package io.shulie.tro.cloud.web.entrypoint.convert;

import io.shulie.tro.cloud.biz.output.scenemanage.SceneManageWrapperOutput;
import io.shulie.tro.cloud.web.entrypoint.response.scenemanage.SceneManageWrapperResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @Author: mubai
 * @Date: 2020-10-30 12:54
 * @Description:
 */

@Mapper
public interface SceneScriptRefRespConvertor {

    SceneScriptRefRespConvertor INSTANCE = Mappers.getMapper(SceneScriptRefRespConvertor.class);

    SceneManageWrapperResponse.SceneScriptRefResponse of(SceneManageWrapperOutput.SceneScriptRefOutput output);

    List<SceneManageWrapperResponse.SceneScriptRefResponse> ofList(List<SceneManageWrapperOutput.SceneScriptRefOutput> output);


}