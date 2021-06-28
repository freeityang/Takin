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

package com.pamirs.tro.entity.domain.entity;

import java.util.Date;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.pamirs.tro.common.util.DateToStringFormatSerialize;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * tro基础配置
 *
 * @author 298403
 * @date 2019-03-28
 */
public class TBaseConfig extends BaseEntity {
    /**
     * 配置编码
     */
    private String configCode;

    /**
     * 配置值
     */
    private String configValue;

    /**
     * 配置说明
     */
    private String configDesc;

    /**
     * 是否有效 1 使用 0 不使用
     */
    private Integer useYn;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonSerialize(using = DateToStringFormatSerialize.class)
    private Date createTime;

    /**
     * 更新时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonSerialize(using = DateToStringFormatSerialize.class)
    private Date updateTime;

    /**
     * 全参数构造函数
     *
     * @param configCode
     * @param configValue
     * @param configDesc
     * @param useYn
     * @param createTime
     * @param updateTime
     */
    public TBaseConfig(String configCode, String configValue, String configDesc, Integer useYn, Date createTime,
        Date updateTime) {
        this.configCode = configCode;
        this.configValue = configValue;
        this.configDesc = configDesc;
        this.useYn = useYn;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    /**
     * 默认构造函数
     */
    public TBaseConfig() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_config.CONFIG_CODE
     *
     * @return the value of t_base_config.CONFIG_CODE
     * @mbggenerated
     */
    public String getConfigCode() {
        return configCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_config.CONFIG_CODE
     *
     * @param configCode the value for t_base_config.CONFIG_CODE
     * @mbggenerated
     */
    public void setConfigCode(String configCode) {
        this.configCode = configCode == null ? null : configCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_config.CONFIG_VALUE
     *
     * @return the value of t_base_config.CONFIG_VALUE
     * @mbggenerated
     */
    public String getConfigValue() {
        return configValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_config.CONFIG_VALUE
     *
     * @param configValue the value for t_base_config.CONFIG_VALUE
     * @mbggenerated
     */
    public void setConfigValue(String configValue) {
        this.configValue = configValue == null ? null : configValue.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_config.CONFIG_DESC
     *
     * @return the value of t_base_config.CONFIG_DESC
     * @mbggenerated
     */
    public String getConfigDesc() {
        return configDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_config.CONFIG_DESC
     *
     * @param configDesc the value for t_base_config.CONFIG_DESC
     * @mbggenerated
     */
    public void setConfigDesc(String configDesc) {
        this.configDesc = configDesc == null ? null : configDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_config.USE_YN
     *
     * @return the value of t_base_config.USE_YN
     * @mbggenerated
     */
    public Integer getUseYn() {
        return useYn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_config.USE_YN
     *
     * @param useYn the value for t_base_config.USE_YN
     * @mbggenerated
     */
    public void setUseYn(Integer useYn) {
        this.useYn = useYn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_config.CREATE_TIME
     *
     * @return the value of t_base_config.CREATE_TIME
     * @mbggenerated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_config.CREATE_TIME
     *
     * @param createTime the value for t_base_config.CREATE_TIME
     * @mbggenerated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_base_config.UPDATE_TIME
     *
     * @return the value of t_base_config.UPDATE_TIME
     * @mbggenerated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_base_config.UPDATE_TIME
     *
     * @param updateTime the value for t_base_config.UPDATE_TIME
     * @mbggenerated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}