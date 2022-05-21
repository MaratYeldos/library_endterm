package com.example.final_java_yeldos.model;

import org.springframework.security.core.GrantedAuthority;

public enum RoleType implements GrantedAuthority {
    ROLE_ADMIN, ROLE_CLIENT;

    public String getAuthority() {
        return name();
    }
}
