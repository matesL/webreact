/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.webreact.server.userimp;

import com.example.webreact.entity.JWT.TokenUtil;
import com.example.webreact.server.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.webreact.mapper.post.userMapper;
public class userinfoserverimp {
    @Service
    public class IUserServiceImpl implements IUserService {

        @Autowired
        private userMapper userMapper;

        @Override
        public LoginDto login(User user) {
            LoginDto loginDto = new LoginDto();
            User login = userMapper.login(user);

            if (login == null){
                loginDto.setCode(400);
                loginDto.setMsg("账号或密码错误！");
                return loginDto;
            }
            String token= TokenUtil.sign(login);

            loginDto.setCode(200);
            loginDto.setMsg("登录成功!");
            loginDto.setUser(login);
            loginDto.setToken(token);
            return loginDto;
        }
}
