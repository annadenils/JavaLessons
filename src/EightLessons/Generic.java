package EightLessons;

import java.util.*;

public class Generic {

    public static void main(String[] args) {

        array();
        System.out.println("-------------------");
        set();
        System.out.println("-------------------");
        linkedSet();
        System.out.println("-------------------");
        treeSet();
        System.out.println("-------------------");
        hashMap();
        System.out.println("-------------------");
        String ch = "chair";
        String s = "sofa";
        String ch1 = "chair";

        if (!ch.equals(s)){
            System.out.printf("They are not equal: \n%d\n%d\n", ch.hashCode(), s.hashCode());
        }

        if (ch1.equals(ch)){
            System.out.printf("They are equal: \n%d\n%d\n", ch.hashCode(), ch1.hashCode());
        }

    }

    public static void array() {
        List <String> furniture = new ArrayList<>();
        furniture.add("chair");
        furniture.add("sofa");
        furniture.add("cupboard");
        furniture.add("table");

        for (String item: furniture){
            System.out.println(item);
        }

        System.out.println("============");

        furniture.remove(2);

        for (String item: furniture){
            System.out.println(item);
        }

        System.out.println("============");

        furniture.set(1,"dresser");
        for (String item: furniture){
            System.out.println(item);
        }

}
    public static void set(){
        Set <String> set = new HashSet<>();
        set.add("first index");
        set.add("second index");
        set.add("third index");

        for (String item1: set){
            System.out.println(item1);
        }

        System.out.println("============");

        set.remove("third index");

        for (String item1: set){
            System.out.println(item1);
        }
    }

    public static void linkedSet(){
        Set<String> linked = new LinkedHashSet<>();
        linked.add("1 String");
        linked.add("2 String");
        linked.add("3 String");

        for (String item2: linked){
            System.out.println(item2);
        }

        System.out.println("============");

        linked.remove("1 String");

        for (String item2: linked){
            System.out.println(item2);
        }
    }

    public static void treeSet(){
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("new");
        treeSet.add("old");
        treeSet.add("middle");

        for (String item3: treeSet){
            System.out.println(item3);
        }

        System.out.println("============");

        treeSet.remove("middle");
        for (String item3: treeSet){
            System.out.println(item3);
        }

    }

    public static void hashMap(){
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "11111111");
        hashMap.put(2, "22222222");
        hashMap.put(3, "333333");

        for (Map.Entry<Integer, String> item: hashMap.entrySet()){
            System.out.printf("%d '%s'\n", item.getKey(), item.getValue());
        }

        System.out.println("============");

        hashMap.remove(2, "22222222");
        for (Map.Entry<Integer, String> item: hashMap.entrySet()){
            System.out.printf("%d '%s'\n", item.getKey(), item.getValue());
        }
    }
}
