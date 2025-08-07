package org.example.notificationservice.service;

import org.example.notificationservice.dto.NotificationRequest;
import org.example.notificationservice.model.Notification;

/**
 * Created by Ilyas on 07.08.2025
 */
public interface NotificationService {
    Notification create(NotificationRequest  notificationRequest);
}
