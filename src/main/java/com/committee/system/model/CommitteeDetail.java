package com.committee.system.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.apachecommons.CommonsLog;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "committee_detail")
public class CommitteeDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;
    @Column(name = "member_count")
    private int membersCount;
    private int amount;
    @Column(name = "start_date")
    private Date startDate;
    @Column(name = "token_detail")
    private CommitteeTokenDetail tokenDetail;
    @Column(name = "fixed_deduction")
    private int fixedDeduction;
    @Column(name = "max_amount_bid")
    private int maxAmountBid;
    @Column(name = "committee_member")
    private CommitteeMember committeeMember;
    @Column(name = "token_amount")
    private int tokenAmount;
}
