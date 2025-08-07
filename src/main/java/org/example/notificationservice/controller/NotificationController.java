package org.example.notificationservice.controller;

import jakarta.validation.Valid;
import org.example.notificationservice.dto.NotificationRequest;
import org.example.notificationservice.model.Notification;
import org.example.notificationservice.service.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Ilyas on 07.08.2025
 */
@RestController
@RequestMapping("api/notifications")
@Validated
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public ResponseEntity<Notification> create(@Valid @RequestBody NotificationRequest notificationRequest) {
        Notification saved = notificationService.create(notificationRequest);
        return ResponseEntity.ok().body(saved);
    }
}
