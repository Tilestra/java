package Web;

import java.io.*;
import java.net.URL;

public class Processer {

    public final String FOLDER_PATH = "D:\\university\\2 curse\\oop java\\Java-labs\\JavaGameDownload\\Game\\";

    public void CreateOutFolder() throws Exception{
        File file = new File(FOLDER_PATH);
        if(file.mkdir()) {
            System.out.println("Game Directory Created");
        }else{
            System.out.println("The same directory already exist");
        }
    }

    public String GetFileText(URL path) throws IOException{
        StringBuilder text = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(path.openStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                text.append(line);
                text.append('\n');
            }
        }
        return text.toString();
    }

    public void WriteFileText(String text, String path) throws IOException{
        try(FileWriter writer = new FileWriter(path)) {
            writer.write(text);
            System.out.println("Wrote new file - " + new File(path).getName());
        }
    }
}
