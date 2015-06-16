/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author EST1629311
 * @author EST1573011
 * @author EST1522712
 * @author EST1503309
 */
public class Main {

    static int operador1 = 0;
    static int operador2 = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        Operacion operacion;
        Calculadora calculadora;
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("++--**// Calculadora \\\\**--++");
            System.out.println("1. Aritmeticas");
            System.out.println("2. Trigonometricas");
            System.out.println("3. Salir");
            System.out.println("Seleccione una operacion: ");

            opcion = Integer.parseInt(lector.readLine());

            switch (opcion) {

                case 1:

                    try {
                        System.out.println("++--**// Aritmetica \\\\**--++");
                        System.out.println("1. Suma");
                        System.out.println("2. Resta");
                        System.out.println("3. Multiplicacion");
                        System.out.println("4. Division");
                        System.out.println("5. Salir");
                        System.out.println("Seleccione una operacion: ");

                        opcion = Integer.parseInt(lector.readLine());

                        switch (opcion) {
                            case 1:
                                ingresarAritmetica(lector);
                                operacion = new Suma(operador1, operador2);
                                calculadora = new Calculadora(operacion);
                                calculadora.ejecutarOperacion();
                                System.out.println("El resultado de operar " + operador1 + " + " + operador2 + " = " + calculadora.getResultado());
                                break;

                            case 2:
                                ingresarAritmetica(lector);
                                operacion = new Resta(operador1, operador2);
                                calculadora = new Calculadora(operacion);
                                calculadora.ejecutarOperacion();
                                System.out.println("El resultado de operar " + operador1 + " - " + operador2 + " = " + calculadora.getResultado());
                                break;
                            case 3:
                                ingresarAritmetica(lector);
                                operacion = new Multiplicacion(operador1, operador2);
                                calculadora = new Calculadora(operacion);
                                calculadora.ejecutarOperacion();
                                System.out.println("El resultado de operar " + operador1 + " * " + operador2 + " = " + calculadora.getResultado());
                                break;
                            case 4:
                                ingresarAritmetica(lector);
                                operacion = new Division(operador1, operador2);
                                calculadora = new Calculadora(operacion);
                                calculadora.ejecutarOperacion();
                                System.out.println("El resultado de operar " + operador1 + " / " + operador2 + " = " + calculadora.getResultado());
                                break;

                            case 5:
                                System.exit(0);
                                break;
                            default:
                                break;
                        }
                    } catch (IOException ex) {
                        System.err.println(ex.getMessage());
                    }
                    break;

                case 2:
                    try {

                        System.out.println("++--**// Trigonometrica \\\\**--++");
                        System.out.println("1. Coseno");
                        System.out.println("2. Seno");
                        System.out.println("3. Tangente");
                        System.out.println("4. Salir");
                        System.out.println("Seleccione una operacion: ");

                        opcion = Integer.parseInt(lector.readLine());

                        switch (opcion) {

                            case 1:
                                ingresarTrigonometrica(lector);
                                operacion = new Coseno(operador1);
                                calculadora = new Calculadora(operacion);
                                calculadora.ejecutarOperacion();
                                System.out.println("El resultado de operar cos(" + operador1 + ") = " + calculadora.getResultado());
                                break;
                            case 2:
                                ingresarTrigonometrica(lector);
                                operacion = new Seno(operador1);
                                calculadora = new Calculadora(operacion);
                                calculadora.ejecutarOperacion();
                                System.out.println("El resultado de operar sin(" + operador1 + ") = " + calculadora.getResultado());
                                break;
                            case 3:
                                ingresarTrigonometrica(lector);
                                operacion = new Tangente(operador1);
                                calculadora = new Calculadora(operacion);
                                calculadora.ejecutarOperacion();
                                System.out.println("El resultado de operar tan(" + operador1 + ") = " + calculadora.getResultado());
                                break;

                            case 4:
                                System.exit(0);
                                break;

                        }
                    } catch (IOException ex) {
                        System.err.println(ex.getMessage());
                    }
                    break;

                case 3:
                    break; //Salir del menu principal
            }

        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void ingresarAritmetica(BufferedReader lector) {
        try {
            System.out.println("Ingrese el primer Numero: ");
            operador1 = Integer.parseInt(lector.readLine());
            System.out.println("Ingrese el Segundo Numero: ");
            operador2 = Integer.parseInt(lector.readLine());;
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

    public static void ingresarTrigonometrica(BufferedReader lector) {
        try {
            System.out.println("Ingrese el Numero: ");
            operador1 = Integer.parseInt(lector.readLine());
        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
    }

}
