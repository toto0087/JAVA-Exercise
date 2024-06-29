import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<String> autos = new ArrayList<>();
        autos.add("Ford");
        autos.add("Toyota");
        autos.add("Citroen");

        String marcaDeAuto = "TOTO";

        List<String> nombres = new ArrayList<>();
        nombres.add("Juan Melo");
        nombres.add("Anibal Mignaqui");
        nombres.add("Martin Jams");

        String nombre = "Martin";

        //EJ 1
        imprimirListaDeNombres();
        //EJ 2
        contieneString(autos,marcaDeAuto);
        //EJ 3
        contieneNombre(nombres,nombre);
        //EJ 4
        HashMap<Long, String> hashMap = creadorDeHashMap();
        tieneKey(hashMap, 1L);
        retornarValorDeClave(hashMap, 1L);
    }

    // EJ 4
    private static void retornarValorDeClave(HashMap<Long,String> hashMap, long l) {
        System.out.println("El valor de la key " + l + " es: " + hashMap.get(l));
    }

    private static void tieneKey(HashMap<Long,String> hashMap, long l) {
        if (hashMap.containsKey(l)) {
            System.out.println("El hashmap contiene la key: " + l);
        } else {
            System.out.println("El hashmap no contiene la key: " + l);
        }
    }

    private static HashMap<Long, String> creadorDeHashMap() {
        HashMap<Long, String> hashMap = new HashMap<>();
        hashMap.put(1L, "Juan");
        hashMap.put(2L, "Pedro");
        hashMap.put(3L, "Maria");

        for (Map.Entry<Long, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        return hashMap;
    }



    // EJ 3
    private static List<String> contieneNombre(List<String> lista, String subString) {
        List<String> elementosEncontrados = new ArrayList<>();
        for (String elemento : lista) {
            if (elemento.contains(subString)) {
                elementosEncontrados.add(elemento);
            }
        }
        for (String elemento : elementosEncontrados) {
            System.out.println("Elemento encontrado: " + elemento);
        }
        return elementosEncontrados;
    }

    // EJ 2
    private static void contieneString(List<String> autos, java.lang.String marcaDeAuto) {
        if (autos.contains(marcaDeAuto)) {
            System.out.println("La lista de autos contiene la marca de auto: " + marcaDeAuto);
        } else {
            System.out.println("La lista de autos no contiene la marca de auto: " + marcaDeAuto);
        }
    }

    // EJ 1
    private static void imprimirListaDeNombres() {
        List<String> nombres = new ArrayList<>();
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }


}