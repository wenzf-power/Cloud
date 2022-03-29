package com.wzf.cache.repository;

import com.wzf.cache.dto.UserDto;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据工厂，模拟数据库的数据
 *
 **/
public class DataFactory {

    private DataFactory() {
    }

    private static List<UserDto> userDtoList;

    static {
        // 初始化集合
        userDtoList = new ArrayList<>();

        UserDto user = null;
        for (int i = 0; i < 10; i++) {
            user = new UserDto();
            user.setName("wzf" + i);
            user.setAge("2" + i);
            userDtoList.add(user);
        }
    }

    public static List<UserDto> getUserDaoList() {
        return userDtoList;
    }
}
