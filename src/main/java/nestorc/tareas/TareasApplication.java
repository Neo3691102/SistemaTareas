package nestorc.tareas;

import javafx.application.Application;
import nestorc.tareas.presentacion.SistemaTareasFx;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TareasApplication {

	public static void main(String[] args) {
//		SpringApplication.run(TareasApplication.class, args);
		Application.launch(SistemaTareasFx.class, args);
	}

}
