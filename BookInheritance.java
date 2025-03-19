import java.util.Scanner;

class Publisher {
    String name;

   
    public void getPublisherDetails(Scanner sc) {
        System.out.print("Enter Publisher Name: ");
        name = sc.nextLine();
    }
}

class Book extends Publisher {
    String title;
    int year;

    
    public void getBookDetails(Scanner sc) {
        System.out.print("Enter Book Title: ");
        title = sc.nextLine();
        System.out.print("Enter Publication Year: ");
        year = sc.nextInt();
        sc.nextLine();
    }

   
    public void displayBookDetails() {
        System.out.println("\nPublisher: " + name);
        System.out.println("Title: " + title);
        System.out.println("Year of Publication: " + year);
    }
}

class Literature extends Book {
    String gen;

   
    public void getLiteratureDetails(Scanner sc) {
        System.out.print("Enter Generation: ");
        gen = sc.nextLine();
    }

    @Override
    public void displayBookDetails() {
        super.displayBookDetails();
        System.out.println("Generation: " + gen);
    }
}

class Fiction extends Book {
    String theme;

   
    public void getFictionDetails(Scanner sc) {
        System.out.print("Enter Theme: ");
        theme = sc.nextLine();
    }

    @Override
    public void displayBookDetails() {
        super.displayBookDetails();
        System.out.println("Theme: " + theme);
    }
}

public class BookInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the number of literature books: ");
        int numLitBooks = sc.nextInt();
        sc.nextLine();
        Literature[] litBooks = new Literature[numLitBooks];
        System.out.println("Enter details for literature books:");

        for (int i = 0; i < numLitBooks; i++) {
            litBooks[i] = new Literature();
            litBooks[i].getPublisherDetails(sc);
            litBooks[i].getBookDetails(sc);
            litBooks[i].getLiteratureDetails(sc);
        }

        
        System.out.print("Enter the number of fiction books: ");
        int numFicBooks = sc.nextInt();
        sc.nextLine(); 
        Fiction[] ficBooks = new Fiction[numFicBooks];
        System.out.println("Enter details for fiction books:");

        for (int i = 0; i < numFicBooks; i++) {
            ficBooks[i] = new Fiction();
            ficBooks[i].getPublisherDetails(sc);
            ficBooks[i].getBookDetails(sc);
            ficBooks[i].getFictionDetails(sc);
        }

        
        System.out.println("\nLiterature Books:");
        for (Literature litBook : litBooks) {
            litBook.displayBookDetails();
            System.out.println();
        }

        
        System.out.println("\nFiction Books:");
        for (Fiction ficBook : ficBooks) {
            ficBook.displayBookDetails();
            System.out.println();
        }

        sc.close(); 
    }
}