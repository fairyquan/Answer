package pattern.behavior.template;

public class PureSoybeanMilk extends SoybeanMilk{
    @Override
    void addCondiment() {

    }

    @Override
    boolean customerWantAddCondiment() {
        return false;
    }
}
