package com.crm.reactive.persistence.entity;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {

    ADMIN,
    SUPERUSER,
    USER;


    @Override
    public String getAuthority() {
        return name();
    }
}
