package pattern.behavior.responsibilitychain;

import java.util.ArrayList;
import java.util.List;

public class ProcessorChain implements Processor{
    private List<Processor> processorList=new ArrayList<>();
    private int index=0;
    public ProcessorChain addProcessor(Processor processor){
        processorList.add(processor);
        return this;
    }
    @Override
    public boolean process(Product product, ProcessorChain chain) {
        if (index==processorList.size()){
            return true;
        }
        Processor processor=processorList.get(index);
        index++;
        return processor.process(product,chain);
    }
}
