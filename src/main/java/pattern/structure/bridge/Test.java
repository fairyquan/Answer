package pattern.structure.bridge;

public class Test {
    public static void main(String[] args) {
        // 白色
        IColor white = new White();
        // 正方形
        Shape square = new Square();
        // 白色的正方形
        square.setColor(white);
        square.draw();

        // 长方形
        Shape rectangle = new Rectangle();
        rectangle.setColor(white);
        rectangle.draw();

        //圆形
        Shape circle=new Circle();
        circle.setColor(new Black());
        circle.draw();
    }
}
