import java.util.Date;

public class Tarea {
    private String titulo;
    private String descripcion;
    private Date fecha_entrega;
    private Prioridad prioridad;
    private String estado;

    public Tarea(String titulo, String descripcion, Date fecha_entrega, Prioridad prioridad, String estado) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha_entrega = fecha_entrega;
        this.prioridad = prioridad;
        this.estado = estado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return  "titulo: " + titulo + "\n" +
                "Descripcion: " + descripcion + "\n" +
                "Fecha_entrega: " + fecha_entrega +"\n"+
                "Prioridad: " + prioridad.getNombre() +"\n" +
                "Estado: " + estado;
    }
}
