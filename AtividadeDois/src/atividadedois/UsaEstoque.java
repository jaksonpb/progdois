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
public class UsaEstoque {
    public static void main(String[] args) {
        
        Estoque estoque1 = new Estoque("Impressora Jato de Tinta", 13, 6);
        Estoque estoque2 = new Estoque("Monitor LCD 17 Polegadas", 11, 13);
        Estoque estoque3 = new Estoque("Mouse Ótico", 6, 2);
        
        //Letra A
        estoque1.darBaixa(5);
        //Letra B
        estoque2.repor(7);
        //Letra C
        estoque3.darBaixa(4);
        //Letra D
        System.out.println(estoque1.precisaRepor());
        System.out.println(estoque2.precisaRepor());
        System.out.println(estoque3.precisaRepor());
        //Letra E
        System.out.println("Estoque 1: " + estoque1.mostra());
        System.out.println("Estoque 2: " + estoque2.mostra());
        System.out.println("Estoque 3: " + estoque3.mostra());
        
    }
}
