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
 * 工作计划
 *
 * @author 
 * @email
 */
@TableName("gongzuojihua")
public class GongzuojihuaEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GongzuojihuaEntity() {

	}

	public GongzuojihuaEntity(T t) {
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
     * 工作内容
     */
    @TableField(value = "gongzuoneirong_text")

    private String gongzuoneirongText;


    /**
     * 计划内容
     */
    @TableField(value = "jihuaneirong_text")

    private String jihuaneirongText;


    /**
     * 计划方案
     */
    @TableField(value = "jihuafangan_text")

    private String jihuafanganText;


    /**
     * 预计结果
     */
    @TableField(value = "yujijieguo_text")

    private String yujijieguoText;


    /**
     * 备注
     */
    @TableField(value = "beizhu_text")

    private String beizhuText;


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
	 * 设置：工作内容
	 */
    public String getGongzuoneirongText() {
        return gongzuoneirongText;
    }
    /**
	 * 获取：工作内容
	 */

    public void setGongzuoneirongText(String gongzuoneirongText) {
        this.gongzuoneirongText = gongzuoneirongText;
    }
    /**
	 * 设置：计划内容
	 */
    public String getJihuaneirongText() {
        return jihuaneirongText;
    }
    /**
	 * 获取：计划内容
	 */

    public void setJihuaneirongText(String jihuaneirongText) {
        this.jihuaneirongText = jihuaneirongText;
    }
    /**
	 * 设置：计划方案
	 */
    public String getJihuafanganText() {
        return jihuafanganText;
    }
    /**
	 * 获取：计划方案
	 */

    public void setJihuafanganText(String jihuafanganText) {
        this.jihuafanganText = jihuafanganText;
    }
    /**
	 * 设置：预计结果
	 */
    public String getYujijieguoText() {
        return yujijieguoText;
    }
    /**
	 * 获取：预计结果
	 */

    public void setYujijieguoText(String yujijieguoText) {
        this.yujijieguoText = yujijieguoText;
    }
    /**
	 * 设置：备注
	 */
    public String getBeizhuText() {
        return beizhuText;
    }
    /**
	 * 获取：备注
	 */

    public void setBeizhuText(String beizhuText) {
        this.beizhuText = beizhuText;
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
        return "Gongzuojihua{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", gongzuoneirongText=" + gongzuoneirongText +
            ", jihuaneirongText=" + jihuaneirongText +
            ", jihuafanganText=" + jihuafanganText +
            ", yujijieguoText=" + yujijieguoText +
            ", beizhuText=" + beizhuText +
            ", createTime=" + createTime +
        "}";
    }
}
