package threads.task1.task1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = Arrays.asList(new Car("Audi"), new Car("Ford"));

        for (Car car : cars) {
            Thread thread = new Thread(() -> goStopCar(car));
            thread.start();
        }
    }

    public static void goStopCar(Car car) {
        System.out.println(Thread.currentThread().getName());
        car.goCar();
        car.stopCar();
    }
}
