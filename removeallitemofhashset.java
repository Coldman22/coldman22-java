import java.util.HashSet;

public class removeallitemofhashset {
    public static void main(String[] args){
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.clear();;
        System.out.println(cars);
    }
}
