package com.projetopessoal.projetoSB.repositories;

import com.projetopessoal.projetoSB.entities.OrderItem;
import com.projetopessoal.projetoSB.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
