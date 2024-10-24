/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author utpl
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int var = 25;
        int var2 = 10;
        int var3 = 100;
        int var4 = 10;
        int var5 = 5; 
        int var6 = 2;
        
        boolean res = Math.sqrt(var)*var2 >= var3; //falso
        boolean res1 = var4/var5>=var6; // verdadero 
        
        boolean resultado = res && true || false || res1;
        
        System.out.println(resultado);
        
    }
    
}
