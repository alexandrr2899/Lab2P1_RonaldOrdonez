/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_ronaldordonez;
import java.util.Scanner;
import java.util.Random;
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
         Random random = new Random();
         int respuesta, num1, num2,multi1,multi2,i,j,porcenTrape,jugador1, jugador2,respuesta2, ronda;
         boolean band=false;
         
         
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
         
         //Numeros comunes en multiplicacion
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
                 band=false;
                 multi1=num1*i;
                 while(j<=12){
                     multi2=num2*j;
                     if(multi1==multi2){
                         System.out.print(multi1+" ");
                        band=true;    
                         
                     }
                     
                     j++;
                 }
                 
                 if (band==false){
                     System.out.print(" ___ ");
                 }
                 i++;
                 j=1;
             }
             
         
         }  
         // Juego de Suerte
         else if(respuesta==2){
             jugador1=0;
             jugador2=0;
             ronda=1;
                     
             System.out.println("Juego de Suerte");
             System.out.println(" ");
                jugador1=random.nextInt(10)+1+jugador1;
                jugador2=random.nextInt(10)+1+jugador2;
             do {
                 System.out.println("Ronda "+ronda);
                System.out.println("Puntos jugador 1 "+jugador1);
                System.out.println("Puntos jugador 2 "+jugador2);
                System.out.println(" ");
                System.out.println("- - - - - - - - - - - - - - -");
                System.out.println("Que desea hacer?");
                System.out.println("1. Agregar 1");
                System.out.println("2. Agregar 2");
                System.out.println("3. Seguir");
                System.out.println("4. Terminar");
                respuesta2= sc.nextInt();
                if (respuesta2==1){
                    jugador1=1+jugador1;
                    System.out.println(jugador1);
                }
                else if (respuesta2==2){
                    jugador1=2+jugador1;
                    System.out.println(jugador1);
                }
                else if (respuesta2==3){
                    System.out.println("Siguiente ronda");
                    jugador1=random.nextInt(10)+1+jugador1;
                    jugador2=random.nextInt(10)+1+jugador2;
                    
                    
                    ronda++;
                }
                if (ronda==4){
                    System.out.println("El puntaje del jugador 1 fue: "+jugador1);
                    System.out.println("El puntaje del jugador 2 fue: "+jugador2);
                    if (jugador1>jugador2 && jugador1<=20){
                        System.out.println("El ganador fue Jugador 1");
                    }
                    else if ((jugador1>20 && jugador2>20) || (jugador1==jugador2)){
                        System.out.println("Fue Empate");
                    }
                    else if (jugador2>jugador1 && jugador2<=20){
                        System.out.println("El ganador fue Jugador 2");
                    }
                    else if (jugador1>20){
                        System.out.println("Gano el jugador 2");
                    }
                    else if (jugador2>20){
                        System.out.println("Ganor el jugador 1");
                    }                                
                    break;
                }
                if (jugador1>20 && jugador2>20){
                    System.out.println("Fue empate");
                    break;
                
                }
                else if (jugador1>20){
                    System.out.println(" ");                    
                    System.out.println("El puntaje del jugador 1 fue: "+jugador1);
                    System.out.println("El puntaje del jugador 2 fue: "+jugador2);
                    System.out.println(" ");
                    System.out.println("Gano el jugador 2");
                    break;
                }
                else if (jugador2>20){
                    System.out.println(" ");                   
                    System.out.println("El puntaje del jugador 1 fue: "+jugador1);
                    System.out.println("El puntaje del jugador 2 fue: "+jugador2);
                    System.out.println("Gano el jugador 1");
                    System.out.println(" ");
                    break;
                }                
                
             } while(respuesta2!=4);
                     
         
         
         }
         // llenar el trapecio
         else if (respuesta==3){
             System.out.println("Llenar el trapecio");
             System.out.println(" ");
             System.out.println("Ingrese el porcentaje");
             System.out.println("1. 25%");
             System.out.println("2. 50%");
             System.out.println("3. 75%");
             System.out.println("4. 100%");
             porcenTrape = sc.nextInt();
             System.out.println(" ");
             
             //25%
             if (porcenTrape==1){
                 i=1;
                 while(i<=4){
                     j=1;
                     while(j<=12){
                        if (i==1){
                            i++;
                            continue;
                         }
                        else if (i==2){
                            if (j>=3 && j<4){
                               System.out.print("*");
                            }
                            else {
                                System.out.print(" ");
                            }
                         }
                        else if (i==3){
                            if (j>=2 && j<4){
                               System.out.print("*");
                            }
                            else {
                                System.out.print(" ");
                            }
                            
                         }
                        else if (i==4){
                            if (j>=1 && j<4){
                                System.out.print("*");
                            }
                            else {
                                System.out.print(" ");}
                        }
                         
                         j++;
                         
                     }
                     System.out.println("  ");       
                 i++;
                 }                 
                 
             }
             //50%
             else if (porcenTrape==2){
             i=1;
                 while(i<=4){
                     j=1;
                     while(j<=12){
                        if (i==1){
                            if (j>=4 && j<7){
                               System.out.print("*");
                            }
                            else {
                                System.out.print(" ");
                            }
                         }
                        else if (i==2){
                            if (j>=3 && j<7){
                               System.out.print("*");
                            }
                            else {
                                System.out.print(" ");
                            }
                         }
                        else if (i==3){
                            if (j>=2 && j<7){
                               System.out.print("*");
                            }
                            else {
                                System.out.print(" ");
                            }
                            
                         }
                        else if (i==4){
                            if (j>=1 && j<7){
                                System.out.print("*");
                            }
                            else {
                                System.out.print(" ");}
                        }
                         
                         j++;
                         
                     }
                     System.out.println("  ");       
                 i++;
                 }                 
                     
             }
             //75%
             else if (porcenTrape==3){
                i=1;
                 while(i<=4){
                     j=1;
                     while(j<=12){
                        if (i==1){
                            if (j>=4 && j<10){
                               System.out.print("*");
                            }
                            else {
                                System.out.print(" ");
                            }
                         }
                        else if (i==2){
                            if (j>=3 && j<10){
                               System.out.print("*");
                            }
                            else {
                                System.out.print(" ");
                            }
                         }
                        else if (i==3){
                            if (j>=2 && j<10){
                               System.out.print("*");
                            }
                            else {
                                System.out.print(" ");
                            }
                            
                         }
                        else if (i==4){
                            if (j>=1 && j<10){
                                System.out.print("*");
                            }
                            else {
                                System.out.print(" ");}
                        }
                         
                         j++;
                         
                     }
                     System.out.println("  ");       
                 i++;
                 }                 
                     
             }
             //100%
             else if (porcenTrape==4){
                 i=1;
                 while(i<=4){
                     j=1;
                     while(j<=12){
                        if (i==1){
                            if (j>=4&&j<=9){
                               System.out.print("*");
                            }
                            else {
                                System.out.print(" ");
                            }
                         }
                        else if (i==2){
                            if (j>=3 && j<=10){
                               System.out.print("*");
                            }
                            else {
                                System.out.print(" ");
                            }
                         }
                        else if (i==3){
                            if (j>=2 && j<=11){
                               System.out.print("*");
                            }
                            else {
                                System.out.print(" ");
                            }
                            
                         }
                        else {
                            System.out.print("*");
                        }
                         
                         j++;
                         
                     }
                     System.out.println("  ");       
                 i++;
                 }
             }
         
         }
             
         } while(respuesta!=4);
         
        
        
    }
    
}
