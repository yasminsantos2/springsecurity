package tech.buildrun.springsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.buildrun.springsecurity.entities.User;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
