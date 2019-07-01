package com.shiki.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shiki.springcloud.entity.Dept;

@Service
public interface DeptService {
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
