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
        int i = 0;
        int estudiantes = 0;
        int n = 10;
        int calificacion [] = new int[n];
        int numeroEstudiantes [] = new int [n];
        int contador = 0;
        int valor = 0;
        int valorExtraido = 0;
        String resultado = " ";  
        String resultadoNumEstudiantes  = " "; 
        //Agregar calificación
        for(int j = 1;j<calificacion.length;j++){
            calificacion[j] = j;
            resultado += "\n"+calificacion[j];
            numeroEstudiantes[j] = 0;
            resultadoNumEstudiantes += "\n"+numeroEstudiantes[j];
        }

        while(estudiantes >= 0){
            System.out.println("Digite entre 1 y 10 siendo siendo 1 horrible y 10 bueno");
            estudiantes = entrada.nextInt();
            
            if(estudiantes  < 0  || estudiantes > 10){
                System.out.println("Rango incorrecto, digite otro valor");
                
            }else{
                for(int k = 1;k<calificacion.length;k++){

                    if(estudiantes == calificacion[k]){
                        System.out.println("El valor es igual"+estudiantes+"calificacion:"+calificacion[k]);
                        //contador = valor++;
                        //System.out.println("Arreglo agregado"+numeroEstudiantes[estudiantes]);
                        if(numeroEstudiantes[estudiantes] >= 0){
                            
                            valorExtraido = numeroEstudiantes[estudiantes];
                            System.out.println("ValorExtraido "+valorExtraido);
                            //System.out.println("Valor Contador anterior "+contador);
                            contador = valorExtraido + 1;
                            //System.out.println("Valor Contador nuevo "+contador);
                            numeroEstudiantes[estudiantes] = contador;
                            
                            if(estudiantes == 10){
                                valorExtraido = numeroEstudiantes[k];
                                //System.out.println("Valor Contador anterior "+contador);
                                contador = valorExtraido + 1;
                                numeroEstudiantes[k] = contador;
                            
                            }

                        }else{
                            System.out.println("Valor de else");
                            numeroEstudiantes[estudiantes] = contador;
                        }

                        
                        

                    }
                    contador = 0; 
                }
            }

            if(estudiantes == 0){
                break;
            }
            i+=1;
        }
        
        for(int m =0;m<numeroEstudiantes.length;m++){
            System.out.println("""
                               Posición #"""+(m)+" "+numeroEstudiantes[m]);
        }
        
    }
    
}