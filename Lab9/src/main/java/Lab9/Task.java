package Lab9;

import rx.Observable;
import rx.subjects.BehaviorSubject;
import rx.subjects.PublishSubject;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Task {

    public static void ExecuteTasks(){
        RxJava rxJavaTask = new RxJava();
        rxJavaTask.FirstTask();
        rxJavaTask.SecondTask();
        rxJavaTask.ThirdTask();

        WebProgramming webProgramming = new WebProgramming();
        webProgramming.FirstTask();
    }

    private static void PassSomeSpace(){
        WriteLine("__________________");
        WriteLine("\n\n");
    }

    private static void WriteLine(Object obj){
        System.out.println(obj);
    }

    public static class RxJava{

        public void FirstTask(){
            // Same as ReplaySubject, but keeps only one value
            BehaviorSubject<Integer> A = BehaviorSubject.create(10);
            BehaviorSubject<Integer> B = BehaviorSubject.create(10);

            // Observable - base class. PublishSubject - simplest subject implementation
            Observable<Integer> C = PublishSubject.combineLatest(A, B, (a, b) -> a + b);
            C.subscribe(Task::WriteLine);
            B.onNext(20);
            A.onNext(20);

            PassSomeSpace();
        }

        public void SecondTask(){
            BehaviorSubject<Integer> C = BehaviorSubject.create(10);
            C.subscribe(Task::WriteLine);
            Observable<Integer> newC = C.map((i) -> (int)Math.pow(i, 2));
            newC.subscribe(Task::WriteLine);

            PassSomeSpace();
        }

        public void ThirdTask(){
            BehaviorSubject<Integer> A = BehaviorSubject.create(1);
            BehaviorSubject<Integer> B = BehaviorSubject.create(1);

            Observable<Integer> C = PublishSubject.combineLatest(A, B, (a, b) -> a + b);
            C.subscribe(Task::WriteLine);
            B.onNext(B.getValue() + 1);

            WriteLine("Filtering...");

            Observable<Integer> filtered = B.filter((i) -> i % 2 == 0);
            filtered.subscribe(Task::WriteLine);

            PassSomeSpace();
        }
    }


    public static class WebProgramming{

        public void FirstTask(){
            URL github = null;
            String urlName = "https://github.com";

            try {
                github = new URL(urlName);
                if (github == null) {
                    throw new RuntimeException();
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }


            StringBuilder markup = new StringBuilder();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(github.openStream()))){
                String line;
                while ((line = reader.readLine()) != null) {
                    markup.append(line);
                    markup.append('\n');
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try(FileWriter writer = new FileWriter("github.html")){
                writer.write(markup.toString());
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
