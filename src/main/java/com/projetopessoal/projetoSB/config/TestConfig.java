package com.projetopessoal.projetoSB.config;

import com.projetopessoal.projetoSB.entities.Category;
import com.projetopessoal.projetoSB.entities.Order;
import com.projetopessoal.projetoSB.entities.User;
import com.projetopessoal.projetoSB.entities.enums.OrderStatus;
import com.projetopessoal.projetoSB.repositories.CategoryRepository;
import com.projetopessoal.projetoSB.repositories.OrderRepository;
import com.projetopessoal.projetoSB.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration  // Explica para o spring que essa é uma class especifica de configuracao
@Profile("test") // Pra falar que essa class vai ser uma configuracao especifica para o perfil de tests
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;  // Injecao de dependencia

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    // Executar a class quando o app iniciar (CommandLineRunner)
    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT,  u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
    }
}
