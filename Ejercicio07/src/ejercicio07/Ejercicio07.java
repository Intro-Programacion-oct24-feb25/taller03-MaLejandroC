/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio07;

/**
 *
 * @author utpl
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int var = 81;
        int var2 = 9;
        int var3 = 3;
        int var4 = 9;
        int var5 = 10; 
        int var6 = 1;
        int var7 = 100;
        int var8 = 25;
        int var9 = 100;
        
        boolean res1 = ((Math.sqrt(var) + var2)/var3 == var4); //falso
        boolean res2 = var5 > var6; // verdadero
        boolean res3 = var7 / var8 >= Math.sqrt(var9); // falso
        
        boolean resultado = res1 || res2 && res3;
        
        System.out.println(resultado);
    }
    
}
