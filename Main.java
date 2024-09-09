import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        BlueRayCollection list = new BlueRayCollection();
        Scanner input = new Scanner(System.in);

        int terminate = 0;

        while(terminate == 0)
        {
            System.out.println("0. Quit" + "\n" +
                                "1. Add BlueRay to collection" + "\n" +
                                "2. See collection");

            int choice = input.nextInt();

            if(choice == 0)
            {
                terminate = 1;
            }
            else if(choice == 1)
            {
                input.nextLine();
                System.out.println("What is the title?");
                String title = input.nextLine();
                System.out.println("What is the director?");
                String director = input.nextLine();
                System.out.println("What is the year of release?");
                int year = input.nextInt();
                System.out.println("What is the cost?");
                double cost = input.nextDouble();

                list.add(title, director, year, cost);
            }
            else if(choice == 2)
            {
                list.show_all();
            }
        }

    }
}