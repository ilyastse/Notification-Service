package org.example.notificationservice.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * Created by Ilyas on 07.08.2025
 */
@Data
public class NotificationRequest {

    @NotBlank
    private String message;

    @NotBlank
    private String recipient;

    @NotBlank
    private String type;
}
