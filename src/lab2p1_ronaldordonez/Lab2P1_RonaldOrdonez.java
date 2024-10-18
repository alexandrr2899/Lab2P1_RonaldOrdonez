/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_ronaldordonez;
import java.util.Scanner;
/**
 *
 * @author alexanderordonez
 */
public class Lab2P1_RonaldOrdonez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);
         int respuesta, num1, num2,multi1,multi2,i,j;
         
         
         do {
         System.out.println(" ");
         System.out.println("Menu de Opciones");
         System.out.println("1. Numeros comunes en multiplicacion");
         System.out.println("2. Juego de suerte");
         System.out.println("3. Llenar el trapecio");
         System.out.println("4. Salida");
         respuesta = sc.nextInt();
         if (respuesta>4){
             System.out.println(" ");
             System.out.println("Ingrese una opcion valida");}
             System.out.println(" ");
             
         if (respuesta==1){
             i=1;
             j=1;
             System.out.println("Numeros comunes en multiplicacion");
             System.out.println(" ");
             System.out.println("Ingrese 2 numeros entre 1-12");
             System.out.println("Numero 1");
             num1=sc.nextInt();
             System.out.println("Numero 2");
             num2=sc.nextInt();
             System.out.println("");
             while(i<=12){
                 multi1=num1*i;
                 while(j<=12){
                     multi2=num2*j;
                     if(multi1==multi2){
                         System.out.println(multi1);}
                     else 
                         System.out.println("___");
                     j++;
                 }
                 i++;
                 j=1;
             }
             
         
         }  
         else if(respuesta==2){
             System.out.println("Juego de Suerte");
             System.out.println(" ");
         
         
         }
         else if (respuesta==3){
             System.out.println("Llenar el trapecio");
             System.out.println(" ");
         
         }
             
         } while(respuesta!=4);
         
        
        
    }
    
}
