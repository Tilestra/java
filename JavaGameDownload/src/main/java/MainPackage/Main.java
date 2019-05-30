package MainPackage;

import Web.Connector;
import Web.Processer;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Main {


    public static void main(String[] args) {
        /*try{
            Processer processer = new Processer();
            processer.CreateOutFolder();
            String text = processer.GetFileText(Connector.Connect());
            processer.WriteFileText(text, processer.FOLDER_PATH + "csc.minsk.by.html");
        }catch (Exception e){
            e.printStackTrace();
        }*/

        try {
            FileUtils.copyURLToFile(new URL("http://csc.minsk.by/BinocularVisionQuest/"), new File(new Processer().FOLDER_PATH + "csc.minsk.by.html"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
