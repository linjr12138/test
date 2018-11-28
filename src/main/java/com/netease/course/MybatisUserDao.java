package com.netease.course;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface MybatisUserDao {

	@Select("Select * from user")
	public List<User> getUserList();
}
