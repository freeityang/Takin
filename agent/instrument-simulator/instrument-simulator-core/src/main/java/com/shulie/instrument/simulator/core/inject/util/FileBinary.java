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
package com.shulie.instrument.simulator.core.inject.util;

/**
 * Created by xiaobin on 2017/1/19.
 */
public class FileBinary {
    private final String className;

    private final byte[] fileBinary;

    private final String path;

    FileBinary(String fileName, byte[] fileBinary, String path) {
        if (fileName == null) {
            throw new NullPointerException("fileName must not be null");
        }
        if (fileBinary == null) {
            throw new NullPointerException("fileBinary must not be null");
        }
        this.className = fileName;
        this.fileBinary = fileBinary;
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public String getFileName() {
        return className;
    }

    public byte[] getFileBinary() {
        return fileBinary;
    }

    @Override
    public String toString() {
        return "FileBinary{" +
                "className='" + className + '\'' +
                ", fileBinarySize=" + fileBinary.length +
                '}';
    }
}
