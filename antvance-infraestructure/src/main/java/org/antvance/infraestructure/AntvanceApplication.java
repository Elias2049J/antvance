package org.antvance.infraestructure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = "org.antvance.domain.entity")
@ComponentScan(basePackages = {
        "org.antvance.infraestructure",
        "org.antvance.application"
})
public class AntvanceApplication {
    public static void main(String[] args) {
        SpringApplication.run(AntvanceApplication.class, args);
    }
}
