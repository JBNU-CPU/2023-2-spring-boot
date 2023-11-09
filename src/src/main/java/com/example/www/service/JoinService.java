package com.example.www.service;

import com.example.www.dto.JoinDTO;
import com.example.www.entity.UserEntity;
import com.example.www.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class JoinService {

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private UserRepository userRepository;


    public void joinProcess(JoinDTO joinDTO) {

        System.out.println(joinDTO.getUsername());

        UserEntity data1 = new UserEntity();

        data1.setUsername(joinDTO.getUsername());
        data1.setPassword(bCryptPasswordEncoder.encode(joinDTO.getPassword()));
        data1.setEmail(joinDTO.getEmail());
        data1.setRole("ROLE_USER");

        userRepository.save(data1);

    }
}
