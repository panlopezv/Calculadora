/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Cristian Flores
 */
public class Coseno extends Trigonometrica implements Operacion{
    
    public Coseno(int operador1) {
        this.operador1=operador1;
    }
    
    public int operacionCoseno(){        
        return (int) Math.cos(operador1);
    }

    @Override
    public int operar() {
        return operacionCoseno();
    }
    
}
