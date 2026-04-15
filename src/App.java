import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        int cantidadEstudiantes = 60000000;
        int cantidadConsultas = 40_000;

        System.out.println("Genrando estudiantes..."); // x: nos pone como su fuera una variable

        List<Estudiante> estudiantes = Generador.generarEstudiantes(cantidadEstudiantes);
        // for (Estudiante est : estudiantes) {
        //     System.out.println(est.nombre);
        // }
        String cedulaBuscada = "1999993";
        for (Estudiante est : estudiantes) {
            if (est.cedula.equals(cedulaBuscada)) {
                System.out.println("EXISTE");
                break; // ayuda a salir del ciclo, cuando ya encuentra
            }
        }
        // int inicio = 0;
        // int fin = estudiantes.size() - 1;

        // while (inicio <= fin){
        //     int medio = (inicio + fin) / 2;
        //     Estudiante actual = estudiantes.get(medio);

        //     int comparacion = actual.cedula.compareTo(cedulaBuscada);

        //     if(comparacion == 0) { // si es igual
        //         System.out.println("EXISTE");
        //         break;
        //     } else if (comparacion < 0) { //si es menor 
        //         inicio = medio + 1;
        //     } else { // si es mayor
        //         fin = medio - 1;
        //     }
        // }
    }
}
