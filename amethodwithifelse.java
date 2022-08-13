public class amethodwithifelse {
    static void checkAge(int age){
        if(age<18){
            System.out.println("You are not too old enough to access!");
        }
        else{
            System.out.println("You can access!");
        }
    }
    public static void main(String[] args){
        checkAge(20);
    }
}
