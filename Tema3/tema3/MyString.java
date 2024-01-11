package tema3;

public class MyString {

    public static void main(String[] args){
        System.out.println(convertString());

    }

    public static String convertString() {
        String cadena = "Mi primera cadena.";
        cadena = cadena.toUpperCase();

        StringBuilder stringBuilder = new StringBuilder(cadena);
        String invertida = stringBuilder.reverse().toString();
        cadena.equals(invertida);
        return invertida;

    }




}
