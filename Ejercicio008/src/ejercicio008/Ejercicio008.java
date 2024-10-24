/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio008;

/**
 *
 * @author utpl
 */
public class Ejercicio008 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int var2 = 10;
        int var3 = 9;
        int var4 = 20;
        int var5 = 500; 
        int var6 = 2;
        int var7 = 3;
        int var8 = 200;
        int var9 = 50;
        int var10 = 50;
        int var11 = 50; 
        int var12 = 51;
        
        boolean res1 = var2*var3+var4-var5/var6+Math.pow(var7, 2)>=var8; //falso
        boolean res2 = var9>=var10 - var11+var12; //falso
        
        boolean result = res1 || res2; // falso 
        
        System.out.println(result);
        
    }
    
}
