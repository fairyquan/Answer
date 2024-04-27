package pattern.structure.bridge;

public class White implements IColor {

    @Override
    public void paint(String shape) {
        System.out.println("白色的"+shape);
    }
}
