package com.committee.system.dto;

import com.committee.system.model.TokenDetails;
import com.committee.system.model.UserLoginDetails;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.OneToOne;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDTO {

    private String name;
    private String address;
    private long phoneNumber;
    private MultipartFile file;

}
