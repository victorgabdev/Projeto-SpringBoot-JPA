package com.projetopessoal.projetoSB.repositories;

import com.projetopessoal.projetoSB.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
