/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Miguel Diaz
 */
public class Multiplicacion extends Aritmetica implements Operacion {

    public Multiplicacion(int operador1, int operador2) {
        this.operador1=operador1;
        this.operador2=operador2;
    }
    
    public int multiplicar(){        
        return operador1*operador2;
    }

    @Override
    public int operar() {
        return multiplicar();
    }
    
}
