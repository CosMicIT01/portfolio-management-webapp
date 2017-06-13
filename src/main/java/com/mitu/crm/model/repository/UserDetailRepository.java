package com.mitu.crm.model.repository;

import com.mitu.crm.model.entity.UserEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


public interface UserDetailRepository  extends CrudRepository<UserEntity, Long> {

    @Query("SELECT u FROM UserEntity u WHERE u.userName = :userName")
    UserEntity getUserByUserName(@Param("userName") String userName);

}
