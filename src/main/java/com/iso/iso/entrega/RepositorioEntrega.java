package com.iso.iso.entrega;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioEntrega extends JpaRepository<Entrega, Long> {}