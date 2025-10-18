public class General extends Doctor {
    public String especial;
    public int capacidad;
    public int tarifa;

    //Constructor
    public General(String nombre, String departamento, int año, int salario, int[] horario, String especial, int capacidad, int tarifa) {
        super(nombre, horario);
        this.departamento = departamento;
        this.año = año;
        this.salario = salario;
        this.especial = especial;
        this.capacidad = capacidad;
        this.tarifa = tarifa;
    }

    //Retorna la especialización del médico general
    public String getEspecial() {
        return especial;
    }

    //Retorna la capacidad de pacientes diarios del médico general
    public int getCapacidad() {
        return capacidad;
    }

    //Retorna la tarifa de consulta del médico general
    public int getTarifa() {
        return tarifa;
    }

    //Calcula el salario total del médico general
    int calcularSalario(int consulta) {
        return salario + (consulta * tarifa);
    }
}
