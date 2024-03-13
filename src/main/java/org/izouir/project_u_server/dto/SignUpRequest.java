package org.izouir.project_u_server.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(description = "Запрос на регистрацию")
public class SignUpRequest {

    @Schema(description = "Имя пользователя", example = "iZouiR")
    @Size(min = 5, max = 64, message = "Имя пользователя должно содержать от 5 до 64 символов")
    @NotBlank(message = "Имя пользователя не может быть пустым")
    private String username;

    @Schema(description = "Адрес электронной почты", example = "iZouiR@jotaro.ru")
    @Size(min = 5, max = 256, message = "Адрес электронной почты должен содержать от 5 до 256 символов")
    @NotBlank(message = "Адрес электронной почты не может быть пустым")
    @Email(message = "Email адрес должен быть в формате user@example.com")
    private String email;

    @Schema(description = "Пароль", example = "password_example123")
    @Size(max = 256, message = "Длина пароля должна быть не более 256 символов")
    private String password;
}
