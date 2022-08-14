//abstract class
abstract class absclaabsmet{
    public String fname = "Shishir";
    public String lname = "Tambe";
    public String email = "Shishirtambe@gmail.com";
    public int age = 24;
    public abstract void Student();//abstarct method
}
//Sub class
class absclaabsmetStudent extends absclaabsmet{
    public int graduationYear = 2021;
    public String fname;
    public String age;
    public String email;
    public String lname;
    public void study(){
        System.out.println("Studys all day long.");
    }
    @Override
    public void Student() {
        // TODO Auto-generated method stub
        
    }
}  
