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
public class Estoque {
    
    String nome;
    Integer qtdAtual;
    Integer qtdMinima;
    
    Estoque(){}
    
    Estoque(String nomeTemp, int qtdAtualTemp, int qtdMinimaTemp){
    nome = nomeTemp;
    qtdAtual = qtdAtualTemp;
    qtdMinima = qtdMinimaTemp;
    }
    
    void mudarNome(String nome){}
    
    void mudarQtdMinima(int qtdMinima){}
    
    void repor(int qtd){
        qtdAtual = qtdAtual + qtd;
    }
    
    void darBaixa(int qtd){
        qtdAtual = qtdAtual - qtd;
    }
    
    String mostra(){
    return "Nome: " + nome + " - Quantidade Atual: " + qtdAtual + " - Quantidade Mínima: " + qtdMinima;
    }
    
    Boolean precisaRepor(){
        if(qtdAtual<qtdMinima){
            return true;
        }else{
            return false;
        }
    }
    
}
