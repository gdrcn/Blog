package com.rdc.service;

import com.rdc.dao.BlogDao;
import com.rdc.dao.CommentDao;
import com.rdc.dao.UpDao;
import com.rdc.dao.UserDao;
import com.rdc.entity.Blog;
import com.rdc.entity.Comment;
import com.rdc.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:config/spring-mybatis.xml"})
public class UserServiceTest {

    @Autowired
    public UserService userService;

    @Autowired
    private BlogService blogService;
    @Autowired
    private CommentDao commentDao;


    @Test
    public void getUserInfo() {

        System.out.println(commentDao.getBlogFirstCommentCount(12)+commentDao.getBlogSecondCommentCount(12));
    }




}