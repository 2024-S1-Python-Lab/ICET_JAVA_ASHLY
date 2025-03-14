import java.util.Scanner;

public class Employee {
    int eNo;
    String eName;
    double eSalary;

    public void getdetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Employee number: ");
        eNo = sc.nextInt();
        System.out.print("Name: ");
        sc.nextLine();  
        eName = sc.nextLine();
        System.out.print("Salary: ");
        eSalary = sc.nextDouble();
    }

    void display() {
        System.out.println("Employee No: " + eNo);
        System.out.println("Name: " + eName);
        System.out.println("Salary Amount: " + eSalary + "\n");
    }

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("\nEnter the number of Employees: ");
        int num = sc1.nextInt();

        System.out.println("Enter the Employee details: ");
        Employee arr[] = new Employee[num];

        
        for (int i = 0; i < num; i++) {
            arr[i] = new Employee();
            arr[i].getdetails();
        }


        System.out.println("Information of all the employees: ");
        for (int i = 0; i < num; i++) {
            arr[i].display();
        }


        System.out.println("Enter the Employee Number to get details of an employee: ");
        int num2 = sc1.nextInt();

        boolean state = false;
        for (int i = 0; i < num; i++) {
            if (arr[i].eNo == num2) {
                System.out.println("Employee details: ");
                arr[i].display();
                state = true;
                break;  
            }
        }

        
        if (!state) {
            System.out.println("Employee with number " + num2 + " not found.");
        }
    }
}