public class constructorwithpara {
    int modelYear;
    String modelName;

    public constructorwithpara(int year, String name){
        modelYear = year;
        modelName = name;
    }
    public static void main(String[] args){
        constructorwithpara myCar = new constructorwithpara(1978, "Ford");
        System.out.println(myCar.modelYear+ " "+myCar.modelName);
    }
}
