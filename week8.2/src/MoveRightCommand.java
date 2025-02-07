public class MoveRightCommand implements Command {
    private final GameCharacter character;

    MoveRightCommand(GameCharacter character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.moveRight();
    }

}
