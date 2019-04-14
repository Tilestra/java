package MultiTread.Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Restaurant implements Runnable {

    private static Semaphore security;

    private static final int TIME_TO_CHILL = 400;
    private static final int TIME_TO_WAIT = 200;
    private static final String WANTS_TO_TAKE_PLACE = " wants to take place";
    private static final String GOES_OUT = " goes out";
    private static final String CHILLS = " chills";
    private static final String WAITING = " waiting";
    private static final String PERSON = "Person";

    private static int maxPersonsCount = 0;
    private static int persons = 0;


    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + WANTS_TO_TAKE_PLACE);

            while (true) {
                if (persons < maxPersonsCount) {
                    security.acquire();
                    persons++;

                    System.out.println(Thread.currentThread().getName() + CHILLS);
                    Thread.sleep(TIME_TO_CHILL);

                    security.release();
                    persons--;
                    break;
                }else {
                    System.out.println(Thread.currentThread().getName() + WAITING);
                    Thread.sleep(TIME_TO_WAIT);
                }
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println(Thread.currentThread().getName() + GOES_OUT);
        }
    }

    public static void Task(int tablesCount, int personsCount){
        System.out.println();
        System.out.println();

        maxPersonsCount = tablesCount * 2;
        int places = tablesCount * 2;

        security = new Semaphore(places);
        List<Thread> threads = new ArrayList<Thread>();

        for (int i = 0; i < personsCount; i++){
            Thread person = new Thread(new Restaurant());
            person.setName(PERSON + i);
            threads.add(person);
            person.start();
        }

        try {
            for (Thread thread : threads){
                thread.join();
            }
        }catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
