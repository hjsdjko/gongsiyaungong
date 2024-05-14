package com.entity.model;

import com.entity.GongzuohuibaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 工作汇报
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GongzuohuibaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 汇报名称
     */
    private String gongzuohuibaoName;


    /**
     * 工作类型
     */
    private Integer gongzuohuibaoTypes;


    /**
     * 工作内容
     */
    private String gongzuohuibaoText;


    /**
     * 工作周期
     */
    private String gongzuozhouqi;


    /**
     * 完成情况
     */
    private String wanchengqingkuang;


    /**
     * 解决措施
     */
    private String jiejuecuoshi;


    /**
     * 备注
     */
    private String beizhu;


    /**
     * 员工
     */
    private Integer yonghuId;


    /**
     * 汇报日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date huibaoriqi;


    /**
     * 创建时间 show2 photoShow
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
	 * 获取：汇报名称
	 */
    public String getGongzuohuibaoName() {
        return gongzuohuibaoName;
    }


    /**
	 * 设置：汇报名称
	 */
    public void setGongzuohuibaoName(String gongzuohuibaoName) {
        this.gongzuohuibaoName = gongzuohuibaoName;
    }
    /**
	 * 获取：工作类型
	 */
    public Integer getGongzuohuibaoTypes() {
        return gongzuohuibaoTypes;
    }


    /**
	 * 设置：工作类型
	 */
    public void setGongzuohuibaoTypes(Integer gongzuohuibaoTypes) {
        this.gongzuohuibaoTypes = gongzuohuibaoTypes;
    }
    /**
	 * 获取：工作内容
	 */
    public String getGongzuohuibaoText() {
        return gongzuohuibaoText;
    }


    /**
	 * 设置：工作内容
	 */
    public void setGongzuohuibaoText(String gongzuohuibaoText) {
        this.gongzuohuibaoText = gongzuohuibaoText;
    }
    /**
	 * 获取：工作周期
	 */
    public String getGongzuozhouqi() {
        return gongzuozhouqi;
    }


    /**
	 * 设置：工作周期
	 */
    public void setGongzuozhouqi(String gongzuozhouqi) {
        this.gongzuozhouqi = gongzuozhouqi;
    }
    /**
	 * 获取：完成情况
	 */
    public String getWanchengqingkuang() {
        return wanchengqingkuang;
    }


    /**
	 * 设置：完成情况
	 */
    public void setWanchengqingkuang(String wanchengqingkuang) {
        this.wanchengqingkuang = wanchengqingkuang;
    }
    /**
	 * 获取：解决措施
	 */
    public String getJiejuecuoshi() {
        return jiejuecuoshi;
    }


    /**
	 * 设置：解决措施
	 */
    public void setJiejuecuoshi(String jiejuecuoshi) {
        this.jiejuecuoshi = jiejuecuoshi;
    }
    /**
	 * 获取：备注
	 */
    public String getBeizhu() {
        return beizhu;
    }


    /**
	 * 设置：备注
	 */
    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
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
	 * 获取：汇报日期
	 */
    public Date getHuibaoriqi() {
        return huibaoriqi;
    }


    /**
	 * 设置：汇报日期
	 */
    public void setHuibaoriqi(Date huibaoriqi) {
        this.huibaoriqi = huibaoriqi;
    }
    /**
	 * 获取：创建时间 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
