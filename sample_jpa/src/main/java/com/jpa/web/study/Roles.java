package com.jpa.web.study;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : JB
 * @packageName : com.jpa.web.study
 * @fileName : Roles
 * @description :
 * @since : 2023-02-22
 */

@Entity(name="roles")
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Roles {

    @Id
    @Column(name="role_id")
    private Integer id;

    @Column(name="name")
    private String name;

    @OneToMany(mappedBy = "roles", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<UserRoles> users = new ArrayList<>();

}
