package UT1.TA3;
import java.util.Scanner;

//se ingresa por parametro una frase y se devuelve la cantidad de palabras que contiene,
//Se considera que una palabra es una secuencia de caracteres que no contienen espacios.

//Metodo de la clase ContadorPalabras cuenta la cantidad de palabras en una frase.
class ContadorPalabras {
    public int contarPalabras(String frase) {
        if (frase == null) {
            return 0;
        }

        frase = frase.trim();
        if (frase.isEmpty()) {
            return 0;
        }
        
        int contador = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            //Chequea si es una letra o un espacio.
            if (Character.isWhitespace(c)) {
                contador++;
            }
        }

        return (contador +1); // Devuelvo la cantidad de espacios +1 que es la cantidad de palabras, ya que la ultima palabra no tiene espacio despues.
    }
    public int[] VocalesConsonante(String frase) {
        frase = frase.toLowerCase();
        int contadorVocales =0;
        int contadorConsonantes =0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    contadorVocales++;
                } else {
                    contadorConsonantes++;
                }
            }
        }
        return new int[]{contadorVocales, contadorConsonantes};
    }

}

class Principal {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese Opcion: \n1- Contar Palabras\n2- Contar Vocales y Consonantes");
        String Opcionstr =  scanner.nextLine();
        int Opcion = Integer.parseInt(Opcionstr);

        if (Opcion == 1){
            ContadorPalabras contador = new ContadorPalabras(); 
            System.out.println("Ingrese una frase: ");
            String frase =  scanner.nextLine();
            int cantidad = contador.contarPalabras(frase); 
            System.out.println("La cantidad de palabras es: " + cantidad); 
            scanner.close();
        }else if (Opcion == 2){
            ContadorPalabras contador = new ContadorPalabras(); 
            System.out.println("Ingrese una frase: ");
            String frase =  scanner.nextLine();
            int[] cantidad = contador.VocalesConsonante(frase); 
            System.out.println("La cantidad de vocales es: " + cantidad[0]); 
            System.out.println("La cantidad de consonantes es: " + cantidad[1]); 
            scanner.close();
        }else{
            System.out.println("Opcion no valida");
        }

    }
}