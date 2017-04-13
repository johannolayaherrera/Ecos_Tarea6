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

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 *
 * @author Johann
 */
public class ProcesoTest {
    double x1 = 1;
    int dof;
    double E = 0.00001;
    double p0;
    Proceso proceso ;

    @Before
    public void setUp() {
        p0 = 0.20;
        dof = 6;
    }

    /**
     * Prueba del proceso que obtiene el resultado de la integral
     */
    @Test
    public void testObtenerResultado() {
        System.out.println("obtenerResultado");
        double expResult = 0.32;
        double result = proceso.obtenerResultado(x1,dof,E);
        assertTrue((result + 0.0001 > expResult) && (result + 0.0001 > expResult));
    }

    /**
     * Prueba del resultado del x cuya integral corresponde a p0 a partir de una tolerancia de error
     */
    @Test
    public void testObtenerX() {
        System.out.println("obtenerX");
        double expResult = 0.55338;
        double result = Proceso.obtenerX(x1, dof, E, p0);
        assertTrue((result + 0.0001 > expResult) && (result + 0.0001 > expResult));
    }
    
}
