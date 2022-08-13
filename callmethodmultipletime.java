public class callmethodmultipletime {
    static void myMethod(){
        System.out.println("I just got hacked!");
    }
    public static void main(String[] args){
        myMethod();
        myMethod();
        myMethod();
        myMethod();
    }
}
