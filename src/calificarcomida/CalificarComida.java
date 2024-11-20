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
import java.util.Scanner;
import javax.swing.*;
public class CalificarComida {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int estudiantes = 0;
        int i = 0;
        int n = 11;
        int calificacion [] = new int[n];
        int numeroEstudiantes [] = new int [n];
        int contador = 0;
        int valorExtraido = 0;
        String resultado = " ";
        String caracteres = "";
        String caracter [] = new String[n];
        String valorExtraidoEstrella = "";
        
        
        //Agregar calificación
        for(int j = 0;j<calificacion.length;j++){
            calificacion[j] = j;
            numeroEstudiantes[j] = 0;
            caracter[j] = "";
        }
        
        while(estudiantes >= 0){
            System.out.println("Digite entre 1 y 10 siendo siendo 1 horrible y 10 bueno");
            estudiantes = entrada.nextInt();
            
            if(estudiantes  < 0  || estudiantes > 10){
                System.out.println("Rango incorrecto, digite otro valor");
                
            }else{
                for(int k = 0;k<calificacion.length;k++){

                    if(estudiantes == calificacion[k]){
                        if(numeroEstudiantes[estudiantes] >= 0){
                            
                            valorExtraido = numeroEstudiantes[estudiantes];
                            contador = valorExtraido + 1;
                            numeroEstudiantes[estudiantes] = contador;

                            //Valor extraido caracteres
                            valorExtraidoEstrella = caracter[estudiantes];
                            caracteres+=valorExtraidoEstrella+"*";
                            caracter[estudiantes] = caracteres;
                        }else{
                            numeroEstudiantes[estudiantes] = contador;
                        }
                    }
                    contador = 0; 
                }
                caracteres = "";
            }

            if(estudiantes == 0){
                break;
            }
        i+=1;
        }
        
        resultado += "Cantidad de estudiantes: "+i+"\n";
        for(int m =1;m<numeroEstudiantes.length;m++){
           
            resultado +="""
                        CALIFICACION #"""+": "+calificacion[m]+""+
                        """
                         NUMERO ESTUDIANTE: """+numeroEstudiantes[m]+" "+
                        """
                         ARBOL: """+caracter[m]+"\n";

        }
        System.out.println(resultado);
        
    }
    
}