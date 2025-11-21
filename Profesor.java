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
public class Profesor {
    //Atributos
    private int id;
    private String nombre;
    private String apellido;
    private String departamento;
    private ArrayList<Materia>
            materias = new ArrayList<>();
    
    Scanner sc = new Scanner(System.in);

    //Getters y Setters
    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    //Método para registrar datos del profesor
    public void registrarProfesor(){
        System.out.println("Ingrese el nombre del profesor: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el apellido del profesor: ");
        apellido = sc.nextLine();
        System.out.println("Ingrese el departamento al que pertenece: ");
        departamento = sc.nextLine();
        System.out.println("PRFESOR REGISTRADO CON EXITO");
    }
    
    //Método para mostrar los datos del profesor
    public void mostrarProfesor(){
        System.out.println("..........INFORMACION DEL PROFESOR..........");
        System.out.println("Nombre del docente: " + nombre);
        System.out.println("Apellido del profesor: " + apellido);
        System.out.println("Departamento: " + departamento);
        
        if(materias!=null){
            System.out.println(".........MATERIAS ASIGNADAS.........");
            for(Materia materia: materias){
                materia.mostrarMateria();
                System.out.println("-------------------------------------");
            }
            }else{
                System.out.println("El profesor no tiene materias registradas.");
                }
        }
    
    //Método para agragar materias a un profesor
    public void agregarMaterias(Materia materia){
        materias.add(materia);
        System.out.println("//Materia asignada con exito//");
    }
}
