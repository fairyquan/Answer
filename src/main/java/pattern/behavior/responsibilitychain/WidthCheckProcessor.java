package pattern.behavior.responsibilitychain;

public class WidthCheckProcessor implements Processor{
    @Override
    public boolean process(Product product, ProcessorChain chain) {
        int width = product.getWidth();
        if (width<50 && width>30){
            System.out.println("产品宽度检验通过");
            return chain.process(product,chain);
        }
        System.out.println("产品宽度检验未通过");
        return false;
    }
}
