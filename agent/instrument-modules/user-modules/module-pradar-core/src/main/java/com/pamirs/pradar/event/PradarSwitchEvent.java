/**
 * Copyright 2021 Shulie Technology, Co.Ltd
 * Email: shulie@shulie.io
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.pamirs.pradar.event;

/**
 * @author xiaobin.zfb|xiaobin@shulie.io
 * @since 2020/10/26 9:25 下午
 */
public class PradarSwitchEvent implements Event {
    private boolean isEnabled;
    private String message;

    public PradarSwitchEvent(boolean isEnabled, String message) {
        this.isEnabled = isEnabled;
        this.message = message;
    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public String getMessage() {
        return message;
    }
}