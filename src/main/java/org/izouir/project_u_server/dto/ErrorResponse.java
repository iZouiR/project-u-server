package org.izouir.project_u_server.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@Schema(description = "Ответ c сообщением об ошибке")
public class ErrorResponse {

    @Schema(description = "Код ошибки", example = "403")
    private int statusCode;

    @Schema(description = "Сообщение ошибки", example = "Unsupported Media Type")
    private String message;

    @Schema(description = "Время возникновения ошибки", example = "2021-03-24T16:48:05.591+08:00")
    private Timestamp timestamp;
}
