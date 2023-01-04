package com.angelsanchezt.banking.core.administration.domain.service;

import com.angelsanchezt.banking.core.administration.persistence.UserRepositoryImp;
import com.angelsanchezt.banking.core.administration.persistence.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class UserService {
    @Autowired
    private UserRepositoryImp userRepositoryImp;

    public List<User> getAll() {
        return userRepositoryImp.getAll();
    }

    public Optional<User> getUser(String userName) {
        return userRepositoryImp.getUser(userName);
    }

    public User save(User user) {



        return userRepositoryImp.save(user);
    }

    public boolean delete(String userName) {
        try {
            userRepositoryImp.delete(userName);
            return true;
        } catch(EmptyResultDataAccessException e) {
            return false;
        }
    }

}
