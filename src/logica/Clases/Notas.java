/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica.Clases;

/**
 *
 * @author ESTUDIANTE
 */
public class Notas {
    private Double[] notas;
    private Double prom = 0.0;
    private int arr;
    private int deb;
    
    public Notas(Double[] notas) {
        this.notas = notas;
    }
    
    public void calcularProm(){
        Double temp = 0.0d;
        for (Double nota : notas) {
            temp += nota;
        }
        prom = temp/notas.length;
    }
    
    public void notaSup(){
        arr =0;
        for (Double nota : notas) {
            if(nota > prom){
                arr++;
            }
        }
    }
    
    public void notaInf(){
        deb =0;
        for (Double nota : notas) {
            if (nota < prom) {
                deb++;
            }
        }
    }

    public Double getProm() {
        return prom;
    }

    public int getArr() {
        return arr;
    }

    public int getDeb() {
        return deb;
    }

    public void setNotas(Double[] notas) {
        this.notas = notas;
    }  
}
