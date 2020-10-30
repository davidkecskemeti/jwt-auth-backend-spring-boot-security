package hu.dk.reactjwt.repository;

import hu.dk.reactjwt.entity.UserRole;
import hu.dk.reactjwt.entity.UserRoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    Optional<UserRole> findByName(UserRoleName name);
}