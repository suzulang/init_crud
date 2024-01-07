package com.jiang.suzulangblogbackend;

import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.jiang.suzulangblogbackend.entity.UserInfo;
import com.jiang.suzulangblogbackend.mapper.UserInfoMapper;
import com.jiang.suzulangblogbackend.service.impl.UserInfoServiceImpl;
import org.apache.catalina.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class SuzulangBlogBackendApplicationTests {
    @Autowired
    UserInfoMapper userInfoMapper;
   @Test
    void test_reg(){
       List<UserInfo> userList = userInfoMapper.selectList(null);
       System.out.println(userList + "--------------------");
   }

}
