class inheritanceextends{
    protected String brand ="Ford";
    public void honk(){
        System.out.println("Tuut,tuut!");
    }
}
class Car extends inheritanceextends{
    private String modelName = "Mustang";
    public static void main(String[] args){
        Car myFastCar = new Car();
        myFastCar.honk();

        System.out.println(myFastCar.brand+ " "+myFastCar.modelName);
    }
}
//program doesnt work 
//program only works inernally