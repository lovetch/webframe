package com.lovech.mapper;

import java.util.List;

import com.lovech.entity.RoleFormMap;
import com.lovech.mapper.base.BaseMapper;

public interface RoleMapper extends BaseMapper{
	public List<RoleFormMap> seletUserRole(RoleFormMap map);
	
	public void deleteById(RoleFormMap map);
}
