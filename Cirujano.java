public class Cirujano extends Doctor {
    public String tipo;
    public int hora;
    public int bono;

    //Constructor
    public Cirujano(String nombre, String departamento, int año, int salario, int[] horario, String tipo, int hora, int bono) {
        super(nombre, horario);
        this.departamento = departamento;
        this.año = año;
        this.salario = salario;
        this.tipo = tipo;
        this.hora = hora;
        this.bono = bono;
    }

    //Retorna el tipo de cirugía que realiza el cirujano
    public String getTipo() {
        return tipo;
    }

    //Retorna la cantidad de horas de cirugía del cirujano
    public int getHora() {
        return hora;
    }

    //Retorna el bono adicional del cirujano
    public int getBono() {
        return bono;
    }

    //Calcula el salario total del cirujano
    int calcularSalario(int hora, int tarifa) {
        return salario + (hora * tarifa) + bono;
    }
}
