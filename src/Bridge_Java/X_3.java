package Bridge_Java;

public class X_3 extends Thread {
  static Object o = new Object();
  static int counter = 0;
  int id;

  public X_3(int id) {
    this.id = id;
    o = new Object();
  }

  public void run() {
    if (id == 0) {
      new X_3(1).start();
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
  public static void main (String args[]){
    new X_3(0).start();
  }
}

// expected result (항상 이렇게 나오지는 않음. 왜??)
// 1 --->
// 2 --->
// 2 <---
// 1 <---

// what is it behavior as a scheduler to make this program go into non termination - 이 프로그램이 종료가 안될 수도 있다고?
