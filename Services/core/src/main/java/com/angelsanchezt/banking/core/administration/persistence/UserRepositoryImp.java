package com.angelsanchezt.banking.core.administration.persistence;

import com.angelsanchezt.banking.core.administration.domain.repository.UserRepository;
import com.angelsanchezt.banking.core.administration.persistence.crud.UserCrudRepository;
import com.angelsanchezt.banking.core.administration.persistence.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class UserRepositoryImp implements UserRepository {

    @Autowired
    private UserCrudRepository userCrudRepository;


    @Override
    public List<User> getAll() {
        return (List<User>) userCrudRepository.findAll();
    }

    @Override
    public Optional<User> getUser(String userName) {
        return userCrudRepository.findById(userName);
    }

    @Override
    public User save(User user) {
        return userCrudRepository.save(user);
    }

    @Override
    public void delete(String userName) {
        userCrudRepository.deleteById(userName);
    }
}
