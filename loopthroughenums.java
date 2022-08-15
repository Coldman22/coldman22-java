enum Level{
    LOW,
    MEDIUM,
    HIGH
}
public class loopthroughenums {
    public static void main(String[] args){
        for(Level myVar : Level.values()){
            System.out.println(myVar);
        }
    }
}
