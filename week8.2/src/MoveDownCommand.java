public class MoveDownCommand implements Command {
    private final GameCharacter character;

    MoveDownCommand(GameCharacter character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.moveDown();
    }
}