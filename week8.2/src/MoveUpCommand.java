public class MoveUpCommand implements Command {
    private final GameCharacter character;

    MoveUpCommand(GameCharacter character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.moveUp();
    }
}