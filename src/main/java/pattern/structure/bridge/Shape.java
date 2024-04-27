package pattern.structure.bridge;

public abstract class Shape {
    IColor color;

    public void setColor(IColor color) {
        this.color = color;
    }

    public abstract void draw();
}
