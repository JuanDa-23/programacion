import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Condicional10 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe un número: ");
        double n1 = scanner.nextDouble();
        System.out.println("Escribe otro número: ");
        double n2 = scanner.nextDouble();
        System.out.println("Escribe un último número: ");
        double n3 = scanner.nextDouble();

        if (n1<n2 && n1<n3){
            System.out.println("Estos números están ordenados de menor a mayor");
        }else{
            System.out.println("Estos números no están ordenados de menor a mayor");
        }


    }
}
