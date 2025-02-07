public class BlurCommand implements Command{

    private Photo photo;
    private int level;

    public BlurCommand(Photo photo, int level) {
        this.photo = photo;
        this.level = level;
    }

    @Override
    public void execute() {
        photo.applyEffect("blur",level);
    }

    @Override
    public void undo() {
        photo.removeEffect("blur",level);
    }

    @Override
    public String getName() {
        return null;
    }
}
