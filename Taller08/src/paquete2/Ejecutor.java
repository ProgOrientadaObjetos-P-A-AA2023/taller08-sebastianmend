/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;
import paquete1.*;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        boolean opc = true;

        do {

            System.out.println("---DATOS DEL DOCENTE: ");
            System.out.println("Nombres:");
            String nom = entrada.nextLine();
            System.out.println("Cédula");
            String cedula = entrada.nextLine();

            int opcion;
            System.out.printf("\n%s\n%s\n%s\n%s",
                    "--Menú de Opciones--",
                    "Ingresar un Docente Nombremiento  [1]",
                    "Ingresar un Docente Factura       [2]",
                    "Salir                             [3]");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\nIngrese el valor del sueldo");
                    double sueldo = entrada.nextDouble();
                    System.out.println("Ingrese el valor de las horas extra");
                    double valorHoras = entrada.nextDouble();
                    System.out.println("Ingrese el núemro de horas");
                    int horas = entrada.nextInt();
                    entrada.nextLine();

                    DocenteNombramiento docenteN = new DocenteNombramiento();

                    docenteN.establerNombres(nom);
                    docenteN.establerCedula(cedula);
                    docenteN.establecerValorSueldo(sueldo);
                    docenteN.establecerValorHoraExtra(valorHoras);
                    docenteN.establecerNumeroHoras(horas);
                    docenteN.calcularSueldo();

                    System.out.printf("\n%s\n", docenteN);
                    break;
                case 2:
                    System.out.println("-------FACTURA");
                    System.out.println("\nIngrese el valor:");
                    double factura = entrada.nextDouble();
                    
                    entrada.nextLine();
                    
                    DocenteFactura docenteF = new DocenteFactura();

                    docenteF.establerNombres(nom);
                    docenteF.establerCedula(cedula);
                    docenteF.establecerValorFactura(factura);
                    docenteF.establecerValorIvaDescuento(0.10);
                    docenteF.calcularValorCancelar();

                    System.out.println("-Nota: Se usa el 10% de iva");

                    System.out.printf("\n%s\n", docenteF);
                    break;
                case 3:
                    opc = false;
                    break;
                default:
                    System.out.println("\nError, opción no válida.");
            }
        } while (opc);
    }

}
