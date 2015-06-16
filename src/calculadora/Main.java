/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author est1629311
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        int operador1 = 0;
        int operador2 = 0;
        Operacion operacion;
        Calculadora calculadora;
        BufferedReader lector=new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("++--**// Calculadora \\\\**--++");
            System.out.println("Ingrese el primer Numero: ");
            operador1 = Integer.parseInt(lector.readLine());
            System.out.println("Ingrese el Segundo Numero: ");
            operador2 = Integer.parseInt(lector.readLine());;
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("Seleccione una operacion: ");

            opcion = Integer.parseInt(lector.readLine());
            
            switch (opcion) {
                
                case 1:
                    operacion = new Suma(operador1,operador2);
                    calculadora= new Calculadora(operacion);
                    calculadora.ejecutarOperacion();
                    System.out.println("El resultado de operar "+operador1+" + "+operador2+" = "+ calculadora.getResultado());
                    break;
                
                case 2:
                    operacion = new Resta(operador1,operador2);
                    calculadora= new Calculadora(operacion);
                    calculadora.ejecutarOperacion();
                    System.out.println("El resultado de operar "+operador1+" - "+operador2+" = "+ calculadora.getResultado());
                    break;
                    
                
                    
                    
                    
                case 3:
                    operacion = new Multiplicacion(operador1,operador2);
                    calculadora= new Calculadora(operacion);
                    calculadora.ejecutarOperacion();
                    System.out.println("El resultado de operar "+operador1+" * "+operador2+" = "+ calculadora.getResultado());
                    break;
                case 4:
                    operacion = new Division(operador1,operador2);
                    calculadora= new Calculadora(operacion);
                    calculadora.ejecutarOperacion();
                    System.out.println("El resultado de operar "+operador1+" / "+operador2+" = "+ calculadora.getResultado());
                    break;
            }
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
