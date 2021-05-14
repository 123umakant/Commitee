package com.committee.system.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "committee_member")
public class CommitteeMember {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name = "token_detail")
    private CommitteeTokenDetail tokenDetail;
    @Column(name = "login_detail")
    private UserLoginDetail loginDetail;
    @Column(name = "mobile_number")
    private int mobileNumber;
    private String attachment;
}
