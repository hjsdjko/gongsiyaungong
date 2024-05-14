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
 * 会议信息
 *
 * @author 
 * @email
 */
@TableName("huiyi")
public class HuiyiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HuiyiEntity() {

	}

	public HuiyiEntity(T t) {
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
     * 会议名称
     */
    @TableField(value = "huiyi_name")

    private String huiyiName;


    /**
     * 会议地点
     */
    @TableField(value = "huiyi_address")

    private String huiyiAddress;


    /**
     * 房间号
     */
    @TableField(value = "fangjianhao")

    private String fangjianhao;


    /**
     * 会议内容
     */
    @TableField(value = "huiyineirong_text")

    private String huiyineirongText;


    /**
     * 重要人员
     */
    @TableField(value = "zhongyaorenyuan")

    private String zhongyaorenyuan;


    /**
     * 详情
     */
    @TableField(value = "xiangqing_text")

    private String xiangqingText;


    /**
     * 开会时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "kaihuishijian_time")

    private Date kaihuishijianTime;


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
	 * 设置：会议名称
	 */
    public String getHuiyiName() {
        return huiyiName;
    }
    /**
	 * 获取：会议名称
	 */

    public void setHuiyiName(String huiyiName) {
        this.huiyiName = huiyiName;
    }
    /**
	 * 设置：会议地点
	 */
    public String getHuiyiAddress() {
        return huiyiAddress;
    }
    /**
	 * 获取：会议地点
	 */

    public void setHuiyiAddress(String huiyiAddress) {
        this.huiyiAddress = huiyiAddress;
    }
    /**
	 * 设置：房间号
	 */
    public String getFangjianhao() {
        return fangjianhao;
    }
    /**
	 * 获取：房间号
	 */

    public void setFangjianhao(String fangjianhao) {
        this.fangjianhao = fangjianhao;
    }
    /**
	 * 设置：会议内容
	 */
    public String getHuiyineirongText() {
        return huiyineirongText;
    }
    /**
	 * 获取：会议内容
	 */

    public void setHuiyineirongText(String huiyineirongText) {
        this.huiyineirongText = huiyineirongText;
    }
    /**
	 * 设置：重要人员
	 */
    public String getZhongyaorenyuan() {
        return zhongyaorenyuan;
    }
    /**
	 * 获取：重要人员
	 */

    public void setZhongyaorenyuan(String zhongyaorenyuan) {
        this.zhongyaorenyuan = zhongyaorenyuan;
    }
    /**
	 * 设置：详情
	 */
    public String getXiangqingText() {
        return xiangqingText;
    }
    /**
	 * 获取：详情
	 */

    public void setXiangqingText(String xiangqingText) {
        this.xiangqingText = xiangqingText;
    }
    /**
	 * 设置：开会时间
	 */
    public Date getKaihuishijianTime() {
        return kaihuishijianTime;
    }
    /**
	 * 获取：开会时间
	 */

    public void setKaihuishijianTime(Date kaihuishijianTime) {
        this.kaihuishijianTime = kaihuishijianTime;
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
        return "Huiyi{" +
            "id=" + id +
            ", huiyiName=" + huiyiName +
            ", huiyiAddress=" + huiyiAddress +
            ", fangjianhao=" + fangjianhao +
            ", huiyineirongText=" + huiyineirongText +
            ", zhongyaorenyuan=" + zhongyaorenyuan +
            ", xiangqingText=" + xiangqingText +
            ", kaihuishijianTime=" + kaihuishijianTime +
            ", createTime=" + createTime +
        "}";
    }
}
