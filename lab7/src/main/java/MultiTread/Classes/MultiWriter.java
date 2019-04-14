package MultiTread.Classes;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MultiWriter implements Runnable {

    private static final String PATH = "D:\\university\\2 curse\\ооп2\\Java-labs\\lab7\\MultiWriter.txt";
    private static final String WRITER = "Writer ";
    private static final String START = " Starts to write";
    private static final String END = " Ends to write";

    private static FileWriter writer;
    private final Object security = new Object();

    public MultiWriter(FileWriter writer){
        this.writer = writer;
    }

    public void run(){
        System.out.println(Thread.currentThread().getName() + START);
        try{
            writer.write(Thread.currentThread().getName() + '\n');
        }catch (IOException e){
            System.out.println(Thread.currentThread().getName() + ": " + e.getMessage());
        }
        System.out.println(Thread.currentThread().getName() + END);
    }

    public static void Task(int count){
        System.out.println();
        System.out.println();
        try(FileWriter writer = new FileWriter(PATH)){
            List<Thread> threads = new ArrayList<Thread>();
            for (int i = 0; i < count; i++){
                Thread thread = new Thread(new MultiWriter(writer));
                thread.setName(WRITER + i);
                threads.add(thread);
                thread.start();
            }

            for (Thread thread : threads){
                thread.join();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
