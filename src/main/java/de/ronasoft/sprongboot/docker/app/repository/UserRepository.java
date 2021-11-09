package de.ronasoft.sprongboot.docker.app.repository;

import de.ronasoft.sprongboot.docker.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
