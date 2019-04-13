/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.util.Scanner;

/**
 *
 * @author David Massana
 */
public class Program {
    
    static Scanner key = new Scanner(System.in);
    static Cine c;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
        do{
            menu();
            opcion = key.nextInt(); key.nextLine();
            switch(opcion){
                case 1:
                    System.out.println("Nombre del cine: ");
                    String name = key.nextLine();
                    c = new Cine(name);
                    break;
                case 2:
                    System.out.println("*** INFORMACION ***");
                    System.out.println("Nombre del cine: " + c.getNameCine());
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("SALIENDO...");
                    break;
                default:
                    System.out.println("\nINGRESE OPCION VALIDA\n");
            }
        }while(opcion != 6);
    }
    
    public static void menu(){
        System.out.println("--------- MENU PRINCIPAL ---------");
        System.out.println("1. CREACION DEL CINE.");
        System.out.println("2. INFORMACION DEL CINE.");
        System.out.println("3. EDITAR INFORMACION DEL CINE.");
        System.out.println("4. AGREGAR FUNCION.");
        System.out.println("5. EDITAR FUNCION.");
        System.out.println("6. SALIR.");
        System.out.println("--------- MENU PRINCIPAL ---------");
        System.out.print("INGRESE OPCION: ");
    }
    
    
}
