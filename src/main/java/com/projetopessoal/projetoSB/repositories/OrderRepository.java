package com.projetopessoal.projetoSB.repositories;

import com.projetopessoal.projetoSB.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
