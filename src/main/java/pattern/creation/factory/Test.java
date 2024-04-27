package pattern.creation.factory;

public class Test {
    public static void main(String[] args) {
        IProduct productA = new ProductAFactory().createProduct();
        productA.doSomething();

        IProduct productB = new ProductBFactory().createProduct();
        productB.doSomething();
    }
}
