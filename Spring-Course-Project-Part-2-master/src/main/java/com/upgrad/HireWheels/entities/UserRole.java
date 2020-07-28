package com.upgrad.HireWheels.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="USERROLE")
public class UserRole {
    @Id
    int id;
    @Column(unique = true)
    String roleName;
    @OneToMany(mappedBy = "userRole", fetch = FetchType.LAZY)
    @JsonManagedReference
    List<User> userList;
}
