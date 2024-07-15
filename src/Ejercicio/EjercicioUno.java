package Ejercicio;

import java.util.ArrayList;
import java.util.List;

/*
 * Implementa un método para devolver todos los subconjuntos de un arreglo de enteros
 * 
 * Se puede sin recursividad
 * Ejemplo:
 *  Input: [1,2,3]
 *
 *  Output:
 *    [
 *      [1,2,3],
 *      [1,2],
 *      [1,3],
 *      [2,3],
 *      [1],
 *      [2],
 *      [3],
 *      []
 *    ]
 * 
 * El  metodo me debe devolver una lista de listas de enteros. 
 * Se puede usar varios metodos 
 * 
 * Ecoja la mejor estructura de datos para que sea mas eficiente
 */
public class EjercicioUno {

    public List<List<Integer>> subsets(List<Integer> set) {

        //lista para los subconjuntos
        List<List<Integer>> resultado = new ArrayList<>();
        
        //el resultado vacio
        resultado.add(new ArrayList<>());
        
        //Interaccion sobre todo numero de entrada
        for(Integer num : set){


            //Crear una lista para cada nuevo subconjunto q se genera
            List<List<Integer>> subconjunto1 = new ArrayList<>();

            //Interactuar sobre cada subconjunto que se tiene
            for(List<Integer> subset : resultado){


                //Se crea un nuevo subconjunto agregando el numero actual al subconjunto q ya existia   
                List<Integer> subconjunto2 = new ArrayList<>(subset);
                
                subconjunto2.add(num);

                //Agregamos el subconjunto a la lista nueva
                subconjunto1.add(subconjunto2);
            }

            // se agrega todos los subconjunto a la lista de resultado
            resultado.addAll(subconjunto1);
        }
        return resultado;
        

     }
}
