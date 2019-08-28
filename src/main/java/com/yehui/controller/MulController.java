package com.yehui.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yehui.mapper.master.MasterUserService;
import com.yehui.mapper.slave.SlaveUserService;
@RestController
public class MulController {

	@Autowired
	private MasterUserService master;

	@Autowired
	private SlaveUserService slave;

	@RequestMapping("/test1")
	public List test1() {
		return master.selectList1();
	}

	@RequestMapping("/test2")
	public List test2() {
		return slave.selectList2();
	}
}
