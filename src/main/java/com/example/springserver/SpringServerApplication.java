package com.example.springserver;

import com.example.springserver.enums.Status;
import com.example.springserver.model.Server;
import com.example.springserver.repo.ServerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringServerApplication.class, args);
    }

    @Bean
    CommandLineRunner run(ServerRepo serverRepo) {
        return args -> {
            serverRepo.save(new Server(null, "192.168.1.160", "Ubuntu Linux", "16GB", "Personal PC", Status.SERVER_UP ));
            serverRepo.save(new Server(null, "193.168.1.160", "Fedora Linux", "16GB", "Personal PC", Status.SERVER_UP ));
        };
    }
}
