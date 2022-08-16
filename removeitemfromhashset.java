import java.util.HashSet;

public class removeitemfromhashset {
    public static void main(String[] args){
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.remove("Volvo");
        System.out.println(cars);
    }
}
