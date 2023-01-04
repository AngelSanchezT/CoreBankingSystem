package com.angelsanchezt.banking.core.administration.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import java.time.LocalDateTime;

import com.angelsanchezt.banking.core.security.PasswordHasher;
import lombok.Data;

@Entity
@Data
@Table(schema = "administration", name = "user")
public class User {

    @Id
    @Column(name = "user_name")
    private String userName;

    private String password;

    @Column(name = "fisrt_name")
    private String fisrtName;

    @Column(name = "last_name")
    private String lastName;

    private String email;
    private String status;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_time")
    private LocalDateTime createdTime;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "updated_time")
    private LocalDateTime updatedTime;

    public void setPassword(String password) {
        this.password = PasswordHasher.hashPassword(password);
    }
}
