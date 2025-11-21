/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoprofesor;
import java.util.Scanner;
/**
 *
 * @author PC
 */
public class ProyectoProfesor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Profesor profesor = null;
        Materia materia = null;
        Estudiante estudiante = null;
        
        boolean continuar = true;
        int opcion=0;
        
        do{
            System.out.println("\n........MENU DE OPCIONES........");
            System.out.println("1. Registrar Profesor");
            System.out.println("2. Registrar Materia");
            System.out.println("3. Asignar Materia a Profesor");
            System.out.println("4. Registrar Estudiante");
            System.out.println("5. Asignar Estudiante a Profesor");
            System.out.println("6. Mostrar Informacion del Profesor");
            System.out.println("7. Salir");
            System.out.print("Digite opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println("");
            switch(opcion){
                case 1:
                    profesor = new Profesor();
                    profesor.registrarProfesor(); break;
                case 2:
                    materia = new Materia();
                    materia.registrarMateria(); break;
                case 3:
                    if(profesor!=null && materia!=null){
                        profesor.agregarMaterias(materia);
                    }else{
                        System.out.println("La materia no se pudo asignar al profesor");
                    }
                    break;
                case 4:
                    if(profesor.getMaterias()!=null){
                        estudiante = new Estudiante();
                        estudiante.ingresarEstudiante();
                        estudiante.verificacionMatricula();
                    }else{
                        System.out.println("El estudiante no se pudo registrar");
                    }break;
                case 5:
                    if(estudiante!= null){
                        materia.agregarEstudiante(estudiante);
                    }else{
                        System.out.println("El estudiante no se pudo asignar");
                    }break;
                case 6:
                    if(profesor!=null && materia!=null){
                        profesor.mostrarProfesor();
                    }else{
                        System.out.println("Ningun profesor registrado.");
                    }
                    break;
                default:
                    continuar = false;break;
            }
        }while(continuar);
    }
}