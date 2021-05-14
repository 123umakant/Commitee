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
@Table(name = "committee_token_detail")
public class CommitteeTokenDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name = "login_detail")
    private UserLoginDetail loginDetail;
    @Column(name = "token_number")
    private int tokenNumber;
}
