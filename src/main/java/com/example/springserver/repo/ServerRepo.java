package com.example.springserver.repo;

import com.example.springserver.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepo extends JpaRepository<Server, Long> {
    // Select a server by its ip address
    Server findByIpAddress(String ipAddress);
}
