package org.example.notificationservice.repository;

import org.example.notificationservice.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ilyas on 07.08.2025
 */
public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
