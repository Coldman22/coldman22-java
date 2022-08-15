import java.util.ArrayList;

public class createarraylisttostoreintegers {
    public static void main(String[] args){
        ArrayList<Integer> myNumber =new ArrayList<Integer>();
        myNumber.add(10);
        myNumber.add(20);
        myNumber.add(30);
        myNumber.add(45);
        for(int i : myNumber){
            System.out.println(i);
        }
    }
}
