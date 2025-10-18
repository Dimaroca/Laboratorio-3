import java.util.ArrayList;

public class Hospital {
    ArrayList<Doctor> doctor = new ArrayList<>();
    ArrayList<General> general = new ArrayList<>();
    ArrayList<Cirujano> cirujano = new ArrayList<>();
    ArrayList<Radiologo> radiologo = new ArrayList<>();
    ArrayList<Terapeuta> terapeuta = new ArrayList<>();
    ArrayList<Cita> cita = new ArrayList<>();

    //Crea un médico general y lo agrega a las listas correspondientes
    public void crearGeneral(String nombre, String departamento, int año, int salario, String especial, int capacidad, int tarifa) {
        int[] h = new int[8];
        int cont = 16;
        for (int i = 0; i < 8; i++) {
            h[i] = cont;
            cont--;
        }
        General g = new General(nombre, departamento, año, salario, h, especial, capacidad, tarifa);
        Doctor d = new Doctor(nombre, h);
        doctor.add(d);
        general.add(g);
    }

    //Crea un cirujano y lo agrega a las listas correspondientes
    public void crearCirujano(String nombre, String departamento, int año, int salario, String tipo, int hora, int bono) {
        int[] h = new int[8];
        int cont = 16;
        for (int i = 0; i < 8; i++) {
            h[i] = cont;
            cont--;
        }
        Cirujano c = new Cirujano(nombre, departamento, año, salario, h, tipo, hora, bono);
        Doctor d = new Doctor(nombre, h);
        doctor.add(d);
        cirujano.add(c);
    }

    //Crea un radiólogo y lo agrega a las listas correspondientes
    public void crearRadiologo(String nombre, String departamento, int año, int salario, String equipo, int tarifa) {
        int[] h = new int[8];
        int cont = 16;
        for (int i = 0; i < 8; i++) {
            h[i] = cont;
            cont--;
        }
        Radiologo r = new Radiologo(nombre, departamento, año, salario, h, equipo, tarifa);
        Doctor d = new Doctor(nombre, h);
        doctor.add(d);
        radiologo.add(r);
    }

    //Crea un terapeuta y lo agrega a las listas correspondientes
    public void crearTerapeuta(String nombre, String departamento, int año, int salario, String tipo, int duracion) {
        int[] h = new int[8];
        int cont = 16;
        for (int i = 0; i < 8; i++) {
            h[i] = cont;
            cont--;
        }
        Terapeuta t = new Terapeuta(nombre, departamento, año, salario, h, tipo, duracion);
        Doctor d = new Doctor(nombre, h);
        doctor.add(d);
        terapeuta.add(t);
    }

    //Crea una cita médica y la agrega a la lista de citas del hospital
    public void crearCita(String nombre, int m, String fecha, String tipo, String estado) {
        Cita c = new Cita(nombre, doctor.get(m).getNombre(), fecha, tipo, estado);
        cita.add(c);
        int hora = Integer.valueOf(fecha.split(":")[0]);
    }
}
