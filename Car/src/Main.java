public class Main {
    public static void main(String[] args) {
        Car car = new Car("polo", 2010, 20.2, "red", 50, 190);
        car.getInfo();
        car.road("Магадан");
        car.powerCare();
        car.road("Магадан");
        car.stopCar();
        Car car2 = new Car("golf", 2012, 25, "silver", 65, 180);
        Track track = new Track(1000);
        Race.resultRace(car, car2, Race.race(car.getMaxSpeed(), track.getDistance()),
                Race.race(car2.getMaxSpeed(), track.getDistance()));
    }
}
