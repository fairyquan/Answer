package pattern.behavior.responsibilitychain;

public class HeightCheckProcessor implements Processor{
    @Override
    public boolean process(Product product, ProcessorChain chain) {
        int height = product.getHeight();
        if (height<40 && height>20){
            System.out.println("产品高度检验通过");
            return chain.process(product,chain);
        }
        System.out.println("产品高度检验未通过");
        return false;
    }
}
