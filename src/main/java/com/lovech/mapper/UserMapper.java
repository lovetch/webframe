package com.lovech.mapper;

import java.util.List;

import com.lovech.entity.UserFormMap;
import com.lovech.mapper.base.BaseMapper;


public interface UserMapper extends BaseMapper{

	public List<UserFormMap> findUserPage(UserFormMap userFormMap);
	
}
