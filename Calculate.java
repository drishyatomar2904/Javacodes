//Calculate Area of rectangle and square
import java.util.*;
class Calculate {
	//22AD1017 DRISHYA TOMAR B3
    public static void main(String[] args) {
    Scanner s=new Scanner (System.in);
    Area o=new Area();
    System.out.print("Enter Length of Rectangle: ");
    int a=s.nextInt();
    System.out.print("Enter Breadth of Rectangle: ");
    int b=s.nextInt();
    System.out.print("Enter Sides of Square: ");
    int c=s.nextInt();
    o.Rectangle(a,b);
    o.Square(c);
    }
}
class Area{
    int area;
void Rectangle(int l, int b){
        area=l*b;
        System.out.println("Area of Rectangle is "+area);
    }
void Square(int s){
        area=s*s;
        System.out.println("Area of Square is "+area);
    }
}
