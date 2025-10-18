public class Terapeuta extends Doctor {
    public String tipo;
    public int duracion;

    //Constructor
    public Terapeuta(String nombre, String departamento, int año, int salario, int[] horario, String tipo, int duracion) {
        super(nombre, horario);
        this.departamento = departamento;
        this.año = año;
        this.salario = salario;
        this.tipo = tipo;
        this.duracion = duracion;
    }

    //Retorna el tipo de terapia que realiza el terapeuta
    public String getTipo() {
        return tipo;
    }

    //Retorna la duración promedio de las sesiones de terapia
    public int getDuracion() {
        return duracion;
    }

    //Calcula el salario total del terapeuta
    int calcularSalario(int tarifa) {
        return salario + tarifa * duracion;
    }
}
