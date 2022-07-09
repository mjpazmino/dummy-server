package ec.edu.espe.arquitectura.dummyserver.dummyserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DummyServerApplication {

	public static void main(String[] args) {
		System.err.println("Antes de Init111");
		SpringApplication.run(DummyServerApplication.class, args);
	}

}
