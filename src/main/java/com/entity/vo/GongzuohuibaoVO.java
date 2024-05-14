package com.entity.vo;

import com.entity.GongzuohuibaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 工作汇报
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gongzuohuibao")
public class GongzuohuibaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "huibaoriqi")
    private Date huibaoriqi;


    /**
     * 创建时间 show2 photoShow
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
	 * 设置：创建时间 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
