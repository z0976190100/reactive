package com.crm.reactive.persistence.entity;


import org.hibernate.annotations.GeneratorType;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "usr")
public class User implements UserInterface{

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ElementCollection(targetClass = Role.class, fetch = FetchType.LAZY)
    @CollectionTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"))
    @Enumerated(EnumType.STRING)
    private Set<Role> role;

    @Column
    private String username;

    @Column
    private String password;

    @Column(columnDefinition = "TINYINT(1)", nullable = false)
    private boolean active;

    @Transient
    private final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<Role> getRole() {
        return role;
    }

    public void setRole(Set<Role> role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public PasswordEncoder getPASSWORD_ENCODER() {
        return PASSWORD_ENCODER;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
