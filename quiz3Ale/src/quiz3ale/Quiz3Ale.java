/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz3ale;
import java.util.Scanner;
/**
 *
 * @author Aulas Heredia
 */
public class Quiz3Ale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    // ingresar el numero de los prodcutos y sus nombres 
        System.out.print("numero del productos ");
    int N = scanner.nextInt();
    String[] productos = new String[N];
    double[][] ventas =new double[4][N];
    
        System.out.println("Ingrese el nombre del producto");
        for(int i=0;i<N;i++){
          System.out.print("Producto"+(i+1)+":");
          productos[i]=scanner.next();
          
        }
         //ingresar las ventas diaria de la tienda 
         System.out.println("Ingrese las ventas diarias");
         for (int dia=0;dia <4; dia++){
             System.out.println("dia"+(dia+1)+":");
             for(int i = 0; i < N; i++){
                 System.out.print(productos[i]+":");
                 ventas[dia][i]=scanner.nextDouble();
               
                
                
                 
             }
         }
    
            
    
        
        
        
    }
    
}
