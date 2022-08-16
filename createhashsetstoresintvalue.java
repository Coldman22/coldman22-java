import java.util.HashSet;

public class createhashsetstoresintvalue {
    public static void main(String[] args){
        HashSet<Integer> numbers = new HashSet<Integer>();

        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        //Show which numbers between 1 to 10 in the set
        for(int i = 0; i<= 10; ++i){
            if(numbers.contains(i)){
                System.out.println(i+" was found in the sets.");
            }else{
                System.out.println(i+" was not found in the sets.");
            }
        }
    }
}
