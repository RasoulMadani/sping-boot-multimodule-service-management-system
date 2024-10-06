package ir.maktabsharif.achareh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.bank.maktabsharif"})
public class AcharehApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcharehApplication.class, args);
	}

}
