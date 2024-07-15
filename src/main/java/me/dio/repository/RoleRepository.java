package me.dio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}