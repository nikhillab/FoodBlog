package com.foodzz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.foodzz.entity.UserDescription;
import com.foodzz.entity.Users;

@Repository
public interface UserDescriptionRepo extends JpaRepository<UserDescription, Long> {

	UserDescription findByUser(Users user);
}
