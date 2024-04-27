package pattern.behavior.command;

public enum Button {
    ON(0),
    OFF(1),
    VOLUME_UP(2),
    VOLUME_DOWN(3);

    private final int index;
    Button(int index) {
        this.index=index;
    }

    public int getIndex() {
        return index;
    }
}
