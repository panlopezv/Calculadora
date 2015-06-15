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
public class Division extends Aritmetica implements Operacion {

    public Division(int operador1, int operador2) {
        this.operador1=operador1;
        this.operador2=operador2;
    }

    public int dividir(){
        return operador1/operador2;
    }

    @Override
    public int operar() {
        return dividir();
    }
}
