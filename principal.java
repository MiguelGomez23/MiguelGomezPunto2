import java.util.Scanner;
import java.util.Stack;

public class principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        metodos m = new metodos();

        System.out.print("Ingrese una cadena de caracteres: ");
        String Texto = scanner.nextLine();

        Stack<Character> PilaOr = m.llenarpila(Texto);
        System.out.println("La pila original es: " + PilaOr);

        Stack<Character> PilaIn = m.Invertir(PilaOr);
        System.out.println("La pila invertida es: " + PilaIn);

        String cadenaInvertida = "";
        while (!PilaIn.isEmpty()) {
            cadenaInvertida += PilaIn.pop();
        }
        System.out.println("La cadena invertida es: " + cadenaInvertida.toString());
    }
}