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
public class Calculadora {
    private int operador1;
    private int operador2;
    private Operacion tipoOperacion;
    private int resultado;
    
    public Calculadora() {
    }

    public Calculadora(int operador1, int operador2, Operacion tipoOperacion) {
        this.operador1 = operador1;
        this.operador2 = operador2;
        this.tipoOperacion = tipoOperacion;
    }

    public int getOperador1() {
        return operador1;
    }

    public void setOperador1(int operador1) {
        this.operador1 = operador1;
    }

    public int getOperador2() {
        return operador2;
    }

    public void setOperador2(int operador2) {
        this.operador2 = operador2;
    }

    public Operacion getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(Operacion tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public int getResultado() {
        return resultado;
    }   
}
