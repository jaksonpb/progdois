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
public class ContaBancaria {
    String nomeTitula;
    Integer numero;
    Integer agencia;
    Double saldo;
    String dataDeAbertura;
    
    void saca(double qtd){
        saldo = saldo - qtd;
    }
    void deposita(double qtd){
        saldo = saldo + qtd;
    }
    void calculaRendimento(){
        saldo = saldo + (saldo * 0.1);
    }
    String recuperaDadosParaImpressao(){
    
        return "";
    }
    
}
