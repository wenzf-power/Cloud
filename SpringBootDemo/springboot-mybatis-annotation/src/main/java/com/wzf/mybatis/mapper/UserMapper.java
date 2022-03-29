package com.wzf.mybatis.mapper;

import com.wzf.mybatis.entity.User;
import com.wzf.mybatis.mapper.provider.UserDAOProvider;
import org.apache.ibatis.annotations.*;

/**
 * UserMapper
 *
 **/
public interface UserMapper {

    @Select("SELECT * FROM user WHERE username = #{username}")
    User findByName(@Param("username") String name);

    @Insert("INSERT INTO user(username, password) VALUES(#{username}, #{password})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    int save(@Param("name") String name, @Param("password") String password);

    @UpdateProvider(type = UserDAOProvider.class, method = "updateByPrimaryKey")
    int updateById(@Param("user") User user);

    @Delete("delete from user where id = #{id}")
    int deleteById(@Param("id") Integer id);
}
