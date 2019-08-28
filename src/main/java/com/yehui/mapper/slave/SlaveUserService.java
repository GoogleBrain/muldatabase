package com.yehui.mapper.slave;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yehui.mapper.slave.SlaveMapper;

@Service
public class SlaveUserService {

	@Autowired
	private SlaveMapper savlesMapper;

	public List<Map<String, Object>> selectList2() {
		return savlesMapper.selectList();
	}
}