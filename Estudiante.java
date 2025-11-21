/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprofesor;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class Estudiante {
    Scanner sc = new Scanner(System.in);
    //Atributos
    private String nombre;
    private String id;
    private double nota;
    private String estado;
    private int asistencias;

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }
    
    //Método para ingresar al estudiante
    public void ingresarEstudiante(){
        System.out.println("Digite el nombre del estudiante: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el ID del estudiante: ");
        id = sc.nextLine();
        System.out.println("Ingrese la nota semestral del estudiante en el semestre anterior: ");
        nota = sc.nextDouble();
        sc.nextLine();
        System.out.println("Ingrese el estado del estudiante (activo/retirado):");
        estado = sc.nextLine();
        System.out.println("ESTUDIANTE REGISTRADO CON EXITO");
    }
    
    //Método para verificar si un estudiante esta apto para la matricula
    public void verificacionMatricula(){
        if(estado.equals("activo") && nota>14){
            estado = "Matriculado para el actual semestre";
        }else{
            estado = "No matriculado para el actual semestre";
        }
    }
    
    //Método para mostrar los datos del estudiante
    public void mostrarEstudiante(){
        System.out.println("Nombre del estudiante: " + nombre);
        System.out.println("Id del estudiante: " + id);
        System.out.println("Nota del promedio semestral: " + nota);
        System.out.println("Estado actual del estudiante: " + estado);
        System.out.println("------------------------------------------------");
    }
}
