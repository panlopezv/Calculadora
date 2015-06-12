/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Diaz
 */
public class Multiplicacion implements Operacion {

    @Override
    public int operar(int operador1, int operador2) {
        return multiplicar(operador1,operador2);
            }
    public int multiplicar(int operador1, int operador2){
        
        return (operador1*operador2);
    }
    
}
