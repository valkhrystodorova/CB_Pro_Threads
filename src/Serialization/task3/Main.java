package Serialization.task3;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Car.setMark("Audi");
        Car car = new Car("black", 2010);
        File file2  = new File("src/Serialization/task3/file2.txt");
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file2));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file2))){

            oos.writeObject(car);
            car = (Car) ois.readObject();
            System.out.println(car);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
