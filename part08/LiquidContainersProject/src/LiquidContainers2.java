import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Instantiate two independent container objects
        Container first = new Container();
        Container second = new Container();

        while (true) {
            // Printing the objects implicitly calls their toString() methods automatically!
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            System.out.print("> ");

            String input = scanner.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            // 1. ADD COMMAND
            if (command.equals("add")) {
                first.add(amount);
            }

            // 2. MOVE COMMAND
            if (command.equals("move")) {
                // Safeguard: Check what is actually available inside container one
                int actualAmountToMove = amount;
                if (actualAmountToMove > first.contains()) {
                    actualAmountToMove = first.contains();
                }
                
                first.remove(actualAmountToMove);
                second.add(actualAmountToMove);
            }

            // 3. REMOVE COMMAND
            if (command.equals("remove")) {
                second.remove(amount);
            }

            System.out.println(); // Prints spacing line to keep console readable
        }
    }
}
