import java.util.ArrayList;

public class loopthrougharraylistforeach {
    public static void main(String[] args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Mazda");
        cars.add("Ford");
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
