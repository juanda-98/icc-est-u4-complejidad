import java.util.ArrayList;
import java.util.List;

public class Generador {
    public static List<Estudiante> generarEstudiantes(int cantidadEstudiante) {
        List<Estudiante> estudiantes = new ArrayList <>();
        for (int i=0; i<cantidadEstudiante; i++) {
            String cedula = i+""; //casteo
            String nombre = "Estudiante "+i; //concatenacion
            Estudiante estudiante = new Estudiante(nombre, cedula);
            estudiantes.add(estudiante); 
        }
        return estudiantes;
    }
    
}
