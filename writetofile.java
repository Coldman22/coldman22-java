import java.io.FileWriter;
import java.io.IOException;

public class writetofile {
    public static void main(String[] args){
        try{
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("File in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        }catch(IOException e){
            System.out.println("An Error occured");
            e.printStackTrace();
        }
    }
}
