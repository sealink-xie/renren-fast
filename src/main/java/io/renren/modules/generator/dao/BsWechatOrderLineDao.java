package io.renren.modules.generator.dao;

import io.renren.modules.generator.entity.BsWechatOrderLineEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 微店订单明细
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2018-04-16 10:09:51
 */
@Mapper
public interface BsWechatOrderLineDao extends BaseMapper<BsWechatOrderLineEntity> {
	
}
