interface Command {
    void execute();
    void undo();
    String getName();
}
