import java.util.HashMap;
import java.util.Map;

public class Main {
    //Definisci un oggetto Record che rappresenti un Punto con le coordinate x & y
    public static void main(String[] args) {
        Punto punto1 = new Punto(10, -12);

        System.out.println("Coordinate di punto: " + punto1);

        Punto punto2 = new Punto(1, 17);
        Punto punto3 = new Punto(-11, 31);

        Map<String, Punto> punti = new HashMap<>();
        punti.put("Punto 1 ", punto1);
        punti.put("Punto 2 ", punto2);
        punti.put("Punto 3 ", punto3);

        System.out.println("Lista delle coordinate dei punti: " + punti);
    }
}