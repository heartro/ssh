package com.zhangwei.service;

import com.zhangwei.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring/SpringContext.xml"})
public class TestIndexService extends AbstractTransactionalJUnit4SpringContextTests {
    @Autowired
    private IndexService indexService;

    @Test
//    @Rollback(false)
    public void testAddUser() {
        User user = new User("王五", "wangwu", "123456", new Date());
        indexService.addUser(user);
        System.out.println(user);
    }

    @Test
    public void testGetUserAll() {
        List<User> list = indexService.getUserAll();
        for (User user : list) {
            System.out.println(user);
        }
    }
}
