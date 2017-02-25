//package com.hpe.my.module.controller;
//
//
//import com.hpe.my.model.entiy.UserInfo;
//import com.hpe.my.module.dao.UserInfoDao;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
///**
// * Created by BaiRu on 2016/12/27.
// */
//@Controller
//@RequestMapping("/index")
//public class UserController{
//
//    @Autowired
//    private UserInfoDao userInfoDao;
//
//    @RequestMapping("")
//    public String index(Model model) {
//        UserInfo userInfo=userInfoDao.queryInfo();
//        model.addAttribute("userInfo",userInfo);
//        return "/index";
//    }
//}
