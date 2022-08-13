public class methodoverloading {
    static int plusMethod(int x, int y){
        return x + y;
    }
    static double plusMethod(double x, double y){
        return x - y;
    }
    public static void main(String[] args){
        int myNum1 = plusMethod(5, 8);
        double myNum2 = plusMethod(4.5, 2.1);
        System.out.println("int: "+myNum1);
        System.out.println("Double: "+ myNum2);
    }
}
