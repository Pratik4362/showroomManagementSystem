package com.created.showroomManagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.created.showroomManagementsystem.Entity.CustomerEntity;
import com.created.showroomManagementsystem.Service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/saveData")
	public CustomerEntity createdata(@RequestBody CustomerEntity savedata) {
		return customerService.createdata(savedata);
	}
	
	@GetMapping("/getdata/{id}")
	public CustomerEntity getdata(@PathVariable Long id) {
		return customerService.getbyid(id);
	}
	@GetMapping("/getAll")
	public List<CustomerEntity> getAll(CustomerEntity All){
		return customerService.getAll(All);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable Long id) {
		return customerService.deletebyid(id);
	}
	@DeleteMapping("/deleteall")
	public String deleteAll() {
		return customerService.deleteAll();
	}
	@PutMapping("/update/{id}")
		public CustomerEntity updatebyId(@RequestBody CustomerEntity c,@PathVariable Long id) {
			return customerService.updateByid(c, id);
		}
	}


