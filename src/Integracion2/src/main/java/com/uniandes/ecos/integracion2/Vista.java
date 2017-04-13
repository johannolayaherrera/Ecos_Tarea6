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

import static spark.Spark.*;

/**
 * Muestra los resultado del calculo
 * @author Johann
 */
public class Vista {
    static Proceso proceso = new Proceso();
    
    /**
     * Método principal que da el arranque al sistema e implementa los métodos para obtener el resultado de cada caso
     * @param args 
     */
    public static void main(String[] args) {

        port(Integer.valueOf(System.getenv("PORT")));
        staticFileLocation("/public");
    
        get("/Escenario_1", (req, res) -> {
        return  "<br>Prueba Assignment Kit for Program 6 <br>" +
                " Prueba 1 "
                + "<br><br><table border = '1'>"
                + "<tr>"
                + "<td>Resultado : " + String.valueOf(Proceso.obtenerX(1, 6, 0.00001, 0.20)) + "</td>"   
                +"</tr>";
        });
        
        get("/Escenario_2", (req, res) -> {
        return  "<br>Prueba Assignment Kit for Program 6 <br>" +
                " Prueba 2 "
                + "<br><br><table border = '1'>"
                + "<tr>"
                + "<td>Resultado : " + String.valueOf(Proceso.obtenerX(1, 15, 0.00001, 0.45)) + "</td>"   
                +"</tr>";
        });
        
        get("/Escenario_3", (req, res) -> {
        return  "<br>Prueba Assignment Kit for Program 6 <br>" +
                " Prueba 3 "
                + "<br><br><table border = '1'>"
                + "<tr>"
                + "<td>Resultado : " + String.valueOf(Proceso.obtenerX(1, 4, 0.00001, 0.495)) + "</td>"   
                +"</tr>";
        });
        
    
    }
}
