public class privateattribute {
    private String fname = "John";
    private String lname = "Doe";
    private String email = "John@doe.com";
    private int age = 24;

    public static void main(String[] args){
        privateattribute myObj = new privateattribute();
        System.out.println("Name: "+ myObj.fname+ " "+myObj.lname);
        System.out.println("Email: "+myObj.email);
        System.out.println("Age: "+myObj.age);
    }
}
