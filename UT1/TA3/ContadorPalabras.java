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

//Subequipo “B”: Obtener la cantidad de palabras con largo mayor a X caracteres
// Para esta funcionalidad al metodo ContadorPalabras se le agrega un parametro entero que indica la cantidad de caracteres minimos que debe tener una palabra para ser contada.
// Se agrega un metodo que cuenta la cantidad de palabras con largo mayor a X caracteres.

    public int contarCaracteresX(String frase, int num){
        if (frase == null) {
            return 0;
        }

        frase = frase.trim();
        if (frase.isEmpty()) {
            return 0;
        }
        int contadorLetras = 0;
        int contadorPalabras = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (Character.isWhitespace(c)) {
                if(contadorLetras > num){
                    contadorPalabras++;
                }
                contadorLetras = 0;
            }else{
                contadorLetras++;
            }
        }
        return contadorPalabras;
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
        System.out.println("Ingrese la cantidad de caracteres minimos que debe tener una palabra para ser contada: ");
        int num = scanner.nextInt();
        int cantidadCaracteres = contador.contarCaracteresX(frase, num);
        System.out.println("La cantidad de palabras con largo mayor a " + num + " caracteres es: " + cantidadCaracteres);
        scanner.close();
    }
}