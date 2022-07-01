package com.mycompany.miprimerprogramag10;

import clases.*;

import javax.swing.JOptionPane;

/**
 *
 * @author David Pérez arias
 */
public class MiPrimerProgramaG10 {

    public static void main(String[] args) {

        /*
        ClsBodega bodega = new ClsBodega();

        ClsBodega bodega2 = new ClsBodega("BOD01", "Barranquilla");
        
        ClsBodega bodega3 = new ClsBodega("BOD02", "Medellín", "Bodega la 51", 23.45);

        System.out.println("La capacidad de la bodega 1 es: " + bodega.capacidad);

        System.out.println("La capacidad de la bodega 2 es: " + bodega2.capacidad);
        
        System.out.println("La capacidad de la bodega 3 es: " + bodega3.capacidad);
        
        
        ClsTapaBoca tapaboca = new ClsTapaBoca("TAPA01", "rojo", 5000);
        
        System.out.println("El precio del tapabocas es:" + tapaboca.precio);
        
        
        ClsResponsable responsable = new ClsResponsable();
        responsable.nombre = "Julio";
        responsable.telefono = "5774883";

         */
        
        ClsResponsable responsable = new ClsResponsable("30000", "David",
                "Operario", "320", "davidmintic@");

        ClsBodega bodega = new ClsBodega("BOD01", "Manizales", "La 51", 1000, responsable);
        
        
        ClsTesorero tesorero = new ClsTesorero("xxx");
        tesorero.obtenerValorCuenta();
        
        /*
        ClsTapaBoca tapaboca = new ClsTapaBoca("T1", "Rojo", 5000);

        bodega.registrarEntrada(tapaboca);

        ClsTapaBoca tapaboca2 = new ClsTapaBoca("T2", "verde", 3000);

        bodega.registrarEntrada(tapaboca2);

        ClsTapaBoca tapaboca3 = new ClsTapaBoca("T3", "Azul", 7000);

        bodega.registrarEntrada(tapaboca3);

        System.out.println(bodega.mostrarInventario());

        */

    }
}
