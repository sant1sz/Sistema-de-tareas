import java.time.LocalDate;

public class Main {

    public static void main(String[] args){
        Prioridad urgente = new Prioridad("Urgente",4);
        Prioridad alta = new Prioridad ("Alta",3);
        Prioridad media = new Prioridad("Media",2);
        Prioridad baja = new Prioridad("Baja",1);

        SistemaTareas sistema = new SistemaTareas();

        // Crear tareas de prueba
        Tarea t1 = new Tarea("Tarea 1", "Fisica", LocalDate.of(2026, 10, 5), alta, "Pendiente");
        Tarea t2 = new Tarea("Tarea 2", "Calculo", LocalDate.of(2026, 10, 5), urgente, "Pendiente");
        Tarea t3 = new Tarea("Tarea 3", "Inglés", LocalDate.of(2026, 9, 30), baja, "Pendiente");

        // Probar métodos
        sistema.agregar_tarea(t1);
        sistema.agregar_tarea(t2);
        sistema.agregar_tarea(t3);

        System.out.println("\n--- MOSTRAR LISTA ---");
        sistema.mostrar_tareas();

        System.out.println("\n--- BUSCAR TAREA ---");
        sistema.buscar_tarea("Tarea 2");

        System.out.println("\n--- MARCAR COMPLETA ---");
        sistema.marcar_completa("Tarea 2");

        System.out.println("\n--- MOSTRAR LISTA");  //Se muetra la lista nuevamente para verificar que se haya eliminado la tarea que se completó
        sistema.mostrar_tareas();

    }
}
