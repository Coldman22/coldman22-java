import java.util.ArrayList;

public class removeallfromarrayList {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Ford");
        cars.clear();
        System.out.println(cars);
    }
}
