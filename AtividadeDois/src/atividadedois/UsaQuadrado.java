/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadedois;

/**
 *
 * @author Rai Sousa
 */
public class UsaQuadrado {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(2);
        Quadrado q2 = new Quadrado(4);
        Quadrado q3 = new Quadrado(5);
        
        System.out.println("a areá e: "+ q1.area()+" e o perimetro é: "+ q1.perimetro());
        System.out.println("a areá e: "+ q2.area()+" e o perimetro é: "+ q2.perimetro());
        System.out.println("a areá e: "+ q3.area()+" e o perimetro é: "+ q3.perimetro());
    }
}
