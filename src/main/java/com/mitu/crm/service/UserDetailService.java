package com.mitu.crm.service;

import com.mitu.crm.model.User;
import com.mitu.crm.model.entity.UserEntity;
import com.mitu.crm.model.repository.UserDetailRepository;
import com.mitu.crm.util.PasswordUtil;
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
        String passwordhash = "";
        try {
            passwordhash = PasswordUtil.createHash(userDetail.getPassword());
        } catch (PasswordUtil.CannotPerformOperationException e) {
            e.printStackTrace();
        }
        entity.setPassword(passwordhash);
        entity.setEmail(userDetail.getEmail());
        entity.setHomeAddress(userDetail.getHomeAddress());
        entity.setPhone(userDetail.getPhone());
        return entity;
    }

    public User authenticateUser(User userDetail) {

        UserEntity userEntity = userDetailRepository.getUserByUserName(userDetail.getUsername());
        boolean isValid = false;
        if (userEntity != null) {
            String passwordHash = userEntity.getPassword();
            try {
                isValid = PasswordUtil.verifyPassword(userDetail.getPassword(), passwordHash);
            } catch (PasswordUtil.CannotPerformOperationException e) {
                e.printStackTrace();
            } catch (PasswordUtil.InvalidHashException e) {
                e.printStackTrace();
            }
        }
        if (isValid){
            System.out.println("valid user");
        }else{
            System.out.println("invalid user");
            return null;
        }
        return userDetail;
    }
}
