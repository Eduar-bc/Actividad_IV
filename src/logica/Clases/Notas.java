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

    // Arreglo de notas de tipo Double para gardar la lista de notas
    private Double[] notas;

    // Variable para almacenar el promedio calculado
    private Double prom = 0.0;

    // Variables para contar cuántas notas están por encima o por debajo del promedio
    private int arr;  // 'arr' cuenta las notas mayores que el promedio
    private int deb;  // 'deb' cuenta las notas menores que el promedio

    // Constructor que inicializa la clase con el arreglo de notas proporcionado.
    public Notas(Double[] notas) {
        this.notas = notas;
    }

    /**
     * Método que calcula el promedio de las notas. Recorre el arreglo sumando
     * todas las notas y luego divide la suma por la cantidad de notas.
     */
    public void calcularProm() {
        Double temp = 0.0d;  // Variable temporal para sumar las notas
        for (Double nota : notas) {
            temp += nota;  // Acumula la suma de todas las notas
        }
        prom = temp / notas.length;  // Calcula el promedio dividiendo por la cantidad de notas
    }

    /**
     * Método que cuenta cuántas notas están por encima del promedio. Recorre el
     * arreglo de notas y, si una nota es mayor que el promedio, incrementa el
     * contador 'arr'.
     */
    public void notaSup() {
        arr = 0;  // Inicializa el contador en 0
        for (Double nota : notas) {
            if (nota > prom) {  // Verifica si la nota es mayor que el promedio
                arr++;  // Incrementa el contador si la nota es superior
            }
        }
    }

    /**
     * Método que cuenta cuántas notas están por debajo del promedio. Recorre el
     * arreglo de notas y, si una nota es menor que el promedio, incrementa el
     * contador 'deb'.
     */
    public void notaInf() {
        deb = 0;  // Inicializa el contador en 0
        for (Double nota : notas) {
            if (nota < prom) {  // Verifica si la nota es menor que el promedio
                deb++;  // Incrementa el contador si la nota es inferior
            }
        }
    }

    //Metodos Getter y Setter de los atributos
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
