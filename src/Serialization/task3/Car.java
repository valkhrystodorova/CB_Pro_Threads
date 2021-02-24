package Serialization.task3;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Car implements Externalizable {
    private String color;
    private int year;
    private static String mark;

    public Car(String color, int year) {
        this.color = color;
        this.year = year;
    }

    public Car() {
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public static String getMark() {
        return mark;
    }

    public static void setMark(String mark) {
        Car.mark = mark;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(color);
        out.writeInt(year);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        color = (String) in.readObject();
        year = in.readInt();
    }
}
