package com.codelab.HiloATMApp.repositories;

import com.codelab.HiloATMApp.model.Hilo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HiloRepo extends JpaRepository<Hilo,Long> {
    Optional<Hilo> findById(Long id);
}
