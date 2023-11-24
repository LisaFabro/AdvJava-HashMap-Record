import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

public class Main {
    //Creare 3 hashmap con 3 differenti metodi di inizializzazione e stampare il contenuto.
    public static void main(String[] args) {
        //mutabile, valori modificabili
        Fruit apple = new Fruit("apple", 0.50);
        Fruit strawberry = new Fruit("strawberry", 1.50);
        Fruit pear = new Fruit("pear", 0.50);
        Fruit orange = new Fruit("orange", 0.60);
        Fruit ananas = new Fruit("ananas", 1.50);
        Fruit kiwi = new Fruit("kiwi", 1.99);

        Map<String, Fruit> fruitShop1 = new HashMap<String, Fruit>();
        fruitShop1.put("fruit1", apple);
        fruitShop1.put("fruit2", strawberry);
        fruitShop1.put("fruit3", pear);

        //ha max 10 coppie!
        Map<String, Fruit> fruitShop2 = new HashMap<String, Fruit>(
                Map.of("fruit1", apple, "fruit2", orange, "fruit3", ananas));

        Map<String,Fruit> fruitShop3 = new HashMap<String,Fruit>(
                Map.ofEntries(new AbstractMap.SimpleEntry<String, Fruit>("fruit1", strawberry),
                        new AbstractMap.SimpleEntry<String, Fruit>("fruit2", kiwi),
                        new AbstractMap.SimpleEntry<String, Fruit>("fruit3", ananas)));

        System.out.println("Fruit that you can find in fruit shop 1: " + fruitShop1);
        System.out.println("Fruit that you can find in fruit shop 2: " + fruitShop2);
        System.out.println("Fruit that you can find in fruit shop 3: " + fruitShop3);
    }
}