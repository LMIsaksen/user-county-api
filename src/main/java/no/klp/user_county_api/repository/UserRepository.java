package no.klp.user_county_api.repository;

import no.klp.user_county_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByType(String type);
}

