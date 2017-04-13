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

/**
 * Centraliza el proceso de integración
 * @author Johann
 */
public class Proceso {
    static double d = 0.5;
    static double E = 0.00001;
    
    /**
     * Retorna el valor de x cuya integral es p0 con un dof especifico y un error máximo determinado
     * @param x1 valor inicial de x
     * @param dof grados de libertad
     * @param E Error máximo
     * @param p0 Resultado de la integral
     * @return  El valor de x cuya integral es p0 según los parámetros ingresados
     */
    public static double obtenerX(double x1,int dof, double E, double p0)
    {
        double resultado = obtenerResultado(x1,dof,E);
        boolean esMayor = resultado > p0;
        int i = 0 ;
        while ((Math.abs(resultado - p0) > E)||(i <5)){
            x1 += esMayor ? -d : d;
            resultado = obtenerResultado(x1,dof,E);
            if (esMayor != (resultado>p0)){
                d = d/2.0;
            }
            esMayor = resultado > p0;
            i++;
        }
        return ((double) Math.round(x1*100000) / 100000);
    }
    
    /**
     * Retorna el resultado según el escenario cargado previamente
     * @return Resultado del calculo
     */
    public static double obtenerResultado(double x1,int dof, double E) {
        Integracion integracion1;
        Integracion integracion2;
        int numSeg = 10;
        double resultado1 = 0;
        double resultado2 = 0;
        
        while (((Math.abs(resultado1-resultado2))>E)||(resultado1==0 && resultado2==0)) {
            integracion1= new Integracion(0,x1,numSeg,dof);
            resultado1 = integracion1.darResultado();

            integracion2= new Integracion(0,x1,numSeg*2,dof);
            resultado2 = integracion2.darResultado();
            
            numSeg = numSeg * 2;
        }
        return ((double) Math.round(resultado2*100000) / 100000);
    }
    
    
}
