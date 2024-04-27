package pattern.behavior.responsibilitychain;

public class Test {
    public static void main(String[] args) {
        int[][] arrays={{60,40,30},{40,35,25},{55,60,30},{70,45,50},{10,10,10}};
        for (int[] array:arrays){
            ProcessorChain processorChain=new ProcessorChain();
            processorChain.addProcessor(new LengthCheckProcessor());
            processorChain.addProcessor(new WidthCheckProcessor());
            processorChain.addProcessor(new HeightCheckProcessor());
            Product product=new Product(array[0],array[1],array[2]);
            boolean pass = processorChain.process(product, processorChain);

            if (pass){
                System.out.println("产品最终检验合格！");
            }else{
                System.out.println("产品最终检验不合格！");
            }
            System.out.println("------------------------------");
        }
    }
}
