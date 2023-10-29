class PrintNumbers implements Runnable {
    public void run() {
		//22AD1017 DRISHYA B3
        System.out.println("Printing Numbers:");
        for (int i = 1; i <= 10; i++) {            System.out.println(i);          }    }    }
class PrintSquares implements Runnable {
    public void run() {
        System.out.println("Printing Squares:");
        for (int i = 1; i <= 10; i++) {            System.out.println(i * i);        }    }    }
class MultiThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PrintNumbers());        Thread t2 = new Thread(new PrintSquares());
        t1.start();        t2.start();    }  }
