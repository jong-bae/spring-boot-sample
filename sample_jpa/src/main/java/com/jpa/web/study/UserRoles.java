package com.jpa.web.study;

import lombok.Getter;

import javax.persistence.*;

/**
 * @author : JB
 * @packageName : com.jpa.web.study
 * @fileName : UserRoles
 * @description :
 * @since : 2023-02-22
 */

@Entity(name="user_roles")
@Getter
public class UserRoles {

    @EmbeddedId
    private UserRolesId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("userId")
    private Users users;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("roleId")
    private Roles roles;

}
