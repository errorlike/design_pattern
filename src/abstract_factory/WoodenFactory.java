package abstract_factory;

public class WoodenFactory implements DoorFactory {

    @Override
    public Door makeDoor() {
        return new WoodenDoor();
    }

    @Override
    public DoorFittingExpert makeFittingExpert() {
        return new Carpenter();
    }

}
