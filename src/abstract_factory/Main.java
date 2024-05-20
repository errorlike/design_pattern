package abstract_factory;

public class Main {
    public static void main(String[] args) {
        DoorFactory woodenFactory = new WoodenFactory();
        Door woodenDoor = woodenFactory.makeDoor();
        DoorFittingExpert woodenExpert = woodenFactory.makeFittingExpert();
        System.out.println(woodenDoor.getDescription());
        System.out.println(woodenExpert.getDescription());

        DoorFactory IronFactory = new IronDoorFactory();
        Door ironDoor = IronFactory.makeDoor();
        DoorFittingExpert ironExpert = IronFactory.makeFittingExpert();
        System.out.println(ironDoor.getDescription());
        System.out.println(ironExpert.getDescription());
    }

}
