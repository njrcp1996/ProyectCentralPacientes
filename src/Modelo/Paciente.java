/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
/**
 *
 * @author ncp19
 */
public class Paciente {
    private int id;
    private int edad;
    private String nombre;
    private String nombreClinica;

    public Paciente(int id,int edad, String nombre, String nombreClinica) {
        this.id=id;
        this.edad = edad;
        this.nombre = nombre;
        this.nombreClinica = nombreClinica;
    }

    public int getId() {
        return id;
    }

   
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreClinica() {
        return nombreClinica;
    }

    public void setNombreClinica(String nombreClinica) {
        this.nombreClinica = nombreClinica;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
	return "Paciente{" +
	        "id=" + id +
                ", edad=" + edad +
	        ", nombre='" + nombre + "'" +
	        ", Clinica='" + nombreClinica + "'"+       
	        '}';
    }
    
    
    
}
