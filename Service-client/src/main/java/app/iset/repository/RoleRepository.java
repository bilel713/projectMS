package app.iset.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.iset.entity.Role;

public interface RoleRepository extends JpaRepository<Role,Integer>{
	Role findByRole(String role);
}
