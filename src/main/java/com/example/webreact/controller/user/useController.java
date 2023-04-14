/*
 * Copyright (c) 2023. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.webreact.controller.user;

import com.example.webreact.entity.basecat.UserInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class useController {
/**
 * @description defaultDescription
 * @param userInfo
 * @author lucky
 * @date 2023/4/14 16:58
 */
    @PostMapping("/login")
    public UserInfo login(UserInfo userInfo){

        return  userInfo;
    }
}
