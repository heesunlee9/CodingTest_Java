package Bridge_Java;

public class X_3_solution extends Thread {
  static Object o = new Object();
  static int counter = 0;
  int id;

  public X_3_solution(int id) {
    this.id = id;
    o = new Object();
  }

  public void run() {
    if (id == 0) {
      new X_3(1).start();
      try {
       sleep(100); // 해결 : 시간차를 둔다
      } catch (Exception e) {

      }
      new X_3(2).start();
      return;
    }
    synchronized (o) {
      System.err.println(id + " --->");
      try {
        if (counter == 0) {
          counter = 1;
          o.wait();
        } else
          o.notifyAll(); // 이거하면 Thread 끝남
      } catch (InterruptedException e) { }
      System.err.println(id + " <---");
    }
  }
  public static void main (String args[]) {
    new X_3_solution(0).start();
  }
}
