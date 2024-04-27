package pattern.structure.composite.transparent;

import java.util.ArrayList;
import java.util.List;

class Composite extends Component{
    private List<Component> mComponents;
    public Composite(String name){
        super(name);
        this.mComponents=new ArrayList<>();
    }
    @Override
    public String operation() {
        StringBuilder builder=new StringBuilder(this.name);
        for (Component component: this.mComponents){
            builder.append("\n");
            builder.append(component.operation());
        }
        return builder.toString();
    }

    @Override
    public boolean addChild(Component component) {
        return this.mComponents.add(component);
    }

    @Override
    public boolean removeChild(Component component) {
        return this.mComponents.remove(component);
    }

    @Override
    public Component getChild(int index) {
        return this.mComponents.get(index);
    }
}
