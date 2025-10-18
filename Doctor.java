public class Doctor {
    protected int id;
    protected String nombre;
    protected String departamento;
    protected int año;
    protected int salario;
    int[] horario = new int[8];

    //Constructor
    public Doctor(String nombre, int[] horario) {
        this.id = id++;
        this.nombre = nombre;
        this.horario = horario;
    }

    //Retorna el ID del doctor
    public int getID() {
        return id;
    }

    //Retorna el nombre del doctor
    public String getNombre() {
        return nombre;
    }

    //Retorna el departamento del doctor
    public String getDepartamento() {
        return departamento;
    }

    //Retorna los años de experiencia del doctor.
    public int getAño() {
        return año;
    }

    //Retorna el salario base del doctor.
    public int getSalario() {
        return salario;
    }

    //Retorna el horario asignado al doctor.
    public int[] getHorario() {
        return horario;
    }

    //Calcula el salario base del doctor (puede ser sobrescrito por las subclases).
    int calcularSalario() {
        return salario;
    }
}
