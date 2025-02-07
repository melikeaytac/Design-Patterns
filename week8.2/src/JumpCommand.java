public class JumpCommand implements Command {
    private final GameCharacter character;

    JumpCommand(GameCharacter character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.jump();
    }
}
