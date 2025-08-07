package org.example.notificationservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created by Ilyas on 07.08.2025
 */
@Entity
@Data
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String message;
    private String type;
    private String recipient;

    private LocalDateTime createdAt =  LocalDateTime.now();
}
