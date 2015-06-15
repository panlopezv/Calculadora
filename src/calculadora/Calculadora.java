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
    private Operacion tipoOperacion;
    private int resultado;
    
    public Calculadora() {
    }

    public Calculadora(Operacion tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
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
    
    public void ejecutarOperacion(){
        resultado = tipoOperacion.operar();
    }
}
