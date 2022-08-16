public class runthreadimpltherunningintface implements Runnable {
    public static void main(String[] args){
        runthreadimpltherunningintface obj = new runthreadimpltherunningintface();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("this code is outside of the thread");
    }
    public void run(){
        System.out.println("This code is running ina thread.");
    }
}
