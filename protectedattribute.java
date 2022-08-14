class protectedattribute{
    protected String fname = "Shishir";
    protected String lname = "Tambe";
    protected String email = "Shishirtambe@gmail.com";
    protected int age = 25;
}
class Student extends protectedattribute{
    int graduationYear = 2021;
    public static void main(String[] args){
        Student myObj = new Student();
        System.out.println("Name: "+myObj.fname+ " "+myObj.lname);
        System.out.println("Email: "+myObj.email);
        System.out.println("Age: "+myObj.email);
        System.out.println("Graduation year: "+myObj.graduationYear);
    }
}
//it shows error stating main method not found
//but if you run it from line 10 it runs effectively
