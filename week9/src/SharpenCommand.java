public class SharpenCommand implements Command{
    Photo photo;
    int level;

    public SharpenCommand(Photo photo, int level) {
        this.photo = photo;
        this.level = level;
    }

    @Override
    public void execute() {
        photo.applyEffect("sharpen",level);
    }

    @Override
    public void undo() {
        photo.removeEffect("sharpen",level);
    }

    @Override
    public String getName() {
        return null;
    }
}
