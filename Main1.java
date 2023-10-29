import java.util.Scanner;
class OddException extends Exception {
	//22AD1017 DRISHYA B3
    int num;
   public OddException(int num) {        num = num;      }
    @Override            
    public String toString() {
        return "OddException: Input number must be even, but got odd number";
    }     }
class MyExceptionDemo {
    public static void OddNoException(int num) throws OddException {
        if (num % 2 != 0) {
            throw new OddException(num);
        }    }     }
class Main1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = s.nextInt();
        try {
            MyExceptionDemo.OddNoException(x);
            int square = x * x;
            System.out.println("Square of the number: " + square);
        } catch (OddException e) {
            System.out.println(e);
        }    }     }
