package ofedorova.cms.domain.service;

import ofedorova.cms.domain.exceptions.UserNotFoundException;
import ofedorova.cms.domain.models.User;
import ofedorova.cms.domain.repository.UserRepository;
import ofedorova.cms.domain.vo.UserRequest;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User update(String id, UserRequest userRequest) {
        final Optional<User> user = this.userRepository.findById(id);
        if (user.isPresent()) {
            final User userDB = user.get();
            userDB.setIdentity(userRequest.getIdentity());
            userDB.setName(userRequest.getName());
            userDB.setRole(userRequest.getRole());
            return this.userRepository.save(userDB);
        } else {
            throw new UserNotFoundException(id);
        }
    }

    public User create(UserRequest userRequest) {
        User user = new User();
        user.setId(UUID.randomUUID().toString());
        user.setIdentity(userRequest.getIdentity());
        user.setName(userRequest.getName());
        user.setRole(userRequest.getRole());
        return this.userRepository.save(user);
    }

    public void delete(String id) {
        final Optional<User> user = this.userRepository.findById(id);
        user.ifPresent(this.userRepository::delete);
    }

    public Iterable<User> findAll() {
        return this.userRepository.findAll();
    }

    public User findOne(String id) {
        final Optional<User> user = this.userRepository.findById(id);
        if (user.isPresent()) {
            return user.get();
        } else {
            throw new UserNotFoundException(id);
        }
    }
}
