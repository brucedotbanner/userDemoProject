package com.nectar.userDemo.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nectar.userDemo.beans.UserEntity;
import com.nectar.userDemo.dto.UserDTO;
import com.nectar.userDemo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    private static final List<UserEntity> users = new ArrayList<>();
    private static Long userIdCounter = 1L;

    @Override
    public UserEntity createUser(UserDTO userDTO) {
    	UserEntity user = new UserEntity(userIdCounter++, userDTO.getName(), userDTO.getEmail(),userDTO.getMobile());
        users.add(user);
        return user;
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return users;
    }

    @Override
    public UserEntity updateUser(UserDTO userDTO) {
        Optional<UserEntity> existingUser = users.stream()
                .filter(u -> u.getId().equals(userDTO.getId()))
                .findFirst();
        if (existingUser.isPresent()) {
            existingUser.get().setName(userDTO.getName());
            existingUser.get().setEmail(userDTO.getEmail());
            existingUser.get().setMobile(userDTO.getMobile());
            return existingUser.get();
        }
        
        return null;
    }

    @Override
    public boolean deleteUser(Long id) {
        return users.removeIf(user -> user.getId().equals(id));
    }
}
