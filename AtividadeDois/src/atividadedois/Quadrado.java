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
public class Quadrado {
   
    
    Quadrado(double lado_par){
        lado = lado_par;
    }
    
    Double lado;
    Double area;
    Double perimetro;
    Double area(){
        area = lado * lado;
        return area;
    }
    
    Double perimetro (){
        perimetro = 4 * lado;
        return perimetro;
    }
    
    
    
}
