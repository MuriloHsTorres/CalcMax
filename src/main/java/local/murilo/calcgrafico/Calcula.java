/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.murilo.calcgrafico;

import static local.murilo.calcgrafico.TipoOperador.MULTIPLICACAO;



/**
 *
 * @author sesidevb
 */
public class Calcula {
    double total;
    
    TipoOperador ultimaOperacao;
    
    public Calcula() {
        reset();
    }
    
    public void reset() {
        this.total = 0;
        this.ultimaOperacao = null;
    }
    
   public double calcular(double n, TipoOperador operacao) {
        if (ultimaOperacao == null || ultimaOperacao == TipoOperador.IGUAL) {
            this.total = n;
            this.ultimaOperacao = operacao;
        } else {
            
            switch(ultimaOperacao) {
                case SOMA:  
                    this.total += n;
                    this.ultimaOperacao = operacao;
                    break;
                            
                case SUBTRACAO: 
                    this.total -= n;
                    this.ultimaOperacao = operacao;
                    break;                 
                    
                case MULTIPLICACAO:
                    this.total *= n;
                    this.ultimaOperacao = operacao;
                    break;
                    
                case DIVISAO:
                    this.total /= n;
                    this.ultimaOperacao = operacao;
                    break;
                    
                case POTENCIA:
                    
                    double pot = Math.pow(total, n);
                    this.total = pot;
                    this.ultimaOperacao = operacao;
                    break;
                    
                default:
                    System.out.println("Não Implementado!");
                    
            }
            
        }
        
        
        return this.total;
    }
        

}
