package Sort;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Casos {

    public static void main(String[] args) {
        int numRepeticiones = 17;
        for (int i = 0; i < numRepeticiones; i++) {
            generarListaVacia();
            generarListaOrdenada();
            generarListaUnElemento();
            generarListaDesordenada();
            generarListaIzquierdaOrdenada();
            generarListaDerechaOrdenada();
        }
    }

  public static void generarListaVacia() {
    System.out.println(" ");
}

    public static void generarListaUnElemento() {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Random random = new Random();
        int elemento = random.nextInt(200001) - 100000;
        lista.add(elemento);
        System.out.println(listaToString(lista));
    }

    public static void generarListaDesordenada() {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Random random = new Random();
        int tamaño = random.nextInt(501);
        for (int i = 0; i < tamaño; i++) {
            int elemento = random.nextInt(200001) - 100000;
            lista.add(elemento);
        }
        Collections.shuffle(lista);
        System.out.println(listaToString(lista));
    }

    public static void generarListaOrdenada() {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Random random = new Random();
        int tamaño = random.nextInt(501);
        for (int i = 0; i < tamaño; i++) {
            int elemento = random.nextInt(200001) - 100000;
            lista.add(elemento);
        }
        Collections.sort(lista);
        System.out.println(listaToString(lista));
    }

    public static void generarListaIzquierdaOrdenada() {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Random random = new Random();
        int tamaño = random.nextInt(501); 
        int mitad = tamaño / 2;
        for (int i = 0; i < mitad; i++) {
            int elemento = random.nextInt(200001) - 100000;
            lista.add(elemento);
        }
        Collections.sort(lista); 
        for (int i = mitad; i < tamaño; i++) {
            int elemento = random.nextInt(200001) - 100000;
            lista.add(elemento);
        }
        Collections.shuffle(lista.subList(mitad, tamaño)); 
        System.out.println(listaToString(lista));
    }
    
    public static void generarListaDerechaOrdenada() {
    ArrayList<Integer> lista = new ArrayList<Integer>();
    Random random = new Random();
    int tamaño = random.nextInt(501); 
    int mitad = tamaño / 2;
    for (int i = 0; i < mitad; i++) {
        int elemento = random.nextInt(200001) - 100000;
        lista.add(elemento);
    }
    for (int i = mitad; i < tamaño; i++) {
        int elemento = random.nextInt(200001) - 100000;
        lista.add(elemento);
    }
    Collections.shuffle(lista.subList(0, mitad)); 
    Collections.sort(lista.subList(mitad, tamaño)); 
    System.out.println(listaToString(lista));
}

    public static String listaToString(ArrayList<Integer> lista) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lista.size(); i++) {
            sb.append(lista.get(i));
            if (i < lista.size() - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
