package id.co.ogya.jwt.repository;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;

import id.co.ogya.jwt.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
	
	Optional<User> findByEmail(String email);

    Optional<User> findByUsernameOrEmail(String username, String email);

    List<User> findByIdIn(List<Long> userIds);

    Optional<User> findByUsername(String username);

	boolean existsByUsername(String username);

	boolean existsByEmail(String email);

	User save(User user);

	Optional<User> findById(Long id);

}
