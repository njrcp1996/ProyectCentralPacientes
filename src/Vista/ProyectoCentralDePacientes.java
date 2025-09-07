/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Vista;

import Controller.gestionPacientes;
import Modelo.Paciente;
import java.util.Scanner;

/**
 *
 * @author ncp19
 */
public class ProyectoCentralDePacientes {

    /**
     * @param args the command line arguments
     */
    private static final Scanner sc= new Scanner (System.in);
    private static final gestionPacientes objGestionPac= new gestionPacientes();
    public static void main(String[] args) {
        
        precargarDatosDemo();
        boolean salir= false;
        System.out.println("\n===== Bienvenidos al Programa de Central de pacientes =====");
        while(!salir) {
            System.out.println("Digite de 1 a 4, la opcion que desea realizar: ");
            System.out.println("1. Registrar un paciente");
            System.out.println("2. Eliminar un paciente");
            System.out.println("3. Listar pacientes");
            System.out.println("4. Salir");
            int opcion= leerEntero();
            switch (opcion){
                case 1: registrarPaciente(); break;
                case 2: eliminarPaciente(); break;
                case 3: objGestionPac.mostrarPacientes(); break;
                case 4: System.out.println("Hasta luego!");salir=true; break;  
                default: System.out.println("Opcion invalida");
            }
        }        
    }
    private static int leerEntero() {
        while (true) {
            String line = sc.nextLine();
            try {
                return Integer.parseInt(line.trim()); // line.trim elimina espacios en blanco al inicio y al final 
            } catch (NumberFormatException e) {
                System.out.print("Ingrese un numero valido: ");
            }
        }
    }
    
    private static void registrarPaciente() {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = Integer.parseInt(sc.nextLine());
        System.out.print("Clinica en donde lo atienden: ");
        String clinica = sc.nextLine();
        Paciente p =objGestionPac.agregarPaciente(edad, nombre, clinica);
        System.out.println("Creada: " + p);
    }
    
    private static void eliminarPaciente() {
        System.out.print("Identificador a eliminar del paciente: ");
        int numero = leerEntero();
        boolean ok = objGestionPac.eliminarPaciente(numero);
        System.out.println(ok ? "Eliminado" : "No encontrado"); //expresion ternaria la cual evalua si el numero si existe indica Eliminado sino indica No Encontrado
    }
    
     private static void precargarDatosDemo() {
        objGestionPac.agregarPaciente(28, "Nancy","Sanitas");
        objGestionPac.agregarPaciente(30, "Luis","Colsubsidio");
        objGestionPac.agregarPaciente(19, "Marta","Famisanar");
    }
    
}
