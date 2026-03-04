package com.example.college.contoller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.college.entity.Emp;
import com.example.college.service.EmpService;

@Controller
public class EmpController {
	@Autowired
	EmpService empservice;
	@GetMapping("/register")
	public String registerEmp(Model m)
	{
		m.addAttribute("emp",new Emp());
		return "register";
	}
	@PostMapping("/add")
	public String addnewemp(Emp e)
	{
		empservice.addEmp(e);
		return "redirect:/emplist";
	}
	@GetMapping("/emplist")
   public String getEmpList(Model m)
   {
		m.addAttribute("el",empservice.getEmpList());
	   return "emplist";
   }
	@GetMapping("/updateemp/{id}")
	public String showEditForm(@PathVariable int id,Model m)
	{
		Optional<Emp> empop=empservice.getEmpById(id);
		if(empop.isPresent())
		{
			m.addAttribute("emp", empop.get());
			return "updateemp";
		}
		else {
		return "redirect:/emplist";
		}
	}
	@PostMapping("/updateemp/{id}")
	public String updateEmp(@PathVariable int id,Emp e)
	{
		e.setId(id);
		empservice.updateEmp(e);
		return "redirect:/emplist";
	}
	@GetMapping("/deleteemp/{id}")
	public String deleteEmp(@PathVariable int id)
	{
		empservice.deleteEmp(id);
		return "redirect:/emplist";
	}
}
