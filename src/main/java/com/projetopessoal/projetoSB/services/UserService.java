package com.projetopessoal.projetoSB.services;

import com.projetopessoal.projetoSB.entities.User;
import com.projetopessoal.projetoSB.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
}
