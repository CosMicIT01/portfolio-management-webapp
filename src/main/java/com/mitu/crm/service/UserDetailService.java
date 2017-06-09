package com.mitu.crm.service;

import com.mitu.crm.model.User;
import com.mitu.crm.model.entity.UserEntity;
import com.mitu.crm.model.repository.UserDetailRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userDetailService")
public class UserDetailService {

    @Autowired
    UserDetailRepository userDetailRepository;

    private static final Logger logger = LoggerFactory.getLogger(UserDetailService.class);

    public User saveUserDetails(User userDetail) {

        UserEntity userEntity = mapUserToEntity(userDetail);
            userDetailRepository.save(userEntity);
        return userDetail;
    }

    private UserEntity mapUserToEntity(User userDetail) {
        UserEntity entity = new UserEntity();
        entity.setUserName(userDetail.getUsername());
        entity.setPassword(userDetail.getPassword());
        entity.setEmail(userDetail.getEmail());
        entity.setHomeAddress(userDetail.getHomeAddress());
        entity.setPhone(userDetail.getPhone());
        return entity;
    }
}
