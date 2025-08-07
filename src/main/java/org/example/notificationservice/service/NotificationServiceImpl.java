package org.example.notificationservice.service;

import org.example.notificationservice.dto.NotificationRequest;
import org.example.notificationservice.model.Notification;
import org.example.notificationservice.repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * Created by Ilyas on 07.08.2025
 */
@Service
public class NotificationServiceImpl implements NotificationService {
    private final NotificationRepository notificationRepository;

    public NotificationServiceImpl(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @Override
    public Notification create(NotificationRequest request) {
        Notification notification = new Notification();
        notification.setType(request.getType());
        notification.setRecipient(request.getRecipient());
        notification.setMessage(request.getMessage());
        notification.setCreatedAt(LocalDateTime.now());

        return notificationRepository.save(notification);
    }
}
