package com.joaocarlos.mudi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joaocarlos.mudi.model.Pedido;

@Repository
public interface PedidoRepository  extends JpaRepository<Pedido, Long> {

}
