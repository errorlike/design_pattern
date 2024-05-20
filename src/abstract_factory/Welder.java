package abstract_factory;

public class Welder implements DoorFittingExpert {

    @Override
    public String getDescription() {
        return "我负责制作铁门";
    }
}
