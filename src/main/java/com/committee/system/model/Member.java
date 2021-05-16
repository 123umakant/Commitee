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
    private int tokenNumber;
    @OneToOne
    private UserLoginDetails loginDetails;
    @NotNull
    private String address;
    @NotNull
    private long phoneNumber;
    @NotNull
    private String password;

    String attachmentUrl;

    public Member(String name, String address, long phoneNumber, String password, String attachmentUrl)
    {
        this.name = name;
        this.address = address;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.attachmentUrl = attachmentUrl;
    }
}
