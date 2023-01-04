package com.angelsanchezt.banking.core.administration.persistence.crud;

import com.angelsanchezt.banking.core.administration.persistence.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCrudRepository extends CrudRepository<User, String> {

}
