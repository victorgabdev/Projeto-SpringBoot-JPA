package com.projetopessoal.projetoSB.services;

import com.projetopessoal.projetoSB.entities.User;
import com.projetopessoal.projetoSB.repositories.UserRepository;
import com.projetopessoal.projetoSB.services.exceptions.DatabaseException;
import com.projetopessoal.projetoSB.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service  // Registrando a class UserService como um componente do Spring
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.orElseThrow( () -> new ResourceNotFoundException(id) );
        // retorna o usuario (optionalUser.get()) ou retorna o error;
    }

    public User insert(User user) {
        return userRepository.save(user);
    }

    public void delete(Long id) {
        try {
            userRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            // Se tentar excluir um usuario que nao existe
            throw new ResourceNotFoundException(id);
        } catch (DataIntegrityViolationException e) {
            // Se for um usuario que ja existe mas que viola o banco de dados
            throw new DatabaseException(e.getMessage());
        }

    }

    public User update(Long id, User user) {
        try {
            User entity = userRepository.getReferenceById(id);
            updateData(entity, user);
            return userRepository.save(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException(id);
        }

    }

    private void updateData(User entity, User user) {
        entity.setName(user.getName());
        entity.setEmail(user.getEmail());
        entity.setPhone(user.getPhone());
    }
}
