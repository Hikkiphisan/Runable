public class Runable implements Runnable{
    private Thread t;
    private String name;


    public Runable(String name) {
        this.name = name;
        System.out.println("name ia creating");
    }
    public void run() {

        try {
            System.out.println("SubThread " + name + " is running...");
            for (int i = 4; i > 0 ; i--) {
                Thread.sleep(40);
                System.out.println("Task" + name  + i);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void start() {
        if(t == null) {
            t = new Thread(this, name);
            t.start();
        }
    }


}

