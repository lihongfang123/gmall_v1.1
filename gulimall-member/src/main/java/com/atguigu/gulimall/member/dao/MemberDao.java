package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lhf
 * @email 1452659757@qq.com
 * @date 2020-05-20 15:31:02
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
