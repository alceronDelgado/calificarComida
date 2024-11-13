/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calificarcomida;

/**
 *
 * @author 
 * Objetivo = determinar cuantos estudiantes eligieron la puntuación de
 * la comida del restaurante, si son 15 estudiantes eligieron 13 veces buena
 * entonces debe de mostrar 10 asteriscos
 * si 2 estudiantes eligieron malo entonces debe de agregar 2 asteriscos
 */
public class CalificarComida {

    public static void main(String[] args) {
        // TODO code application logic here
        int n = 10;
        int calificacion [] = new int[n];

        for (int i = 0; i < calificacion.length;i++){
            calificacion[i] += i;
        }

        System.out.println(calificacion[0]);
    }
    
}
