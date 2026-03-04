package com.example.college.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.college.entity.Emp;
import com.example.college.repository.EmpRepository;

@Service
public class EmpService {
	@Autowired
	EmpRepository erepo;
	public boolean addEmp(Emp e)
	{
		erepo.save(e);
		return true;
	}
	public List<Emp> getEmpList()
	{
		return erepo.findAll();
	}
	public Optional<Emp> getEmpById(int id)
	{
		return erepo.findById(id);
	}
	public boolean updateEmp(Emp e)
	{
		if(erepo.existsById(e.getId()))
		{
			erepo.save(e);
			return true;
		}
		return false;
	}
	public boolean deleteEmp(int id)
	{
		if(erepo.existsById(id))
		{
			erepo.deleteById(id);
			return true;
		}
		return false;
	}

}
