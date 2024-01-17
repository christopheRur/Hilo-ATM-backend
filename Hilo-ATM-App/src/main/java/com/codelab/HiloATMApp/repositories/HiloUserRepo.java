package com.codelab.HiloATMApp.repositories;

import com.codelab.HiloATMApp.model.HiloUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HiloUserRepo extends JpaRepository<HiloUser,Long> {
    Optional<HiloUser> findHiloUserByEmail(String email);
}
