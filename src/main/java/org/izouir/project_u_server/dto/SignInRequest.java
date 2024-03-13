package org.izouir.project_u_server.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(description = "Запрос на аутентификацию")
public class SignInRequest {

    @Schema(description = "Имя пользователя", example = "iZouiR")
    @Size(min = 5, max = 64, message = "Имя пользователя должно содержать от 5 до 64 символов")
    @NotBlank(message = "Имя пользователя не может быть пустым")
    private String username;

    @Schema(description = "Пароль", example = "password_example123")
    @Size(min = 8, max = 256, message = "Длина пароля должна быть от 8 до 256 символов")
    @NotBlank(message = "Пароль не может быть пустым")
    private String password;
}
