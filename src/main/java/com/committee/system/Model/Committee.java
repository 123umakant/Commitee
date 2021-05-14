package com.committee.system.Model;

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
    private int no_of_members;
    @NotNull
    private long amount;
    @NotNull
    private Date start_date;
    @NotNull
    int token_amount;
    @OneToOne
    private TokenDetails tokenDetails;
    private  int fixed_deduction;
    private int max_amount_bid;
    private String member;
}
