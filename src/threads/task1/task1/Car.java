package threads.task1.task1;

public class Car {
    private String mark;

    public Car(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void goCar() {
        System.out.println(mark + " go.");
    }

    public void stopCar() {
        System.out.println(mark + " stop.");
    }
}

