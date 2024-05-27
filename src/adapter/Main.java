package adapter;

public class Main {
    public static void main(String[] args) {
        WildDog wildDog = new WildDog();
        Lion wildDogAdapter = new WildDogAdapter(wildDog);
        new Hunter().hunt(wildDogAdapter);
    }
}
