package com.angelsanchezt.banking.core.administration.domain.repository;

import com.angelsanchezt.banking.core.administration.persistence.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    List<User> getAll();
    Optional<User> getUser(String userName);
    User save(User user);
    void delete(String userName);

}
