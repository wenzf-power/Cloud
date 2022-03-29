package com.wzf.mybatis.mapper.secondary;

import com.wzf.mybatis.entity.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * BookMapper
 *
 **/
public interface BookMapper {

    /**
     * 根据 name 查询数据
     */
    @Select("SELECT * FROM book WHERE name = #{name}")
    Book findByName(@Param("name") String name);

    /**
     * 添加数据
     */
    @Insert("INSERT INTO book(id, name, number) VALUE(#{id}, #{name}, #{number})")
    int insert(@Param("id") String id,
               @Param("name") String name,
               @Param("number") Integer number);
}
