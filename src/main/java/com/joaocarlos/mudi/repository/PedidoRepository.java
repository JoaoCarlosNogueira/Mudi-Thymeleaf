package com.joaocarlos.mudi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joaocarlos.mudi.model.Pedido;

@Repository
public interface PedidoRepository  extends JpaRepository<Pedido, Long> {

}
