package com.cmbt.demo.mapper;

import com.cmbt.demo.model.Sex;
import com.cmbt.demo.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserMapper {

	@Select("SELECT * FROM t_user")
	@Results({
			@Result(property = "userId",  column = "user_id"),
			@Result(property = "userName", column = "user_name"),
			@Result(property = "password", column = "password"),
			@Result(property = "phone", column = "phone"),
			@Result(property = "student", column = "student", javaType = boolean.class),
			@Result(property = "sex", column = "sex", javaType = Sex.class)
	})
	List<User> getList();


	@Select("SELECT * FROM t_user WHERE user_id = #{id}")
	@Results({
			@Result(property = "userId",  column = "user_id"),
			@Result(property = "userName", column = "user_name"),
			@Result(property = "password", column = "password"),
			@Result(property = "phone", column = "phone"),
			@Result(property = "student", column = "student", javaType = boolean.class),
			@Result(property = "sex", column = "sex", javaType = Sex.class)
	})
	User getUser(Integer id);

	@Insert("INSERT INTO t_user(user_name, password, phone, student, sex) VALUES(#{userName}, #{password}, #{phone}, #{student}, #{sex})")
	void insert(User user);

	@Update("UPDATE t_user SET user_name=#{userName},password=#{password} WHERE user_id =#{userId}")
	void update(User user);

	@Delete("DELETE FROM t_user WHERE user_id =#{id}")
	void delete(Long id);
}
