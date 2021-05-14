package com.committee.system.Model;

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
@Table(name = "committee_token_details")
public class TokenDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    private UserLoginDetails loginDetails;
    @NotNull
//    @Column(name = "token number")
    private int token_number;
    @NotNull
//    @Column(name = "token amount")
    private int token_amount;


}
