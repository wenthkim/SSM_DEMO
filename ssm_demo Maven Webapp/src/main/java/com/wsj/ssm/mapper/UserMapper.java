package com.wsj.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.wsj.ssm.bean.User;

public interface UserMapper {

	@Select("select * from user")
	List<User> findall();

}
