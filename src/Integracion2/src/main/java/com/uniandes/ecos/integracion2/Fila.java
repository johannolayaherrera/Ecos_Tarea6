/** ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación
 * Conceptos Avanzados de Ingeniería de Software
 *
 * Proyecto Integracion 2
 * Tarea 6
 * Autor: Johann De Jesus Olaya Herrera
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */
package com.uniandes.ecos.integracion2;

import java.util.ArrayList;

/**
 * Clase que modelo una fila de la tabla de calculos
 * @author Johann
 */
public class Fila {
    private double xi;
    private int multiplicador;
    private double calculo1;
    private double calculoFuncion;
    private double calculo3;
    
    /**
     * Guarda el valor de xi que corresponde a el valor acumulado por cada segmento hasta el valor final de x.
     * @param nuevoXi valor de xi
     */
    public void setXi(double nuevoXi) {
        xi=nuevoXi;
    }
    /**
     * Guarda el multiplicador de la regla Simpson
     * @param nuevoMultiplicador valor del multiplicador
     */
    public void setMultiplicador(int nuevoMultiplicador) {
        multiplicador = nuevoMultiplicador;
    }
    /**
     *  Guarda el resultado del primer proceso de integración con la regla Simpson
     * el cual corresponde a (1 + xi^2/dof)^ -((dof +1)/2)
     * @param nuevoCalculo1 resultado del primer proceso
     */
    public void setCalculo1(double nuevoCalculo1) {
        calculo1 = nuevoCalculo1;
    }
    /**
     * Guarda el valor de la funcion para ese registro
     * el cual corresponde a el resultado del calculo1 multiplicado por
     *( función gamma * ((dof+1)/2))/((dof*pi)^(1/2)* función gamma*(dof/2)))
     * @param nuevoCalculoFuncion resultado de la función F(Xi)
     */
    public void setCalculoFuncion(double nuevoCalculoFuncion) {
        calculoFuncion = nuevoCalculoFuncion;
    }
    /**
     * Guarda el resultado del resultado de la regla de Simpson
     * el cual corresponde a (w/3)* Multiplicador * CalculoFuncion
     * @param nuevoCalculo3 
     */
    public void setCalculo3(double nuevoCalculo3) {
        calculo3 = nuevoCalculo3;
    }
    /**
     * Obtiene el valor de xi
     * @return xi
     */
    public double getXi() {
        return xi;
    }
    /**
     * Obtiene el valor del multiplicador
     * @return multiplicador
     */
    public int getMultiplicador() {
        return multiplicador;
    }
    /**
     * Obtiene el valor del calculo 1
     * @return Primero calculo de la regla de Simpson
     */
    public double getCalculo1() {
        return calculo1;
    }
    /**
     * Obtiene el valor de la función
     * @return valor del resultado de la función
     */
    public double getCalculoFuncion() {
        return calculoFuncion;
    }
    /**
     * Obtiene el valor total de la regla de Simpson
     * @return 
     */
    public double getCalculo3() {
        return calculo3;
    }
}
