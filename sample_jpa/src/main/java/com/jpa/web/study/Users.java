package com.jpa.web.study;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author : JB
 * @packageName : com.jpa.web.study
 * @fileName : Users
 * @description :
 * @since : 2023-02-22
 */

@Entity(name="users")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Users {

    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="user_name")
    private String name;

    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<UserRoles> roles = new HashSet<>();
}
