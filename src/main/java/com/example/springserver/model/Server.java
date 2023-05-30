package com.example.springserver.model;

import static jakarta.persistence.GenerationType.AUTO;

import com.example.springserver.enums.Status;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "server")
@NoArgsConstructor
@AllArgsConstructor
public class Server {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;

    @Column(unique = true)
    @NotEmpty(message = "IP address cannot be empty or null.")
    private String ipAddress;
    private String name;
    private String memory;
    private String type;
    private Status status;
}
