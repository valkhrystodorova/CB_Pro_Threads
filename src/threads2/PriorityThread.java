package threads2;

public class PriorityThread extends Thread{
    private String name;
    public PriorityThread (String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(i + " " + name);
        }
    }
}
