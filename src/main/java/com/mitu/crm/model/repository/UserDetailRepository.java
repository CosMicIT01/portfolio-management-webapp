package com.mitu.crm.model.repository;

import com.mitu.crm.model.entity.UserEntity;
import org.springframework.data.repository.CrudRepository;


public interface UserDetailRepository  extends CrudRepository<UserEntity, Long> {
}
