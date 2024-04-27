package pattern.structure.bridge;

public class Gray implements IColor {

    @Override
    public void paint(String shape) {
        System.out.println("灰色的"+shape);
    }
}
