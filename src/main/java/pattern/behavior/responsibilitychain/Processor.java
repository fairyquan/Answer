package pattern.behavior.responsibilitychain;

interface Processor {
    boolean process(Product product,ProcessorChain chain);
}
