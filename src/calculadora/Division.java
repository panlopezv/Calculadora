/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Pablo López
 */
public class Division implements Operacion {

    public Division() {
    }

    public int dividir(int operador1, int operador2){
        return operador1/operador2;
    }
    
    @Override
    public int operar(int operador1, int operador2) {
        return dividir(operador1,operador2);
    }
}
