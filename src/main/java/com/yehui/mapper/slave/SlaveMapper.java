package com.yehui.mapper.slave;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;
@Mapper
public interface SlaveMapper {
	@Select("SELECT * FROM tb_user")
	public List<Map<String, Object>> selectList();
}