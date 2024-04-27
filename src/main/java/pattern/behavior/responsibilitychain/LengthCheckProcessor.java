package pattern.behavior.responsibilitychain;

public class LengthCheckProcessor implements Processor{
    @Override
    public boolean process(Product product, ProcessorChain chain) {
        int length = product.getLength();
        if (length<100 && length>50){
            System.out.println("产品长度检验通过");
            return chain.process(product,chain);
        }
        System.out.println("产品长度检验未通过");
        return false;
    }
}
