package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 待办工作
 *
 * @author 
 * @email
 */
@TableName("daibangongzuo")
public class DaibangongzuoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public DaibangongzuoEntity() {

	}

	public DaibangongzuoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 员工
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 流程代码
     */
    @TableField(value = "daibangongzuo_name")

    private String daibangongzuoName;


    /**
     * 流程类型
     */
    @TableField(value = "daibangongzuo_types")

    private Integer daibangongzuoTypes;


    /**
     * 提交表格附件
     */
    @TableField(value = "daibangongzuo_file")

    private String daibangongzuoFile;


    /**
     * 审批结果
     */
    @TableField(value = "daibangongzuo_yesno_types")

    private Integer daibangongzuoYesnoTypes;


    /**
     * 审批意见
     */
    @TableField(value = "daibangongzuo_yesno_text")

    private String daibangongzuoYesnoText;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：员工
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：员工
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：流程代码
	 */
    public String getDaibangongzuoName() {
        return daibangongzuoName;
    }
    /**
	 * 获取：流程代码
	 */

    public void setDaibangongzuoName(String daibangongzuoName) {
        this.daibangongzuoName = daibangongzuoName;
    }
    /**
	 * 设置：流程类型
	 */
    public Integer getDaibangongzuoTypes() {
        return daibangongzuoTypes;
    }
    /**
	 * 获取：流程类型
	 */

    public void setDaibangongzuoTypes(Integer daibangongzuoTypes) {
        this.daibangongzuoTypes = daibangongzuoTypes;
    }
    /**
	 * 设置：提交表格附件
	 */
    public String getDaibangongzuoFile() {
        return daibangongzuoFile;
    }
    /**
	 * 获取：提交表格附件
	 */

    public void setDaibangongzuoFile(String daibangongzuoFile) {
        this.daibangongzuoFile = daibangongzuoFile;
    }
    /**
	 * 设置：审批结果
	 */
    public Integer getDaibangongzuoYesnoTypes() {
        return daibangongzuoYesnoTypes;
    }
    /**
	 * 获取：审批结果
	 */

    public void setDaibangongzuoYesnoTypes(Integer daibangongzuoYesnoTypes) {
        this.daibangongzuoYesnoTypes = daibangongzuoYesnoTypes;
    }
    /**
	 * 设置：审批意见
	 */
    public String getDaibangongzuoYesnoText() {
        return daibangongzuoYesnoText;
    }
    /**
	 * 获取：审批意见
	 */

    public void setDaibangongzuoYesnoText(String daibangongzuoYesnoText) {
        this.daibangongzuoYesnoText = daibangongzuoYesnoText;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Daibangongzuo{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", daibangongzuoName=" + daibangongzuoName +
            ", daibangongzuoTypes=" + daibangongzuoTypes +
            ", daibangongzuoFile=" + daibangongzuoFile +
            ", daibangongzuoYesnoTypes=" + daibangongzuoYesnoTypes +
            ", daibangongzuoYesnoText=" + daibangongzuoYesnoText +
            ", createTime=" + createTime +
        "}";
    }
}
