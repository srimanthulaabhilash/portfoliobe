package com.abhiportfolio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abhiportfolio.entity.UserInfo;

@Repository
public interface UserInfoRepo extends JpaRepository<UserInfo, Long> {

}