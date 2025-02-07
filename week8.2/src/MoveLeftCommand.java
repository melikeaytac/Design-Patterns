public class MoveLeftCommand implements Command {
    private final GameCharacter character;

    MoveLeftCommand(GameCharacter character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.moveLeft();
    }
}
