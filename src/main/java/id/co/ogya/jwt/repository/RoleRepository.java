package id.co.ogya.jwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import id.co.ogya.jwt.entity.Role;
import id.co.ogya.jwt.entity.RoleName;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
	
	Optional<Role> findByName(RoleName roleName);
	
}
