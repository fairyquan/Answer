package pattern.structure.bridge;

class Rectangle extends Shape {
    @Override
    public void draw() {
        color.paint("长方形");
    }
}