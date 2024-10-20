package menu;

import java.util.Scanner;

public class MainMenu {
    Scanner input = new Scanner(System.in);

    public void showMainMenu(){

        System.out.println("\n--- Main Menu ---");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");

        int choice = input.nextInt();
        input.nextLine();

    }

    // function to login in as a client
    public void loginAsClient(){
        

    }


    // Method to login in as a manager
    public void loginAsManager(){

    }

}
