import java.util.*;
public class Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BlueRayCollection collection = new BlueRayCollection();
        boolean retry = true;
        int userChoice;
        do {
            System.out.println("0. Quit");
            System.out.println("1. Add BlueRay to collection");
            System.out.println("2. See collection");

            userChoice = Integer.parseInt(scan.nextLine().strip());

            if (userChoice == 1){
                System.out.println("What is the title?");
                String title = scan.nextLine().strip();
                System.out.println("What is the director?");
                String director = scan.nextLine().strip();
                System.out.println("What is the year of release?");
                int release = Integer.parseInt(scan.nextLine().strip());
                System.out.println("What is the cost?");
                double cost = Double.parseDouble(scan.nextLine().strip());
                collection.add(title, director, release, cost);
            }
            else if (userChoice== 2){
                collection.show_all();
            }
            else{
                retry = false;
            }
        }
        while (retry);
        scan.close();
    }
}