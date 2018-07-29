package pl.metman.apps.sb.metman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@ComponentScan({"pl.metman.apps.sb.metman",
				"pl.metman.modules.authorization.logic"})
public class MetManApp {

	public static void main(String[] args) {
		SpringApplication.run(MetManApp.class, args);
	}
	
}
