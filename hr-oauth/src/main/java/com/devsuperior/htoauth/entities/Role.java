package com.devsuperior.htoauth.entities;

import java.io.Serializable;

public class Role implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String roleName;

    public Role(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRolename() {
        return roleName;
    }

    public void setRolename(String rolename) {
        this.roleName = rolename;
    }

    public Role(Long id, String rolename) {
        this.id = id;
        this.roleName = rolename;
    }
}
