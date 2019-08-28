package com.yehui.mapper.master;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yehui.mapper.master.MasterMapper;

@Service
public class MasterUserService {

	@Autowired
	private MasterMapper masterMapper;

	public List<Map<String, Object>> selectList1() {
		return masterMapper.selectList();
	}
}