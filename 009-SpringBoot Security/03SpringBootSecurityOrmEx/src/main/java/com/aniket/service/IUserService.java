package com.aniket.service;

import java.util.Optional;

import com.aniket.entity.User;

public interface IUserService {

	Integer saveUser(User user);
	Optional <User>getOneUser(Integer id );
}
