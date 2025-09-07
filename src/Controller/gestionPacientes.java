/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Modelo.Paciente;
import java.util.LinkedList;

/**
 *
 * @author ncp19
 */
public class gestionPacientes {
    
    private final LinkedList<Paciente> listaPacientes = new LinkedList<>(); // Creacion de lista enlazada simple
     // generadores de id simples
    private int seqPaciente = 1;
    

    public gestionPacientes() {
    }
    
    
    public Paciente agregarPaciente(int edad, String nombre, String nombreClinica){
       Paciente p= new Paciente(seqPaciente++,edad,nombre,nombreClinica);
       listaPacientes.add(p);
       return p;
    }
    
    public Paciente buscarIDPaciente(int id){
        for (Paciente p : listaPacientes) {
           if(buscarPacienteporID(id,p)){
               return p;
           }
        }
        return null;
    }
    
    public boolean eliminarPaciente(int id){
        Paciente pacEliminar= buscarIDPaciente(id);
        if (pacEliminar ==null){
            return false;
        }
        return listaPacientes.remove(pacEliminar);
    }
    
    public void mostrarPacientes() {
    listaPacientes.forEach(System.out::println); // Funcion lambda la cual me muestra cada registro por linea y realiza la visualizacion de mi lista con el metodo toString que esta sobreescrito en Paciente para que se pueda ver la lista de forma correcta
    }
   
    public boolean buscarPacienteporID(int id, Paciente pacienteActual){
        return pacienteActual.getId()==id;
    }
    
}
