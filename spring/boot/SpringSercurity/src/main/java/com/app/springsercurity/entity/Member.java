package com.app.springsercurity.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    @Column
    private String email; // id

    @Column
    private String password;

    @Column
    private String name;

    @ElementCollection(fetch = FetchType.EAGER)
    private Set<MemberRole> roleSet;

    public void addMemberRole(MemberRole role){
        roleSet.add(role);
    }

}
