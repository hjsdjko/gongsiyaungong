package com.entity.vo;

import com.entity.DaibangongzuoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 待办工作
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("daibangongzuo")
public class DaibangongzuoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "create_time")
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

}
