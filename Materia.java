/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoprofesor;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author PC
 */
public class Materia {
    //Atributos
    private String NRC;
    private String nombre;
    private int horas;
    private String carrera;
    private ArrayList<Estudiante>
            estudiantes = new ArrayList();
    
    Scanner sc = new Scanner(System.in);

    //Getters y Setters
    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    public String getNRC() {
        return NRC;
    }

    public void setNRC(String NRC) {
        this.NRC = NRC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    //Método para registrar los datos de una materia
    public void registrarMateria(){
        System.out.print("Ingrese el NRC: ");
        NRC = sc.nextLine();
        System.out.print("Ingrese el nombre de la materia: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese su numero de horas semanales: ");
        horas = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese la carrera al que pertenece: ");
        carrera = sc.nextLine();
        
        System.out.println("MATERIA REGISTRADA CON EXITO");
    }
    
    //Método para mostrar los datos de una materia
    public void mostrarMateria(){
        System.out.println("NRC: " + NRC);
        System.out.println("Nombre de la materia: " + nombre);
        System.out.println("Numero de horas semanales: " + horas);
        System.out.println("Carrera: " + carrera);
        
        if(!estudiantes.isEmpty()){
            System.out.println(".........ESTUDIANTES ASIGNADOS.........");
            for(Estudiante estudiante: estudiantes){
                estudiante.mostrarEstudiante();
            }
        }else{
            System.out.println("La materia no tiene estudiantes registrados!");
        }
    }
    
    //Método para agregar estudiantes a una materia
    public void agregarEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
        System.out.println("//Estudiante asignado con exito//");
    }
}
