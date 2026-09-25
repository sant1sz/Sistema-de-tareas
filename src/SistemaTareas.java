public class SistemaTareas {

    private ListaSimple<Tarea> tareas;

    public SistemaTareas(){
        this.tareas = new ListaSimple<>();

    }

    public void agregar_tarea(Tarea nuevaTarea) {

        if (this.tareas.isEmpty()) {
            this.tareas.addFirst(nuevaTarea);
            return;
        }

        Nodo<Tarea> temp = this.tareas.First();
        Nodo<Tarea> anterior = null;


        while (temp != null) {
            boolean fechaAnterior = temp.getData().getFecha_entrega().isBefore(nuevaTarea.getFecha_entrega());
            boolean mismaFecha = temp.getData().getFecha_entrega().isEqual(nuevaTarea.getFecha_entrega());
            boolean mayorOIgualPrioridad = temp.getData().getPrioridad().getValor() >= nuevaTarea.getPrioridad().getValor();


            if (fechaAnterior || (mismaFecha && mayorOIgualPrioridad)) {
                anterior = temp;
                temp = temp.getNext();
            } else {

                break;
            }
        }


        if (anterior == null) {

            this.tareas.addFirst(nuevaTarea);
        } else if (temp == null) {

            this.tareas.addLast(nuevaTarea);
        } else {

            Nodo<Tarea> nuevoNodo = new Nodo<>(nuevaTarea);
            anterior.setNext(nuevoNodo);
            nuevoNodo.setNext(temp);


            this.tareas.setSize(this.tareas.getSize() + 1);
        }
    }

    public Tarea buscar_tarea(String titulo){
        Nodo<Tarea> actual = this.tareas.First();
        while (actual != null){
            if(actual.getData().getTitulo().equalsIgnoreCase(titulo)){
                Tarea t =actual.getData();
                System.out.println("Titulo: "+ t.getTitulo());
                System.out.println("Descripcion: "+t.getDescripcion());
                System.out.println("Fecha de entrega: "+t.getFecha_entrega());
                System.out.println("Prioridad: "+t.getPrioridad().getNombre());
                return t;
            }
            actual = actual.getNext();

        }
        System.out.println("La tarea no fue encontrada.");
        return null;
    }
    public Tarea eliminar_tarea(String titulo){
        Nodo<Tarea> actual = this.tareas.First();
        Nodo<Tarea> anterior =null;

        while (actual != null){
            if(actual.getData().getTitulo().equalsIgnoreCase(titulo)){
                Tarea eliminada =actual.getData();

                if(anterior== null){
                    tareas.removeFirst();
                }else if(actual.getNext()==null){
                    tareas.removeLast();
                }else{
                    anterior.setNext(actual.getNext());
                    tareas.setSize(tareas.getSize()-1);
                }
                System.out.println("La tarea "+titulo+ " ha sido eliminado correctamente");
                return eliminada;
            }
            anterior=actual;
            actual=actual.getNext();
        }
        System.out.println("No se encontro la tarea");
        return null;
    }

    public void mostrar_tareas(){
        Nodo<Tarea> actual = this.tareas.First();
        while (actual !=null){
            Tarea t = actual.getData();
            System.out.println("------------------------------------");
            System.out.println("Título: " + t.getTitulo());
            System.out.println("Descripción: " + t.getDescripcion());
            System.out.println("Fecha de entrega: " + t.getFecha_entrega());
            System.out.println("Prioridad: " + t.getPrioridad().getNombre());
            actual = actual.getNext();
        }
    }

    public Tarea marcar_completa(String titulo){
        Tarea tarea= buscar_tarea(titulo);
        if(tarea != null){
            tarea.setEstado("Completa");
            eliminar_tarea(titulo);
            return tarea;
        }
        return null;
    }
}
