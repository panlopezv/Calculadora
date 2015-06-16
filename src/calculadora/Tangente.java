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
public class Tangente extends Trigonometrica implements Operacion{
    
    public Tangente(int operador1) {
        this.operador1=operador1;
    }
    
    public int operacionTangente(){        
        return (int) Math.tan(operador1);
    }

    @Override
    public int operar() {
        return operacionTangente();
    }
    
}
