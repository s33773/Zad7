public class Car extends Vehicle {
    private int numberOfSeats;

    public void getNumberOfSeats() {
        System.out.println("Number of Seats in Car: " + numberOfSeats);
    }

    @Override
    public void start() {
        super.start();
    }

    @Override
    public void stop() {
        super.stop();
    }
}
