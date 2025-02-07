public class GameController {
    private final Command[] commands = new Command[256];

    void setCommand(char key, Command command) {
        commands[key] = command;
    }

    void executeCommand(char key) {
        if (commands[key] != null) {
            commands[key].execute();
        } else {
            System.out.println("Invalid command.");
        }
    }
}
