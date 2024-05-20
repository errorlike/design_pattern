package abstract_factory;

public class Carpenter implements DoorFittingExpert {

    @Override
    public String getDescription() {
        return "我能够制作木头门";
    }

}
