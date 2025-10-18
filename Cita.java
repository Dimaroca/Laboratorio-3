public class Cita {
    public int id;
    public String nombre;
    public String medico;
    public String fecha;
    public String tipo;
    public String estado;

    //Constructor
    public Cita(String nombre, String medico, String fecha, String tipo, String estado) {
        this.id = id++;
        this.nombre = nombre;
        this.medico = medico;
        this.fecha = fecha;
        this.tipo = tipo;
        this.estado = estado;
    }

    //Retorna el ID de la cita
    public int getID() {
        return id;
    }

    //Retorna el nombre del paciente
    public String getNombre() {
        return nombre;
    }

    //Retorna el nombre del médico asignado
    public String getMedico() {
        return medico;
    }

    //Retorna la fecha de la cita
    public String getFecha() {
        return fecha;
    }

    //Retorna el tipo de cita
    public String getTipo() {
        return tipo;
    }

    //Retorna el estado actual de la cita
    public String getEstado() {
        return estado;
    }
}
