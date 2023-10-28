package Created.Showroom.Management.System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Created.Showroom.Management.System.entity.StaffEntity;
import Created.Showroom.Management.System.repository.StaffRepository;

@Service
public class StaffService {
	
	@Autowired
	StaffRepository staffrepository;
	
	public StaffEntity save(StaffEntity staffentity) {
		return staffrepository.save(staffentity);
	}
	
	public StaffEntity getById(Long id) {
		return staffrepository.findById(id).get();
	}
	
	public List<StaffEntity> getAll() {
		return staffrepository.findAll();
	}
	
	public String deleteByid(Long id) {
		staffrepository.deleteById(id);
		return "Record deleted successfully";
	}
	
	public StaffEntity update(StaffEntity correctedEntity, Long id) {
		StaffEntity staffentity =staffrepository.findById(id).get();
		if(correctedEntity.getName()!=null) {
			staffentity.setName(correctedEntity.getName());
		}
		if(correctedEntity.getAddress()!=null) {
			staffentity.setAddress(correctedEntity.getAddress());
		}
		if(correctedEntity.getCity()!=null) {
			staffentity.setCity(correctedEntity.getCity());
		}
		if(correctedEntity.getContact()!=null) {
			staffentity.setContact(correctedEntity.getContact());
		}
		return staffrepository.save(staffentity);
	}
	
	

}
