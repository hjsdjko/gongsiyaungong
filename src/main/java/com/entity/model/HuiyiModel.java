package com.entity.model;

import com.entity.HuiyiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 会议信息
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class HuiyiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 会议名称
     */
    private String huiyiName;


    /**
     * 会议地点
     */
    private String huiyiAddress;


    /**
     * 房间号
     */
    private String fangjianhao;


    /**
     * 会议内容
     */
    private String huiyineirongText;


    /**
     * 重要人员
     */
    private String zhongyaorenyuan;


    /**
     * 详情
     */
    private String xiangqingText;


    /**
     * 开会时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date kaihuishijianTime;


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
	 * 获取：会议名称
	 */
    public String getHuiyiName() {
        return huiyiName;
    }


    /**
	 * 设置：会议名称
	 */
    public void setHuiyiName(String huiyiName) {
        this.huiyiName = huiyiName;
    }
    /**
	 * 获取：会议地点
	 */
    public String getHuiyiAddress() {
        return huiyiAddress;
    }


    /**
	 * 设置：会议地点
	 */
    public void setHuiyiAddress(String huiyiAddress) {
        this.huiyiAddress = huiyiAddress;
    }
    /**
	 * 获取：房间号
	 */
    public String getFangjianhao() {
        return fangjianhao;
    }


    /**
	 * 设置：房间号
	 */
    public void setFangjianhao(String fangjianhao) {
        this.fangjianhao = fangjianhao;
    }
    /**
	 * 获取：会议内容
	 */
    public String getHuiyineirongText() {
        return huiyineirongText;
    }


    /**
	 * 设置：会议内容
	 */
    public void setHuiyineirongText(String huiyineirongText) {
        this.huiyineirongText = huiyineirongText;
    }
    /**
	 * 获取：重要人员
	 */
    public String getZhongyaorenyuan() {
        return zhongyaorenyuan;
    }


    /**
	 * 设置：重要人员
	 */
    public void setZhongyaorenyuan(String zhongyaorenyuan) {
        this.zhongyaorenyuan = zhongyaorenyuan;
    }
    /**
	 * 获取：详情
	 */
    public String getXiangqingText() {
        return xiangqingText;
    }


    /**
	 * 设置：详情
	 */
    public void setXiangqingText(String xiangqingText) {
        this.xiangqingText = xiangqingText;
    }
    /**
	 * 获取：开会时间
	 */
    public Date getKaihuishijianTime() {
        return kaihuishijianTime;
    }


    /**
	 * 设置：开会时间
	 */
    public void setKaihuishijianTime(Date kaihuishijianTime) {
        this.kaihuishijianTime = kaihuishijianTime;
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
