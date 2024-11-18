import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Heromanager heroManager = new Heromanager();
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.println("Choose an option:");
            System.out.println("1. Add Hero");
            System.out.println("2. Remove Hero");
            System.out.println("3. Sort Heroes by Power Level (Bubble Sort)");
            System.out.println("4. Sort Heroes by Power Level (Insertion Sort)");
            System.out.println("5. Show Original List");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();  

            if (choice == 1) {
                // Add Hero
                System.out.print("Enter Hero's Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter Hero's Power Level: ");
                int powerLevel = scanner.nextInt();
                scanner.nextLine(); 

                System.out.print("Enter Hero's Affiliation: ");
                String affiliation = scanner.nextLine();

                heroManager.addHero(name, powerLevel, affiliation);

            } 
            else if (choice == 2) 
            {
                System.out.print("Enter Hero's Name to Remove: ");
                String name = scanner.nextLine();
                heroManager.removeHero(name);

            } 
            else if (choice == 3) 
            {
                heroManager.bubbleSortByPower();

            } 
            else if (choice == 4) 
            {
                heroManager.insertionSort();
            }
            else if (choice == 5)
            {
                heroManager.originalList();
            }
            else if (choice == 6)
            {
                System.out.println("Exiting");
                break;
            }
            else 
            {
                System.out.println("Invalid option. Please try again.");
            }
        }

        scanner.close();
    }
}