package tema3;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class repaso {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
       showMenu();
        int money = in.nextInt();
        char option = in.next().toUpperCase().charAt(0);
        switch (option){
            case 'E':
                dol2eu(money);
                break;
            case 'D':
                eu2dol(money);
                break;
        }
    }
    public static void showMenu(){
        System.out.println(" Intrroduce el dinero: \n" +
                "Introduce la E o la D \n" +
                "E = dolar to euro \n" +
                "D = euro to dollar.");
    }
    public static double eu2dol(double money){
        money = money * 1.92;
        return money;
    }
    public static double dol2eu(double money){
        money = money * 0.90;
        return money;
    }

}
