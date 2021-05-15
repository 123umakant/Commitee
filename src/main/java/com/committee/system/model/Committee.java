package com.committee.system.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="committee_details")
public class Committee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    private int noOfMembers;
    @NotNull
    private long amount;
    @NotNull
    private Date startDate;
    @NotNull
    int tokenAmount;
    @OneToOne
    private TokenDetails tokenDetails;
    private  int fixedDeduction;
    private int maxAmountBid;
    private String member;
}
