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
 * 工作汇报
 *
 * @author 
 * @email
 */
@TableName("gongzuohuibao")
public class GongzuohuibaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GongzuohuibaoEntity() {

	}

	public GongzuohuibaoEntity(T t) {
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
     * 汇报名称
     */
    @TableField(value = "gongzuohuibao_name")

    private String gongzuohuibaoName;


    /**
     * 工作类型
     */
    @TableField(value = "gongzuohuibao_types")

    private Integer gongzuohuibaoTypes;


    /**
     * 工作内容
     */
    @TableField(value = "gongzuohuibao_text")

    private String gongzuohuibaoText;


    /**
     * 工作周期
     */
    @TableField(value = "gongzuozhouqi")

    private String gongzuozhouqi;


    /**
     * 完成情况
     */
    @TableField(value = "wanchengqingkuang")

    private String wanchengqingkuang;


    /**
     * 解决措施
     */
    @TableField(value = "jiejuecuoshi")

    private String jiejuecuoshi;


    /**
     * 备注
     */
    @TableField(value = "beizhu")

    private String beizhu;


    /**
     * 员工
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 汇报日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "huibaoriqi")

    private Date huibaoriqi;


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
	 * 设置：汇报名称
	 */
    public String getGongzuohuibaoName() {
        return gongzuohuibaoName;
    }
    /**
	 * 获取：汇报名称
	 */

    public void setGongzuohuibaoName(String gongzuohuibaoName) {
        this.gongzuohuibaoName = gongzuohuibaoName;
    }
    /**
	 * 设置：工作类型
	 */
    public Integer getGongzuohuibaoTypes() {
        return gongzuohuibaoTypes;
    }
    /**
	 * 获取：工作类型
	 */

    public void setGongzuohuibaoTypes(Integer gongzuohuibaoTypes) {
        this.gongzuohuibaoTypes = gongzuohuibaoTypes;
    }
    /**
	 * 设置：工作内容
	 */
    public String getGongzuohuibaoText() {
        return gongzuohuibaoText;
    }
    /**
	 * 获取：工作内容
	 */

    public void setGongzuohuibaoText(String gongzuohuibaoText) {
        this.gongzuohuibaoText = gongzuohuibaoText;
    }
    /**
	 * 设置：工作周期
	 */
    public String getGongzuozhouqi() {
        return gongzuozhouqi;
    }
    /**
	 * 获取：工作周期
	 */

    public void setGongzuozhouqi(String gongzuozhouqi) {
        this.gongzuozhouqi = gongzuozhouqi;
    }
    /**
	 * 设置：完成情况
	 */
    public String getWanchengqingkuang() {
        return wanchengqingkuang;
    }
    /**
	 * 获取：完成情况
	 */

    public void setWanchengqingkuang(String wanchengqingkuang) {
        this.wanchengqingkuang = wanchengqingkuang;
    }
    /**
	 * 设置：解决措施
	 */
    public String getJiejuecuoshi() {
        return jiejuecuoshi;
    }
    /**
	 * 获取：解决措施
	 */

    public void setJiejuecuoshi(String jiejuecuoshi) {
        this.jiejuecuoshi = jiejuecuoshi;
    }
    /**
	 * 设置：备注
	 */
    public String getBeizhu() {
        return beizhu;
    }
    /**
	 * 获取：备注
	 */

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
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
	 * 设置：汇报日期
	 */
    public Date getHuibaoriqi() {
        return huibaoriqi;
    }
    /**
	 * 获取：汇报日期
	 */

    public void setHuibaoriqi(Date huibaoriqi) {
        this.huibaoriqi = huibaoriqi;
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
        return "Gongzuohuibao{" +
            "id=" + id +
            ", gongzuohuibaoName=" + gongzuohuibaoName +
            ", gongzuohuibaoTypes=" + gongzuohuibaoTypes +
            ", gongzuohuibaoText=" + gongzuohuibaoText +
            ", gongzuozhouqi=" + gongzuozhouqi +
            ", wanchengqingkuang=" + wanchengqingkuang +
            ", jiejuecuoshi=" + jiejuecuoshi +
            ", beizhu=" + beizhu +
            ", yonghuId=" + yonghuId +
            ", huibaoriqi=" + huibaoriqi +
            ", createTime=" + createTime +
        "}";
    }
}
