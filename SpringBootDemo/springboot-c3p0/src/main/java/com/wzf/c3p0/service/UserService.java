package com.wzf.c3p0.service;

import com.wzf.c3p0.domain.User;
import com.wzf.c3p0.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 数据业务层
 *
 **/
@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> getUsers(){
        return repo.getData();
    }

    public void insertUser(User user){
        repo.insertData(user);
    }
}
