package com.committee.system.service;

import com.amazonaws.services.s3.AmazonS3;
import com.committee.system.dto.UserDTO;
import com.committee.system.model.Member;
import com.committee.system.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private AwsService awsService;

    @Autowired
    private AmazonS3 s3Client;

    @Autowired
    private UserRepository userRepository;


    @Value("${application.bucket.name}")
    private String bucketName;

    public void registerUser(UserDTO userDTO)
    {
        awsService.uploadFile(userDTO.getFile());

        String attchmentUrl = s3Client.getUrl(bucketName,userDTO.getFile().getOriginalFilename()).toString();
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        Member member = new Member(userDTO.getName(),userDTO.getAddress(),userDTO.getPhoneNumber(),
                passwordEncoder.encode(userDTO.getPassword()),attchmentUrl);

        userRepository.save(member);
    }
}
