import java.util.HashSet;

public class checkanitemexistinhashset {
    public static void main(String[] args){
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars.contains("Mazda"));
    }
}
