package nestorc.tareas.repositorio;

import nestorc.tareas.modelo.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepositorio  extends JpaRepository<Tarea, Integer> {
}
