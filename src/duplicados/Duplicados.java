/*Valentina,Katty y Armando
 * Crear un programa que añada números a una lista hasta que introducimos un
número negativo. A continuación, debe crear una nueva lista igual que la anterior,
pero eliminando los números duplicados. Muestra esta segunda lista para
comprobar que hemos eliminados los duplicados.
 */
package duplicados;

/**
 *
 * @author Personal
 */
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.LinkedHashSet;

public class Duplicados {
    
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new LinkedList<>();//almacena llos números ingresados por el usuario

        System.out.println("Ingrese números (negativo para detener):");
        int num = scanner.nextInt();

        
        while (num >= 0) {//si el numero es positivo o cero se añaden a la lista
            numeros.add(num);
            num = scanner.nextInt();//añade el sigiente numero
        }

        // Utilizamos un Set para eliminar duplicados
        Set<Integer> noDuplicados = new LinkedHashSet<>(numeros);

        // Mostrar la lista original y la lista sin duplicados
        System.out.println("Lista original: " + numeros);
        System.out.println("Lista sin duplicados: " + noDuplicados);
    }
}