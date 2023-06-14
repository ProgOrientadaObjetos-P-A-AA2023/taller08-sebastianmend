/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author SALA H
 */
public class DocenteNombramiento extends Docente{

    private double valorSueldo;
    private double valorHoraExtra;
    private int numeroHoras;
    private double sueldo;

    public void establecerValorSueldo(double v) {
        valorSueldo = v;
    }

    public void establecerValorHoraExtra(double v) {
        valorHoraExtra = v;
    }

    public void establecerNumeroHoras(int n) {
        numeroHoras = n;
    }

    public void calcularSueldo() {
        sueldo = valorSueldo + (valorHoraExtra * numeroHoras);
    }

    public double obtenerValorSueldo() {
        return valorSueldo;
    }

    public double obtenerValorHoraExtra() {
        return valorHoraExtra;
    }

    public int obtenerNumeroHoras() {
        return numeroHoras;
    }

    public double obtenerSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
        String reporte = String.format("Nombres: %s\nCédula: %s\nValor del "
                + "Sueldo: $%.2f\nValor de las Horas Extra: $%.2f\nNúmero de "
                + "Horas Extra: %d\nSueldo: $%.2f",
                obtenerNombres(),
                obtenerCedula(),
                obtenerValorSueldo(),
                obtenerValorHoraExtra(),
                obtenerNumeroHoras(),
                obtenerSueldo());

        return reporte;
    }

}
