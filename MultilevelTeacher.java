import java.util.Scanner;

class Person {
    String name, gender, addr;
    int age;

    
    Person(String name, String gender, String addr, int age) {
        this.name = name;
        this.gender = gender;
        this.addr = addr;
        this.age = age;
    }
}

class Employee extends Person {
    int empid;
    String compName, qual;
    double salary;

   
    Employee(String name, String gender, String addr, int age, 
             int empid, String compName, String qual, double salary) {
       
        super(name, gender, addr, age);
        this.empid = empid;
        this.compName = compName;
        this.qual = qual;
        this.salary = salary;
    }
}

class Teacher extends Employee {
    String sub, dept;
    int Tid;

    
    Teacher(String name, String gender, String addr, int age, 
            int empid, String compName, String qual, double salary, 
            String sub, String dept, int Tid) {
        
        super(name, gender, addr, age, empid, compName, qual, salary);
        this.sub = sub;
        this.dept = dept;
        this.Tid = Tid;
    }

    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + addr);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + empid);
        System.out.println("Company Name: " + compName);
        System.out.println("Qualification: " + qual);
        System.out.println("Salary: " + salary);
        System.out.println("Subject: " + sub);
        System.out.println("Department: " + dept);
        System.out.println("Teacher ID: " + Tid);
    }
}

public class MultilevelTeacher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();  
        Teacher[] teachers = new Teacher[n];
        System.out.println("Enter details for teachers:");

       
        for (int i = 0; i < n; i++) {
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Gender: ");
            String gender = sc.nextLine();
            System.out.print("Address: ");
            String addr = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Employee ID: ");
            int empid = sc.nextInt();
            sc.nextLine();  

            System.out.print("Company Name: ");
            String compName = sc.nextLine();
            System.out.print("Qualification: ");
            String qual = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();  

            System.out.print("Subject: ");
            String sub = sc.nextLine();
            System.out.print("Department: ");
            String dept = sc.nextLine();
            System.out.print("Teacher ID: ");
            int Tid = sc.nextInt();
            sc.nextLine(); 

            
            teachers[i] = new Teacher(name, gender, addr, age, empid, 
                                      compName, qual, salary, sub, dept, Tid);
        }

       
        System.out.println("\nDetails of Teachers:");
        for (Teacher teacher : teachers) {
            teacher.display();
            System.out.println();
        }

        sc.close(); 
    }
}