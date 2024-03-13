package org.izouir.project_u_server;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Project U API", version = "1.0"))
public class ProjectUServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProjectUServerApplication.class, args);
    }
}
