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
public class Seno extends Trigonometrica implements Operacion{
    
    public Seno(int operador1) {
        this.operador1=operador1;
    }
    
    public int operacionSeno(){        
        return (int) Math.sin(operador1);
    }

    @Override
    public int operar() {
        return operacionSeno();
    }
}
