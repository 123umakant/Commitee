package com.committee.system.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "committee_member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @NotNull
    private String name;
    @OneToOne
    private TokenDetails tokenDetails;
    @OneToOne
    private UserLoginDetails loginDetails;
    @NotNull
    private String address;
    @NotNull
    private long phoneNumber;

    String attachmentUrl;
}
