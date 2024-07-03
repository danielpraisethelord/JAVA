package modelmapper;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
/**
 * DemoApplication es la clase principal de la aplicación Spring Boot.
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    /**
     * Crear una instancia de ModelMapper como un bean de Spring.
     */
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
