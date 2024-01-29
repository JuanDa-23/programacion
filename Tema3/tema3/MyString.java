package tema3;

import java.util.Scanner;

public class MyString {
    static String cadena = "Mi primera cadena.";
    static Scanner in = new Scanner(System.in);
    public static String convertString() {
        cadena = cadena.toUpperCase();

        StringBuilder stringBuilder = new StringBuilder(cadena);
        String invertida = stringBuilder.reverse().toString();
        cadena.equals(invertida);
        return invertida;

    }

    public static void showHowManyVocals(String string) {
        int vocals = 0;
        String stringInLowerCases = string.toLowerCase();
        for (int i = stringInLowerCases.length() - 1; i >= 0; i--) {
            if (stringInLowerCases.charAt(i) == 'a' || stringInLowerCases.charAt(i) == 'e'
                    || stringInLowerCases.charAt(i) == 'i' || stringInLowerCases.charAt(i) == 'o'
                    || stringInLowerCases.charAt(i) == 'u') {
                vocals++;
            }
        }
        System.out.println("Tu cadena tiene: " + vocals + " vocales.");
    }

    public static String palabraMasLarga(String cadena) {
        String[] palabras = cadena.split("\\s+");
        String masLarga = "";
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() > masLarga.length()) {
                masLarga = palabras[i];
            }
        }
        return masLarga;
    }

    public static int contarOcurrencias(String string, String subststring) {
        int contador = 0;
        int index = string.indexOf(subststring);
        while (index != -1) {
            contador++;
            index = string.indexOf(subststring, index + 1);
        }
        return contador;
    }

    public static int contarPalabras(String cadena) {
        String[] palabras = cadena.split("\\s+");
        return palabras.length;
    }

    public static String telefono(String numero){
        while(numero.length() != 9) {
            System.out.println("El número de teléfono debe tener 9 dígitos.");
            numero = in.nextLine();
        }
        String codigoPais = numero.substring(0, 2);
        String prefijo = numero.substring(2, 5);
        String sufijo = numero.substring(5);

        return String.format("(+%s)-%s-%s", codigoPais, prefijo, sufijo);
    }

    public static void histogramaVocales(String cadena) {
        System.out.println("HISTOGRAMA");
        int[] frecuenciaVocales = new int[cadena.length()];
        String vocales = "aeiou";

        char[] caracteres = cadena.toCharArray();
        for (int j = 0; j < caracteres.length; j++) {
            char letra = caracteres[j];
            int index = vocales.indexOf(letra);
            if (index != -1) {
                frecuenciaVocales[index]++;
            }
        }
        for (int i = 0; i < vocales.length(); i++) {
            System.out.println(vocales.charAt(i) + " " + frecuenciaVocales[i] + " " + "*".repeat(frecuenciaVocales[i]));
        }
    }


    public static void showMenu() {
        System.out.println("Elige escribiendo la letra que desees: ");
        System.out.println("a) Invertir y convertir a mayúsculas");
        System.out.println("b) Contar vocales");
        System.out.println("c) Palabra más larga");
        System.out.println("d) Número de ocurrencias de una subcadena");
        System.out.println("e) Número de palabras");
        System.out.println("f) Formato de teléfono");
        System.out.println("g) Histograma de frecuencias de vocales");
        System.out.println("h) Salir");

    }

    public static void main(String[] args) {
        System.out.println("Escribe lo que quieras: ");
        boolean salir = false;
        String string1 = in.nextLine().toLowerCase();
        showMenu();
        while (!salir){
            char letter = in.nextLine().toLowerCase().charAt(0);
            switch (letter) {
                case 'a':
                   convertString();
                    break;
                case 'b':
                    showHowManyVocals(string1);
                    break;
                case 'c':
                     String palabraMasLarga = MyString.palabraMasLarga(string1);
                    System.out.println("La palabra más larga: " + palabraMasLarga);
                    break;
                case 'd':
                    System.out.print("Esctribe otra: ");
                    String substring = in.nextLine();
                    System.out.println("Ocurrencias: " + MyString.contarOcurrencias(string1, substring));
                    break;
                case 'e':
                    System.out.println("El total de palabras es: " + MyString.contarPalabras(string1));
                    break;
                case 'f':
                    System.out.println("Dame un numero de telefono: ");
                    String numero = in.nextLine();
                    System.out.println("El número en cuestión: " + MyString.telefono(numero));
                    break;
                case 'g':
                    histogramaVocales(string1);
                    break;
                case 'h':
                    System.out.println("Saliste");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción incorrecta.");
            }
        }
    }
}

