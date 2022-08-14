//Abstract class
abstract class Animal{
    //Abstract method
    public abstract void animalSound();
    //Regular Method
    public void sleep(){
        System.out.println("Zzzz");
    }
}
//Subclass (inherit from Animal)
class Pig extends Animal{
    public void animalSound(){
        //The body of animal sound is provided here
        System.out.println("The Pig says: WEE WEE");
    }
}
class abstractclassmeth{
    public static void main(String[] args){
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}