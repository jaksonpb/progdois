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
public class Lampada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada();
        
        lampada1.liga();
        lampada2.desliga();
        System.out.println(lampada1.observa() + "<- lampada 1 " + " e lampada 2 -> " + lampada2.observa());
    }
    Boolean ligada;
    
    void liga(){
        ligada = true;
    }
    
    void desliga(){
        ligada = false;
    }
    
    String observa(){
        if(ligada == true){
            return "Ligada!";
        }else{
            return "Desligada!";
        }
    }
}

