/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import static java.lang.Math.sqrt;
/**
 *
 * @author jordi
 */
public class operaciones {
    Integer x = 0;
    Integer y = 0;
    Integer z = 0;
    double x1 = 0;
    double x2 = 0;
    
    public void Igual(int n1, int n2)
    {
    this.x=n1;
    this.y=n2;
    if(x==y)
    {
        System.out.println("LOS NUMEROS SON IGUALES");    
    }
    else {
        System.out.println("LOS NUMEROS SON DISTINTOS");  
    }
    }
    
    public void Mayor(int n1, int n2){
    this.x = n1;
    this.y = n2;
    if(x<y)
    {
        System.out.println("el segundo numero es mayor");   
    }else {
        System.out.println("el primer numero es mayor");
    }
    }
    
    public void Menor(int n1, int n2){
    this.x=n1;
    this.y=n2;
    if(x<y)
    {
        System.out.println("el primer numero es menor");    
    }else{
        System.out.println("el segundo numero es menor");
    }
    }
    public void Multiplicacion(int n1,int n2){
    this.x=n1;
    this.y=n2;
        System.out.println("Resultado de la multiplicacion: "+(x*y));
    }
     public void Resta(int n1, int n2) {
        this.x = n1;
        this.y = n2;
        System.out.println("La Resta de los 2 numeros es: " + (x - y));
    }

    public void Division(int n1, int n2) {
        this.x = n1;
        this.y = n2;
        System.out.println("La Division de los 2 numeros es: " + (x / y));
    }

    public void Raiz(int n1) {
        this.x = n1;
        System.out.println("La raiz Cuadrada es: " + (sqrt(x)));
    }

    public void cuadratica(int n1, int n2, int n3) {
        this.x = n1;
        this.y = n2;
        this.z = n3;
        x1 = (-y + sqrt(y * y - 4 * x * z) / 2 * x);
        x2 = -y - sqrt(y * y - 4 * x * z) / 2 * x;
        System.out.println("Resultado de la Formula Cuadratica x1 es: " + x1);
        System.out.println("Resultado de la Formula Cuadratica x2 es: " + x2);
    }

    public void maxima(int n1, int n2, int n3) {
        this.x = n1;
        this.y = n2;
        this.z= n3;
        if ((n1 < n2) && (n1 < n3)) {

            System.out.println("El numero mayor es: " + n1);
        } else if ((n2 < n1) && (n2 < n3)) {

            System.out.println("El numero mayor es: " + n2);
        } else if ((n3 < n1) && (n3 < n2)) {

            System.out.println("El numero mayor es: " + n3);
        }
    }
    
    public void and(int n1, int n2) {
        this.x = n1;
        this.y = n2;
        
        if ((x ==10) && (y ==5)) {

            System.out.println("Numeros correctos");
        } 
        else{
            System.out.println("Numeros incorrectos");
        }
    }
    
    public void or(int n1){
    this.x=n1;
    
    if((x==1)||(x==4)){
        System.out.println("Se Ingreso un de los 2 numeros correctos");
    }
    else{
        System.out.println("No Ingreso al Verificador");
    }
    }
}
