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
@Table(name = "committee_admin")
public class CommitteeAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    private String name;
    @Column(name = "token_detail")
    private CommitteeTokenDetail tokenDetail;
    @Column(name = "committee_name")
    private String CommitteeName;
}
