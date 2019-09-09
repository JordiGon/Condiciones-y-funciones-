/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author jordi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        operaciones condicional = new operaciones();
        int op;
        int x=0,y=0,z=0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("     ***MENU PRINCIPAL***");
        System.out.println("Igual.......................1");
        System.out.println("Mayor.......................2");
        System.out.println("Menor.......................3");
        System.out.println("Resta.......................4");
        System.out.println("Multiplicacion..............5");
        System.out.println("Division....................6");
        System.out.println("Raiz cuadrada...............7");
        System.out.println("Ecuacion Cuadratica.........8");
        System.out.println("Maximo numero...............9");
        System.out.println("Operador Y................10");
        System.out.println("Operador O..................11");
        System.out.println("Ingrese su opcion: ");
        op = entrada.nextInt();
        switch (op) {
            case 1:
                System.out.println("Ingrese primer numero: ");
               x=entrada.nextInt();
                System.out.println("Ingrese segundo numero: ");
               y=entrada.nextInt();
                condicional.Igual(x, y);
                break;
            case 2:
                System.out.println("Ingrese primer numero: ");
               x=entrada.nextInt();
                System.out.println("Ingrese segundo numero: ");
               y=entrada.nextInt();
                condicional.Mayor(x, y);
                break;
            case 3:
                System.out.println("Ingrese primer numero: ");
               x=entrada.nextInt();
                System.out.println("Ingrese segundo numero: ");
               y=entrada.nextInt();
                condicional.Menor(x, y);
                break;
            case 4:
                System.out.println("Ingrese primer numero: ");
               x=entrada.nextInt();
                System.out.println("Ingrese segundo numero: ");
               y=entrada.nextInt();
                condicional.Resta(x, y);
                break;
            case 5:
                System.out.println("Ingrese primer numero: ");
               x=entrada.nextInt();
                System.out.println("Ingrese segundo numero: ");
               y=entrada.nextInt();
                condicional.Multiplicacion(x, y);
                break;
            case 6:
                System.out.println("Ingrese primer numero: ");
               x=entrada.nextInt();
                System.out.println("Ingrese segundo numero: ");
               y=entrada.nextInt();
                condicional.Division(x, y);
                break;
            case 7:
                System.out.println("Ingrese numero: ");
               x=entrada.nextInt();
                condicional.Raiz(x);
                break;
            case 8:
                System.out.println("Ingrese primer numero: ");
               x=entrada.nextInt();
                System.out.println("Ingrese segundo numero: ");
               y=entrada.nextInt();
               System.out.println("Ingrese tercer numero: ");
               z=entrada.nextInt();
                condicional.cuadratica(x, y, z);
                break;
            case 9:
                System.out.println("Ingrese primer numero: ");
               x=entrada.nextInt();
                System.out.println("Ingrese segundo numero: ");
               y=entrada.nextInt();
               System.out.println("Ingrese tercer numero: ");
               z=entrada.nextInt();
                condicional.maxima(x, y, z);
                break;
            case 10:
                System.out.println("Ingrese primer numero: ");
               x=entrada.nextInt();
                System.out.println("Ingrese segundo numero: ");
               y=entrada.nextInt();
                condicional.and(x, y);
                break;
            case 11:
                System.out.println("Ingrese primer numero: ");
               x=entrada.nextInt();
                condicional.or(x);
                break;
           default:
               System.out.println("Opcion Incorrecta");
              
                break;

        }

    }
    
    
}
