package pattern.creation.factory;

/**
 * 生产ProductB的具体工厂
 */
class ProductBFactory implements IFactory {

    @Override
    public IProduct createProduct() {
        return new ProductB();
    }
}