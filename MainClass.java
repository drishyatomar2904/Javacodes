import java.util.Scanner;
class Student {
	//22AD1017 DRISHYA B3
    int roll;
    Scanner sc = new Scanner(System.in);
    void getNumber() {
        System.out.println("Enter Roll Number");
        roll = sc.nextInt();
    }
    void putNumber(){
        System.out.println("Roll Number = " + roll);
    }       }
class Test extends Student {
    int sem1, sem2;
    Scanner sc = new Scanner(System.in);
    void getMarks(){
        System.out.println("Enter Marks of Sem 1");
        sem1 = sc.nextInt();
        System.out.println("Enter Marks of Sem 2");
        sem2 = sc.nextInt();
    }
    void putMarks(){
        System.out.println("Sem 1 Marks = " + sem1);
        System.out.println("Sem 2 Marks = " + sem2);        
    }       }
interface Sports {
    float m = 5.5f;  //Considering grace marks as 5.5
    // f is writtem to make sure compiler take it as a float type
    void putscore();
}
class Result extends Test implements Sports {
    float total;
    public void putscore(){
                System.out.println("Sports Marks = " + m);
    }
    void calculateTotal() {
        total = sem1 + sem2 + m;
        System.out.println("Total Marks = " + total);
    }
    void display(){
    putNumber();
    putMarks();
    putscore();
    calculateTotal();
    }       }
class MainClass {
    public static void main(String[] args) {
        Result r1 = new Result();
        r1.getNumber();
        r1.getMarks();
        System.out.println("MARKS INFORMATION");
        r1.display();
    }        }
