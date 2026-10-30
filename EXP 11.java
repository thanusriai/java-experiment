
class Printer {
    synchronized void printDocument(String name) {
        System.out.println(name + " is printing...");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(name + " finished printing.");
    }
}

class UserThread extends Thread {
    Printer printer;

    UserThread(Printer p, String name) {
        super(name);
        printer = p;
    }

    public void run() {
        System.out.println(getName() + " started.");
        printer.printDocument(getName());
        System.out.println(getName() + " terminated.");
    }
}

public class Main {
    public static void main(String[] args)
            throws InterruptedException {

        Printer p = new Printer();

        UserThread t1 = new UserThread(p, "Thread-1");
        UserThread t2 = new UserThread(p, "Thread-2");

        System.out.println("State: " + t1.getState());

        t1.start();
        t2.start();

        Thread.sleep(200);

        System.out.println("Current State: " + t1.getState());

        t1.join();
        t2.join();

        System.out.println("Final State: " + t1.getState());

        System.out.println("Deadlock prevented using one lock.");
    }
}
