package erick.br;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import erick.br.model.Evento;

@SpringBootApplication
@EnableScheduling
@EnableJpaRepositories
@EnableWebMvc
@ComponentScan(basePackages = {"erick.br.*"})
@EntityScan(basePackages = {"erick.br.model"})
@ConfigurationPropertiesScan(basePackages = {"erick.br.configuration.*"})

public class CriareventosApplication {

	public static void main(String[] args) {
		SpringApplication.run(CriareventosApplication.class, args);
		
		
		
				
	}

}
