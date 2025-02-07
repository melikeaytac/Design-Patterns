public class ContrastCommand implements Command{

    Photo photo;
    int level;

    public ContrastCommand(Photo photo, int level) {
        this.photo = photo;
        this.level = level;
    }


    @Override
    public void execute() {
        photo.applyEffect("contrast",level);
    }

    @Override
    public void undo() {
        photo.removeEffect("contrast",level);
    }

    @Override
    public String getName() {
        return null;
    }
}
