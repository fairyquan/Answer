package pattern.structure.bridge;

class Circle extends Shape {
    @Override
    public void draw() {
        color.paint("圆形");
    }
}