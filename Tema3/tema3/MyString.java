package tema3;

import java.util.Objects;

public class MyString {
    static String cadena = "Mi primera cadena.";
    public static void main(String[] args){
        System.out.println(convertString());
        System.out.println(countLetter());
    }

    public static String convertString() {
        cadena = cadena.toUpperCase();

        StringBuilder stringBuilder = new StringBuilder(cadena);
        String invertida = stringBuilder.reverse().toString();
        cadena.equals(invertida);
        return invertida;

    }

    public static int countLetter(){
        for (int i = 0; i < cadena.length(); i++) {
            if (Objects.equals('a'))
             int totalVocales = 0;
             totalVocales ++;
            i++;
        }
        return totalVocales;
    }



}
