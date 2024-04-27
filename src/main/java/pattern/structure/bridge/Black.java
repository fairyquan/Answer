package pattern.structure.bridge;

public class Black implements IColor {

    @Override
    public void paint(String shape) {
        System.out.println("黑色的"+shape);
    }
}
