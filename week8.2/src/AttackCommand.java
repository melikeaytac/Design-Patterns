public class AttackCommand implements Command {
    private final GameCharacter character;

    AttackCommand(GameCharacter character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.attack();
    }
}