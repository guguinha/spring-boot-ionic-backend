package com.augusto.cursomc.repositories;

 import org.springframework.data.jpa.repository.JpaRepository;
 import org.springframework.stereotype.Repository;

 import com.augusto.cursomc.domain.Pedido;

 @Repository
 public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

 }