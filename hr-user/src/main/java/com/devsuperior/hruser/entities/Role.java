package com.devsuperior.hruser.entities;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name ="roles")
public class Role implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
