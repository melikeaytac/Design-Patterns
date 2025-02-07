import java.util.ArrayList;
import java.util.List;

class MacroCommand implements Command {
    private String name;
    private List<Command> commands;

    public MacroCommand(String name) {
        this.name = name;
        this.commands = new ArrayList<>();
    }

    @Override
    public void execute() {
        for (Command c:commands) {
            c.execute();
        }
    }

    @Override
    public void undo() {
        for (Command c:commands) {
            c.undo();
        }

    }
    @Override
    public String getName() {
        return name;
    }

    public void add(Command c){
        commands.add(c);
    }

}