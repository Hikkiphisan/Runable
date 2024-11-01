//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread is running...");
        Runable thread1 = new Runable(" Thread 1");
        Runable thread2 = new Runable("Thread 2");
        thread1.start();
        thread2.start();
        System.out.println("Main thread is over!!");

    }
}