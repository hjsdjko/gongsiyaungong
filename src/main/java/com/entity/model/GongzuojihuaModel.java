package com.entity.model;

import com.entity.GongzuojihuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 工作计划
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GongzuojihuaModel implements Serializable {
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
     * 工作内容
     */
    private String gongzuoneirongText;


    /**
     * 计划内容
     */
    private String jihuaneirongText;


    /**
     * 计划方案
     */
    private String jihuafanganText;


    /**
     * 预计结果
     */
    private String yujijieguoText;


    /**
     * 备注
     */
    private String beizhuText;


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
	 * 获取：工作内容
	 */
    public String getGongzuoneirongText() {
        return gongzuoneirongText;
    }


    /**
	 * 设置：工作内容
	 */
    public void setGongzuoneirongText(String gongzuoneirongText) {
        this.gongzuoneirongText = gongzuoneirongText;
    }
    /**
	 * 获取：计划内容
	 */
    public String getJihuaneirongText() {
        return jihuaneirongText;
    }


    /**
	 * 设置：计划内容
	 */
    public void setJihuaneirongText(String jihuaneirongText) {
        this.jihuaneirongText = jihuaneirongText;
    }
    /**
	 * 获取：计划方案
	 */
    public String getJihuafanganText() {
        return jihuafanganText;
    }


    /**
	 * 设置：计划方案
	 */
    public void setJihuafanganText(String jihuafanganText) {
        this.jihuafanganText = jihuafanganText;
    }
    /**
	 * 获取：预计结果
	 */
    public String getYujijieguoText() {
        return yujijieguoText;
    }


    /**
	 * 设置：预计结果
	 */
    public void setYujijieguoText(String yujijieguoText) {
        this.yujijieguoText = yujijieguoText;
    }
    /**
	 * 获取：备注
	 */
    public String getBeizhuText() {
        return beizhuText;
    }


    /**
	 * 设置：备注
	 */
    public void setBeizhuText(String beizhuText) {
        this.beizhuText = beizhuText;
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
