package MultiTread.Classes;

import java.util.ArrayList;
import java.util.List;

public class University implements Runnable{

    private static final String START = " start ";
    private static final String END = " end ";
    private static final String IN = " in ";
    private static final String OUT = " out ";
    private static final String WAITING = " waiting ";

    private static final long TIME_TO_WAIT = 200;
    private static Boolean firstDoor;
    private static Boolean secondDoor;
    private Student student;

    private final Object security = new Object();

    public University(Boolean door1, Boolean door2, Student student){
        firstDoor = door1;
        secondDoor = door2;
        this.student = student;
    }

    private void ToOccupyDoor(Boolean door) throws InterruptedException{
        door = false;
        System.out.println(student.getName() + WAITING);
        Thread.sleep(TIME_TO_WAIT);
        door = true;
        throw new InterruptedException();
    }

    public void run() {
        System.out.println(student.getName() + START + (student.getInOrOut() ? IN : OUT));
        synchronized (security){
            try {
                if(!firstDoor){
                    while (!firstDoor)
                        if(!secondDoor)
                            Thread.sleep(TIME_TO_WAIT);
                        else
                            ToOccupyDoor(secondDoor);
                    ToOccupyDoor(firstDoor);
                }
                else
                    ToOccupyDoor(firstDoor);
            }catch (InterruptedException e) { }
        }
        System.out.println(student.getName() + END + (student.getInOrOut() ? IN : OUT));
    }

    public static void Task(List<Student> students){
        System.out.println();
        System.out.println();

        Boolean door1 = true,
                door2 = true;
        List<Thread> threads = new ArrayList<Thread>();

        for(Student student : students){
            Thread thread = new Thread(new University(door1, door2, student));
            thread.setName(student.getName());
            threads.add(thread);
            thread.start();
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
