package com.nguyenduc.service.user;

import com.nguyenduc.model.User;
import com.nguyenduc.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.Optional;

public interface IUserService extends IGeneralService<User>, UserDetailsService {
    Optional<User> findByUsername(String username);
}
