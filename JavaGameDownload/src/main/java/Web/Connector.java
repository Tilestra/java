package Web;

import java.net.MalformedURLException;
import java.net.URL;

public class Connector {

    private static final String WEB_SITE = "https://csc.minsk.by";

    public static URL Connect() throws MalformedURLException{
        return new URL(WEB_SITE);
    }

}
