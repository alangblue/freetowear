package com.freetowear.entity;

import com.freetowear.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer extends BaseEntity {

    @Column(nullable = false, length = 150)
    private String name;

    @Column(nullable = false, length = 100, unique = true)
    private String email;

    @Column(nullable = false, length = 255)
    private String password;

    @Column(length = 11, unique = true)
    private String cpf;

    @Column(length = 20)
    private String phone;

    @Column
    private LocalDate birthDate;

    @Column
    private Role role = Role.ROLE_USER;

    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt = LocalDateTime.now();

    @Column(nullable = false)
    private Boolean active = true;
}