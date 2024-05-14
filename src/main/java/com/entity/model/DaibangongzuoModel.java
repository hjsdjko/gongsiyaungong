package com.entity.model;

import com.entity.DaibangongzuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 待办工作
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class DaibangongzuoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 员工
     */
    private Integer yonghuId;


    /**
     * 流程代码
     */
    private String daibangongzuoName;


    /**
     * 流程类型
     */
    private Integer daibangongzuoTypes;


    /**
     * 提交表格附件
     */
    private String daibangongzuoFile;


    /**
     * 审批结果
     */
    private Integer daibangongzuoYesnoTypes;


    /**
     * 审批意见
     */
    private String daibangongzuoYesnoText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：员工
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：员工
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：流程代码
	 */
    public String getDaibangongzuoName() {
        return daibangongzuoName;
    }


    /**
	 * 设置：流程代码
	 */
    public void setDaibangongzuoName(String daibangongzuoName) {
        this.daibangongzuoName = daibangongzuoName;
    }
    /**
	 * 获取：流程类型
	 */
    public Integer getDaibangongzuoTypes() {
        return daibangongzuoTypes;
    }


    /**
	 * 设置：流程类型
	 */
    public void setDaibangongzuoTypes(Integer daibangongzuoTypes) {
        this.daibangongzuoTypes = daibangongzuoTypes;
    }
    /**
	 * 获取：提交表格附件
	 */
    public String getDaibangongzuoFile() {
        return daibangongzuoFile;
    }


    /**
	 * 设置：提交表格附件
	 */
    public void setDaibangongzuoFile(String daibangongzuoFile) {
        this.daibangongzuoFile = daibangongzuoFile;
    }
    /**
	 * 获取：审批结果
	 */
    public Integer getDaibangongzuoYesnoTypes() {
        return daibangongzuoYesnoTypes;
    }


    /**
	 * 设置：审批结果
	 */
    public void setDaibangongzuoYesnoTypes(Integer daibangongzuoYesnoTypes) {
        this.daibangongzuoYesnoTypes = daibangongzuoYesnoTypes;
    }
    /**
	 * 获取：审批意见
	 */
    public String getDaibangongzuoYesnoText() {
        return daibangongzuoYesnoText;
    }


    /**
	 * 设置：审批意见
	 */
    public void setDaibangongzuoYesnoText(String daibangongzuoYesnoText) {
        this.daibangongzuoYesnoText = daibangongzuoYesnoText;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
