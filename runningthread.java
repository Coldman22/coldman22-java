public class runningthread extends Thread {
    public static void main(String[] args) {
      runningthread thread = new runningthread();
      thread.start();
      System.out.println("This code is outside of the thread");
    }
    public void run() {
      System.out.println("This code is running in a thread");
    }
  }