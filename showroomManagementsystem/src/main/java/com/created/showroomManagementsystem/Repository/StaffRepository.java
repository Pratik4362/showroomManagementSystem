package Created.Showroom.Management.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Created.Showroom.Management.System.entity.StaffEntity;

@Repository
public interface StaffRepository extends JpaRepository<StaffEntity, Long>{

}
