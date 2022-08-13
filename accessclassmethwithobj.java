
public class accessclassmethwithobj {
    public void fullthrottle(){
        System.out.println("The car is at its max Speed!");
    }
    public void speed(int maxSpeed){
        System.out.println("Max Speed: "+ maxSpeed);
    }
    public static void main(String[] args){
        accessclassmethwithobj myCar = new accessclassmethwithobj();
        myCar.fullthrottle();
        myCar.speed(450);
    }
}
