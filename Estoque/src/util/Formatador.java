/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author Administrator
 */
public class Formatador {
    
    public double converterVirgulaParaPonto(String pValor){
        String retorno = "";
        
        for (int i = 0; i < pValor.length(); i++) {
            if (pValor.charAt(i) ==',') {
                retorno += '.';
        }else{
                retorno += pValor.charAt(i);
            }
        }
            return Double.parseDouble(retorno);
        }
        
    }
