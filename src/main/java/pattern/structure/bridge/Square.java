package pattern.structure.bridge;

class Square extends Shape {
    @Override
    public void draw() {
        color.paint("正方形");
    }
}