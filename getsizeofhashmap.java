import java.util.HashMap;

public class getsizeofhashmap {
    public static void main(String[] args){
        HashMap<String,String> capitalcities = new HashMap<String,String>();
        capitalcities.put("England","London");
        capitalcities.put("Germany","Berlin");
        capitalcities.put("Norway","Oslo");
        capitalcities.put("USA","Washington DC");
        System.out.println(capitalcities.size());
    }
}
