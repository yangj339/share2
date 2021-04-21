package com.example.share2.user.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.share2.user.entity.User;
import com.example.share2.user.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author by yangJ
 * @Date 2021/4/21 19:28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
