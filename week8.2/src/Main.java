import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            GameCharacter character = new GameCharacter();
            GameController controller = new GameController();

            controller.setCommand('w', new MoveUpCommand(character));
            controller.setCommand('s', new MoveDownCommand(character));
            controller.setCommand('a', new MoveLeftCommand(character));
            controller.setCommand('d', new MoveRightCommand(character));
            controller.setCommand('j', new JumpCommand(character));
            controller.setCommand('k', new AttackCommand(character));

            System.out.println("Game Started! Commands: w, a, s, d, j, k, q (Quit)");
            while (true) {
                System.out.print("Select an action: ");
                char command = scanner.next().charAt(0);
                if (command == 'q') {
                    System.out.println("Do you want to quit ? y/n");
                    char command2 = scanner.next().charAt(0);
                    if (command2 == 'y'){
                        System.out.println("Game Over.");
                        break;
                    }
                    if (command2 == 'n'){
                        continue;
                    }
                }
                controller.executeCommand(command);
            }

            scanner.close();
        }
    }

