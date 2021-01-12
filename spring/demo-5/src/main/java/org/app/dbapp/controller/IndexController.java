package org.app.dbapp.controller;

import java.util.List;

import org.app.dbapp.entity.UserInfo;
import org.app.dbapp.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Autowired
    UserInfoMapper userInfoMapper;

    @RequestMapping
    public String index(Model model) {
        List<UserInfo> list = userInfoMapper.selectAll();
        model.addAttribute("userInfo", list);
        return "index";
    }
}