import java.util.HashSet;

public class loopthroughhashset {
    public static void main(String[] args){
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        for(String i : cars){
            System.out.println(i);
        }
    }
}
