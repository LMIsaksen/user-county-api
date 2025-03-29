package no.klp.user_county_api.repository;

import no.klp.user_county_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

