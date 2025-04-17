public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
        car.getNumberOfSeats();

        System.out.println("======================");

        Lion lion = new Lion();
        lion.makeNoise();

        Cat cat = new Cat();
        cat.makeNoise();

        Wolf wolf = new Wolf();
        wolf.makeNoise();

        Dog dog = new Dog();
        dog.makeNoise();

        System.out.println("======================");

        Canine canine = new Canine();
        canine.roam();

        Feline feline = new Feline();
        feline.roam();
    }
}
