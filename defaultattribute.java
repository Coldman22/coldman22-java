class defaultattribute{
    String fname = "John";
    String lname = "Doe";
    String email = "Johndoe@doe.com";
    int age = 24;

    public static void main(String[] args){
        defaultattribute myObj = new defaultattribute();
        System.out.println("Name: "+myObj.fname+ " "+ myObj.lname);
        System.out.println("Email: "+myObj.email);
        System.out.println("Age: "+myObj.age);
    }
}