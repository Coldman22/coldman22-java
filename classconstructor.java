public class classconstructor {
    int x;

    public classconstructor(){
        x =5;
    }
    public static void main(String[] args){
        classconstructor myObj = new classconstructor();
        System.out.println(myObj.x);
    }
}