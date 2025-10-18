public class Radiologo extends Doctor {
    public String equipo;
    public int tarifa;

    //Constructor
    public Radiologo(String nombre, String departamento, int año, int salario, int[] horario, String equipo, int tarifa) {
        super(nombre, horario);
        this.departamento = departamento;
        this.año = año;
        this.salario = salario;
        this.equipo = equipo;
        this.tarifa = tarifa;
    }

    // Retorna el equipo médico que el radiólogo puede usar
    public String getEquipo() {
        return equipo;
    }

    // Retorna la tarifa adicional del radiólogo
    public int getTarifa() {
        return tarifa;
    }

    // Calcula el salario total del radiólogo
    @Override
    int calcularSalario() {
        return salario + tarifa;
    }
}
