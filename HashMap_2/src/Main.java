import java.util.*;

public class Main {
    //Creare un hashmap prendere tutti i valori, ordinarli e stamparli
    public static void main(String[] args) {
        Fruit apple = new Fruit("apple", 0.50);
        Fruit strawberry = new Fruit("strawberry", 1.50);
        Fruit pear = new Fruit("pear", 0.50);
        Fruit ananas = new Fruit("ananas", 1.50);
        Fruit kiwi = new Fruit("kiwi", 1.99);

        HashMap<String, Fruit> fruitShop = new HashMap<String, Fruit>();
        fruitShop.put("fruit1", apple);
        fruitShop.put("fruit2", strawberry);
        fruitShop.put("fruit3", pear);
        fruitShop.put("fruit4", kiwi);
        fruitShop.put("fruit5", ananas);

        System.out.println("Frutta non ordinata: " + fruitShop);

//       TreeMap<String,Fruit> orderFruit = new TreeMap<>();
//        orderFruit.putAll(fruitShop);

        List<Fruit> orderedFruit = new ArrayList<Fruit>(fruitShop.values());
        orderedFruit.sort(Comparator.comparing(Fruit :: getName));

        System.out.println("Ordine secondo inserimento: " + orderedFruit);
    }
}