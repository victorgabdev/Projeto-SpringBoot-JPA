package com.projetopessoal.projetoSB.config;

import com.projetopessoal.projetoSB.entities.User;
import com.projetopessoal.projetoSB.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration  // Explica para o spring que essa é uma class especifica de configuracao
@Profile("test") // Pra falar que essa class vai ser uma configuracao especifica para o perfil de tests
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;  // Injecao de dependencia

    // Executar a class quando o app iniciar (CommandLineRunner)
    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
