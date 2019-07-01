package com.shiki.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiki.springcloud.dao.DeptDao;
import com.shiki.springcloud.entity.Dept;
import com.shiki.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {
	
	@Autowired
	private DeptDao dao;
	
	@Override
	public boolean addDept(Dept dept) {
		return dao.addDept(dept);
	}

	@Override
	public Dept findById(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Dept> findAll() {
		return dao.findAll();
	}

}
