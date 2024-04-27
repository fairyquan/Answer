package pattern.creation.abstractfactory;

/**
 * 抽象工厂
 */
interface AbstractFactory {
    IPhone createPhone();
    ILaptop createLaptop();
}