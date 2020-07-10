package com.zhangwei.dao;

import com.zhangwei.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAO {

    public List<User> selectAll() {
        return sessionFactory.getCurrentSession().createQuery("from User", User.class).list();
    }

    @Autowired
    private SessionFactory sessionFactory;
}
