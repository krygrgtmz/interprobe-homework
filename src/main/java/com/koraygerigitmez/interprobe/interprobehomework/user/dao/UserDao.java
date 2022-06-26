package com.koraygerigitmez.interprobe.interprobehomework.user.dao;

import com.koraygerigitmez.interprobe.interprobehomework.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {


}
