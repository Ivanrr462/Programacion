package CrudAlumnos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner sc = new Scanner(System.in);
        Alumno alumno;
        int opcion = -1;

        do {
            System.out.println("1. Añadir alumno");
            System.out.println("2. Listar alumnos");
            System.out.println("3. Editar alumno");
            System.out.println("4. Borrar alumno");
            System.out.println("5. Salir");
            System.out.println();
            System.out.print("Introduce una opción: ");
            while (opcion != 5) {
                try {
                    opcion = sc.nextInt();
                    if (opcion < 1 || opcion > 5) {
                        System.out.println("Error: Debes introducir un número entre 1 y 5");
                    }
                } catch (Exception e) {
                    System.out.println("Error: Debes introducir un número");
                    sc.nextLine();
                }
            }
            System.out.println();
            try {
                switch (opcion) {
                    case 1 -> addAlumno(agenda);
//                    case 2 -> listarAlumnos(agenda);
//                    case 3 -> editAlumno(agenda);
//                    case 4 -> deleteAlumno(agenda);
                }
            } catch (Exception e) {
                System.out.println("Se ga producido un error: " + e.getMessage());
            }

        } while (opcion != 5);
        sc.close();
    }

    private static void listarAlumnos(Agenda agenda) {
        
    }

    private static void addAlumno(Agenda agenda) throws Exception {
        Alumno alumno = new Alumno();
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el DNI: ");
        alumno.setDni(sc.nextLine());
        System.out.print("Introduce el nombre: ");
        alumno.setNombre(sc.nextLine());
        System.out.print("Introduce la edad: ");
        alumno.setEdad(sc.nextInt());
        sc.nextLine();
        System.out.print("Introduce el ciclo: ");
        alumno.setCiclo(sc.nextLine());
        System.out.print("Introduce el curso: ");
        alumno.setCurso(sc.nextLine());
        System.out.print("Introduce la unidad: ");
        alumno.setUnidad(sc.nextLine());

        agenda.añadir(alumno);
        System.out.println();
        System.out.println("Alumno añadido correctamente");
        System.out.println();

        sc.close();
    }
}