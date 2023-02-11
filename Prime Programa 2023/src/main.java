
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author umg
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        int a;
        int b;
        int opc;
        Scanner tecla = new Scanner(System.in);

        //Ingreso del primer número
        System.out.println("Ingresar primer numero: ");
        a = tecla.nextInt();
        tecla.nextLine();

        //Ingreo del segundo número
        System.out.println("Ingresar segundo numero: ");
        b = tecla.nextInt();
        tecla.nextLine();

        //Opciones para el usuario
        System.out.println("Seleccione una opción");

        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        opc = tecla.nextInt();
        tecla.nextLine();

        /*
       //Ver que opción eligio el usuario
        {
            
        if(opc==1)
        {
            System.out.println("La suma es: "+(a+b));
        }     
       
        if(opc==2)
        {
            System.out.println("La resta es:"+(a-b));
        }
        
        if(opc==3)
        {
            System.out.println("La multiplicación es:"+(a*b));
        }
        
        if(opc==4)
        {
            System.out.println("La división es:"+(a/b));
        }
        else
        System.out.println("Debe ingresar entre (1) y (4) ");
        
        } 
         */
        {
            switch (opc) {
                case 1: {
                    System.out.println("La Suma es: " + (a + b));
                }
                break;

                case 2: {
                    System.out.println("La Resta es: " + (a - b));
                }
                break;

                case 3: {
                    System.out.println("La Suma es: " + (a * b));
                }
                break;

                case 4: {
                    if (a == 0) {
                        System.out.println("No se puede dividir 0 ");
                    } else {
                        if (b == 0) {
                            System.out.println("No se puede dividir 0 ");
                        } else {
                            System.out.println("La Resta es: " + (a / b));
                        }
                    }
                    break;
                }
                
            default: {
                    System.out.println("Deben elegir el entre (1) y (4) ");
                }break;
            }
        }  

        } //Main

    }//Clase Principal
