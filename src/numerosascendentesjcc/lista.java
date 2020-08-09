package numerosascendentesjcc;

import java.util.LinkedList;

public class lista {

    public static LinkedList<Integer> listaNumeros = new LinkedList<Integer>();
    public static boolean aceptado = true;


    public static void limpiarLista() {
        listaNumeros.clear();
    }
    
    public static void agregarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public static void verificarOrdenados() {
        if (listaNumeros.size() > 1) {
            int numeroSiguiente = listaNumeros.getLast();
            int numeroAnterior = listaNumeros.get(listaNumeros.size() - 2);
            if (numeroAnterior > numeroSiguiente) {
                aceptado = true;
            } else {
                aceptado = false;
            }
        } else {
            aceptado = true;
        }
    }

    public static Boolean encontrado() {
        return aceptado;
    }
    
    public static void numeros(){
        for (int i = listaNumeros.size()-1; i > -1; i--) {
            System.out.println(listaNumeros.get(i));
        }
    }
}
