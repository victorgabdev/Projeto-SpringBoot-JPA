# API de E-commerce

---

## Índice

---

- [Sobre](#sobre)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Camada de Domínio](#camada-de-domínio)
- [Como a API Funciona](#como-a-api-funciona)
- [Instância de Domínio](#instância-de-domínio)

## Sobre

---

O objetivo desta API é criar um software que possibilite ao usuário fazer compras em um e-commerce.
Nesse app, um **produto** tem uma **categoria** e o **usuário** pode fazer o **pagamento** através de um **pedido**.
A API foi criada utilizando o padrão de arquitetura de software *MVC*.

## Tecnologias Utilizadas

---

O projeto foi desenvolvido utilizando as seguintes tecnologias:

- [Java 17](https://docs.oracle.com/en/java/javase/17/)
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [H2 database](https://www.h2database.com/html/main.html)
- [MySql](https://dev.mysql.com/doc/)
- [Git e Github](https://git-scm.com/doc)

## Camada de Domínio 

---

![dominioEcommerce](https://github.com/victorgabdev/Projeto-SpringBoot-JPA/assets/75862737/b6b1d3e0-f99e-498e-9a28-61de5101a7ee)

## Como a API Funciona

---

Essa API tem seis entidades na sua camada de domínio, são elas: Categoria (category), Pedido (order), Item Pedido (order_item),
Pagamento (payment), Produto (product) e Usuário (user). É possível fazer um CRUD em todas as entidades.

> CRUD: Create, Read, Update, Delete.

## Instância de Domínio 

---

Exemplo visual de como funciona a API em produção:

![instanciaDominioEcommerce](https://github.com/victorgabdev/Projeto-SpringBoot-JPA/assets/75862737/18bf1f0a-57c0-47e6-88a7-f64a95c53c25)
