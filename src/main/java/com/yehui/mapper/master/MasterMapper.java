package com.yehui.mapper.master;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface MasterMapper {

	@Select("SELECT * FROM tb_user")
	public List<Map<String, Object>> selectList();
}