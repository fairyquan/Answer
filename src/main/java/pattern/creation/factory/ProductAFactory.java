package pattern.creation.factory;

/**
 * 生产ProductA的具体工厂
 */
class ProductAFactory implements IFactory {

    @Override
    public IProduct createProduct() {
        return new ProductA();
    }
}