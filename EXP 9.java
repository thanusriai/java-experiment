class ReservationThread extends Thread {

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Ticket Reservation = " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Reservation Thread Interrupted");
        }
    }
}

class StatusThread implements Runnable {

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Ticket Confirmation = " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Status Thread Interrupted");
        }
    }
}

public class Main {

    public static void main(String[] args) {

        // Creating thread using Thread class
        ReservationThread reservation = new ReservationThread();

        // Creating thread using Runnable interface
        StatusThread status = new StatusThread();
        Thread confirmation = new Thread(status);

        // Starting both threads
        reservation.start();
        confirmation.start();
    }
}