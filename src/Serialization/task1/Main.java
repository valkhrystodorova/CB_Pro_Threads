package Serialization.task1;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("src/Serialization/task1/file1.txt");
        Animal animal1 = new Animal("cat", 2, "black");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file1));
             ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file1))) {
            oos.writeObject(animal1);

            Animal animal2 = (Animal) ois.readObject();
            System.out.println(animal2);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
