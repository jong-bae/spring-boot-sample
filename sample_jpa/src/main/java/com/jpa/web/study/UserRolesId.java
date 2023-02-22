package com.jpa.web.study;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * @author : JB
 * @packageName : com.jpa.web.study
 * @fileName : UserRolesId
 * @description :
 * @since : 2023-02-22
 */

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRolesId implements Serializable {

    private Integer userId;
    private Integer roleId;


}
