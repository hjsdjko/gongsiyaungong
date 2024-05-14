package com.dao;

import com.entity.GongzuojihuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GongzuojihuaView;

/**
 * 工作计划 Dao 接口
 *
 * @author 
 */
public interface GongzuojihuaDao extends BaseMapper<GongzuojihuaEntity> {

   List<GongzuojihuaView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
