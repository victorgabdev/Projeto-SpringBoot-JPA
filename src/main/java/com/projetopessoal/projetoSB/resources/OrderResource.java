package com.projetopessoal.projetoSB.resources;

import com.projetopessoal.projetoSB.entities.Order;
import com.projetopessoal.projetoSB.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    @Autowired
    private OrderService orderService;

    @GetMapping
    public ResponseEntity<List<Order>> findAll() {
        List<Order> Orders = orderService.findAll();
        return ResponseEntity.ok().body(Orders);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Order> findById(@PathVariable Long id) {
        Order Order = orderService.findById(id);
        return ResponseEntity.ok().body(Order);
    }
}
