import java.util.Scanner;

public class TextAdventureGame {

    public static void main(String[] args) {
        startGame();
    }

    public static void startGame() {
        System.out.println("Welcome to the Text Adventure Game!");
        System.out.println("You find yourself in a mysterious forest.");

        // Initial decision point
        System.out.println("1. Go deeper into the forest.");
        System.out.println("2. Climb a tree to get a better view.");

        int choice = getUserChoice(2);

        if (choice == 1) {
            exploreForest();
        } else {
            climbTree();
        }
    }

    public static void exploreForest() {
        System.out.println("As you venture deeper into the forest, you encounter a magical creature.");

        // Decision point
        System.out.println("1. Try to communicate with the creature.");
        System.out.println("2. Back away slowly.");

        int choice = getUserChoice(2);

        if (choice == 1) {
            communicateWithCreature();
        } else {
            System.out.println("You successfully back away and continue exploring.");
            endGame();
        }
    }

    public static void climbTree() {
        System.out.println("From the top of the tree, you spot a hidden path.");

        // Decision point
        System.out.println("1. Follow the hidden path.");
        System.out.println("2. Stay in the tree and observe.");

        int choice = getUserChoice(2);

        if (choice == 1) {
            followHiddenPath();
        } else {
            System.out.println("You spend some time observing, but nothing interesting happens.");
            endGame();
        }
    }

    public static void communicateWithCreature() {
        System.out.println("The creature responds in a friendly manner and offers you a magical artifact.");

        // Decision point
        System.out.println("1. Accept the artifact.");
        System.out.println("2. Decline the offer.");

        int choice = getUserChoice(2);

        if (choice == 1) {
            System.out.println("You accept the artifact and gain magical powers. Congratulations, you won!");
        } else {
            System.out.println("You decline the offer, and the creature disappears. You continue your journey.");
            endGame();
        }
    }

    public static void followHiddenPath() {
        System.out.println("You follow the hidden path and discover a treasure chest.");

        // Decision point
        System.out.println("1. Open the treasure chest.");
        System.out.println("2. Leave the treasure chest alone.");

        int choice = getUserChoice(2);

        if (choice == 1) {
            System.out.println("You open the chest and find valuable treasures. Congratulations, you won!");
        } else {
            System.out.println("You decide to leave the treasure chest alone and continue exploring.");
            endGame();
        }
    }

    public static void endGame() {
        System.out.println("Thanks for playing the Text Adventure Game!");
        System.exit(0);
    }

    public static int getUserChoice(int maxChoice) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter your choice (1-" + maxChoice + "): ");
                choice = Integer.parseInt(scanner.nextLine());

                if (choice >= 1 && choice <= maxChoice) {
                    validInput = true;
                } else {
                    System.out.println("Invalid input. Please enter a number between 1 and " + maxChoice + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }

        return choice;
    }
}
