import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital();
        int salir = 0;

        //Menú principal del hospital
        while (salir!=10) {
            System.out.println("\n--- MENÚ HOSPITAL ---");
            System.out.println("1. Crear Doctor General");
            System.out.println("2. Crear Cirujano");
            System.out.println("3. Crear Radiólogo");
            System.out.println("4. Crear Terapeuta");
            System.out.println("5. Crear Cita");
            System.out.println("6. Calcular Salario de un Doctor");
            System.out.println("7. Reagendar Cita");
            System.out.println("8. Eliminar Cita");
            System.out.println("9. Listar Citas");
            System.out.println("10. Salir");
            System.out.print("Seleccione opción: ");
            int opcion = sc.nextInt();
            sc.nextLine(); 

            switch(opcion) {
                case 1: //Crear Doctor General
                    System.out.print("Nombre: ");
                    String nomG = sc.nextLine();
                    System.out.print("Departamento: ");
                    String depG = sc.nextLine();
                    System.out.print("Año de experiencia: ");
                    int añoG = sc.nextInt();
                    System.out.print("Salario base: ");
                    int salG = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Especialización: ");
                    String esp = sc.nextLine();
                    System.out.print("Capacidad pacientes: ");
                    int cap = sc.nextInt();
                    System.out.print("Tarifa consulta: ");
                    int tarifa = sc.nextInt();
                    hospital.crearGeneral(nomG, depG, añoG, salG, esp, cap, tarifa);
                    System.out.println("Doctor General creado.");
                    break;

                case 2: //Crear Cirujano
                    System.out.print("Nombre: ");
                    String nomC = sc.nextLine();
                    System.out.print("Departamento: ");
                    String depC = sc.nextLine();
                    System.out.print("Año de experiencia: ");
                    int añoC = sc.nextInt();
                    System.out.print("Salario base: ");
                    int salC = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Tipo cirugía: ");
                    String tipoC = sc.nextLine();
                    System.out.print("Horas cirugía: ");
                    int hora = sc.nextInt();
                    System.out.print("Bono: ");
                    int bono = sc.nextInt();
                    hospital.crearCirujano(nomC, depC, añoC, salC, tipoC, hora, bono);
                    System.out.println("Cirujano creado.");
                    break;

                case 3: //Crear Radiólogo
                    System.out.print("Nombre: ");
                    String nomR = sc.nextLine();
                    System.out.print("Departamento: ");
                    String depR = sc.nextLine();
                    System.out.print("Año de experiencia: ");
                    int añoR = sc.nextInt();
                    System.out.print("Salario base: ");
                    int salR = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Equipo: ");
                    String eq = sc.nextLine();
                    System.out.print("Tarifa estudio: ");
                    int tarifaR = sc.nextInt();
                    hospital.crearRadiologo(nomR, depR, añoR, salR, eq, tarifaR);
                    System.out.println("Radiólogo creado.");
                    break;

                case 4: //Crear Terapeuta
                    System.out.print("Nombre: ");
                    String nomT = sc.nextLine();
                    System.out.print("Departamento: ");
                    String depT = sc.nextLine();
                    System.out.print("Año de experiencia: ");
                    int añoT = sc.nextInt();
                    System.out.print("Salario base: ");
                    int salT = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Tipo terapia: ");
                    String tipoT = sc.nextLine();
                    System.out.print("Duración sesiones: ");
                    int dur = sc.nextInt();
                    hospital.crearTerapeuta(nomT, depT, añoT, salT, tipoT, dur);
                    System.out.println("Terapeuta creado.");
                    break;

                case 5: //Crear Cita
                    if (hospital.doctor.isEmpty()) {
                        System.out.println("No hay doctores disponibles.");
                        break;
                    }
                    System.out.print("Nombre paciente: ");
                    String pac = sc.nextLine();
                    System.out.println("Seleccione doctor por índice:");
                    for (int i = 0; i < hospital.doctor.size(); i++) {
                        System.out.println(i+1 + ". " + hospital.doctor.get(i).getNombre());
                    }
                    int doc = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Fecha (hh:mm): ");
                    String fecha = sc.nextLine();
                    System.out.print("Tipo cita: ");
                    String tipo = sc.nextLine();
                    System.out.print("Estado: ");
                    String estado = sc.nextLine();
                    hospital.crearCita(pac, doc, fecha, tipo, estado);
                    System.out.println("Cita creada.");
                    break;

                case 6: //Calcular salario de un doctor
                    if (hospital.doctor.isEmpty()) {
                        System.out.println("No hay doctores.");
                        break;
                    }
                    System.out.println("Seleccione doctor por índice:");
                    for (int i = 0; i < hospital.doctor.size(); i++) {
                        System.out.println(i + ". " + hospital.doctor.get(i).getNombre());
                    }
                    int idx = sc.nextInt();
                    Doctor d = hospital.doctor.get(idx);
                    System.out.println("Salario base de " + d.getNombre() + ": " + d.calcularSalario());
                    break;

                case 7: //Reagendar cita
                    if (hospital.cita.isEmpty()) {
                        System.out.println("No hay citas para reagendar.");
                        break;
                    }
                    System.out.println("Seleccione cita por índice:");
                    for (int i = 0; i < hospital.cita.size(); i++) {
                        System.out.println(i+1 + ". " + hospital.cita.get(i).getNombre() + " - " + hospital.cita.get(i).getFecha());
                    }
                    int cx = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nueva fecha (hh:mm): ");
                    String nuevaFecha = sc.nextLine();
                    hospital.cita.get(cx).fecha = nuevaFecha;
                    System.out.println("Cita reagendada.");
                    break;

                case 8: //Eliminar cita
                    if (hospital.cita.isEmpty()) {
                        System.out.println("No hay citas para eliminar.");
                        break;
                    }
                    System.out.println("Seleccione cita por índice:");
                    for (int i = 0; i < hospital.cita.size(); i++) {
                        System.out.println(i + ". " + hospital.cita.get(i).getNombre() + " - " + hospital.cita.get(i).getFecha());
                    }
                    int del = sc.nextInt();
                    hospital.cita.remove(del);
                    System.out.println("Cita eliminada.");
                    break;

                case 9: //Listar todas las citas
                    if (hospital.cita.isEmpty()) {
                        System.out.println("No hay citas registradas.");
                    } else {
                        System.out.println("--- Listado de Citas ---");
                        for (Cita c : hospital.cita) {
                            System.out.println(c.getID() + ". Paciente: " + c.getNombre() + ", Doctor: " + c.getMedico() + ", Fecha: " + c.getFecha() + ", Estado: " + c.getEstado());
                        }
                    }
                    break;

                case 10: //Salir del programa
                    salir = 10;
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        }

        sc.close();
    }
}
