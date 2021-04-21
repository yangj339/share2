package com.example.share2.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.share2.user.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Classname UserMapper
 * TODO
 * @Date 2021/4/21 19:22
 * @Created by yangjia
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
