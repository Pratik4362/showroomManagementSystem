package com.created.showroomManagementsystem.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.created.showroomManagementsystem.Entity.CustomerEntity;
import com.created.showroomManagementsystem.Repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;
	
	public CustomerEntity createdata(CustomerEntity save) {
		return customerRepository.save(save);
	}
	
	public CustomerEntity getbyid(@PathVariable Long id) {
		return customerRepository.findById(id).get();
	}
	public List<CustomerEntity> getAll(CustomerEntity all){
		return customerRepository.findAll();
	}
	public String deletebyid(@PathVariable Long id) {
		 customerRepository.deleteById(id);
		 return "Data_deleted";
	}
	public String deleteAll() {
		customerRepository.deleteAll();
		return "All data deleted";
	}
	public CustomerEntity updateByid(@RequestBody CustomerEntity c,@PathVariable Long id) {
		CustomerEntity customer= customerRepository.findById(id).get();
		if(c.getName()!=null) {
			customer.setName(c.getName());
		}
		if(c.getEmail()!=null) {
			customer.setEmail(c.getEmail());
		}
		if(c.getContact()!=null) {
			customer.setContact(c.getContact());
		}
		return customerRepository.save(customer);
	}
	

}
