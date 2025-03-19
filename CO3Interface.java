import java.util.Scanner;

interface Shape {
    void getdata();
    void area();
    void perimeter();
}

class Circle implements Shape {
    double pi = 3.14;
    double r;

    @Override
    public void getdata() {
        System.out.println("Enter the radius of the circle:");
        r = new Scanner(System.in).nextDouble(); 
    }

    @Override
    public void area() {
        System.out.println("Area of the circle: " + (pi * r * r)); 
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of the circle: " + (2 * pi * r)); 
    }
}

class Rectangle implements Shape {
    double l, b;

    @Override
    public void getdata() {
        System.out.println("Enter the length of the rectangle:");
        l = new Scanner(System.in).nextDouble(); 
        System.out.println("Enter the breadth of the rectangle:");
        b = new Scanner(System.in).nextDouble(); 
    }

    @Override
    public void area() {
        System.out.println("Area of the rectangle: " + (l * b)); 
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter of the rectangle: " + (2 * (l + b))); 
    }
}

public class CO3Interface {
    public static void main(String[] args) {
        int ch;
        Scanner sc = new Scanner(System.in); 
        Circle ob1 = new Circle();
        Rectangle ob2 = new Rectangle();

        do {
            System.out.println("\n1. Circle\n2. Rectangle\n3. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    ob1.getdata();
                    ob1.area();
                    ob1.perimeter();
                    break;
                case 2:
                    ob2.getdata();
                    ob2.area();
                    ob2.perimeter();
                    break;
                case 3:
                    System.out.println("Exited...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
            }
        } while (true);
    }
}