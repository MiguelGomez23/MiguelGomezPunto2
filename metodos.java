import java.util.Stack;

public class metodos {
    public Stack<Character> llenarpila(String cadena) {
        Stack<Character> pila = new Stack<>();
        char[] cadenaArray = cadena.toCharArray();
        for (int i = 0; i < cadenaArray.length; i++) {
            pila.push(cadenaArray[i]);
        }
        return pila;
    }

    public Stack<Character> Invertir(Stack<Character> pila) {
        Stack<Character> pilainvertida = new Stack<>();
        int tam = pila.size();
        for (int i = 0; i < tam; i++) {
            pilainvertida.push(pila.pop());
        }
        return pilainvertida;
    }
}