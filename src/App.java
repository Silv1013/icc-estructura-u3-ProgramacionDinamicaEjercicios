import java.util.ArrayList;
import java.util.List;

import Ejercicio.EjercicioDos;
import Ejercicio.EjercicioUno;

public class App {
    public static void main(String[] args) throws Exception {

         EjercicioUno ejerUno = new EjercicioUno();
         List<Integer> set = new ArrayList<>();
         set.add(1);
         set.add(2);
         set.add(3);
         List<List<Integer>> resultado = ejerUno.subsets(set);
         System.out.println("Resolución del Ejercicio Uno:");
         System.out.println(resultado);

         EjercicioDos ejerDos = new EjercicioDos();
         int n = 1;
         List<String> result = ejerDos.generateParenthesis(n);
         System.out.println("Resolución del Ejercicio Dos con 1 de entrada:");
         System.out.println(result);
         
         n= 3;
         result = ejerDos.generateParenthesis(n);
         System.out.println("Resolución del Ejercicio Dos con 3 de entrada:");
         System.out.println(result);

    }
}
