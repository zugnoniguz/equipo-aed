package ContadorPalabras;
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
}

class Principal {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        ContadorPalabras contador = new ContadorPalabras(); 
        System.out.println("Ingrese una frase: ");
        String frase =  scanner.nextLine();
        int cantidad = contador.contarPalabras(frase); 
        System.out.println("La cantidad de palabras es: " + cantidad); 
        scanner.close();
    }
}