package factory_method;

public class Main {
    public static void main(String[] args) {
        var devManager = new DevelopmentManager();
        devManager.takeInterview();

        var behaviourManager = new BehaviourManager();
        behaviourManager.takeInterview();

    }
}
