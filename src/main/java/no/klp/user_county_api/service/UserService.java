package no.klp.user_county_api.service;


import no.klp.user_county_api.model.User;
import no.klp.user_county_api.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<User> getUsers(String type) {
        if (type == null) {
            return userRepository.findAll();
        } else {
            return userRepository.findByType(type);
        }
    }
}

