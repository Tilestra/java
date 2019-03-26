package com.company.classes;

import org.testing.annotation.Test;

public class LogTest {

    private static final Logger log = Logger.getLogger(BookProto.class.toString());
    private static FileHandler fhandler;
    private static final String FILE_NAME = "D:\\university\\2 curse\\ооп2\\Java-labs\\lab3_4\\lib\\logger.log";

    public static Logger getLog(){
        return log;
    }

    private static void ConfigLog() throws Exception{
        log.setLevel(Level.FINEST);
        fhandler = new FileHandler(FILE_NAME);
        log.addHandler(fhandler);

        SimpleFormatter formatter = new SimpleFormatter();
        fhandler.setFormatter(formatter);
        ConsoleHandler chandler = new ConsoleHandler();
        chandler.setLevel(Level.FINEST);
        log.addHandler(chandler);
    }

    static {
        try{
            ConfigLog();
            log.fine("Alright");
        }catch (Exception exc){
            log.warning(exc.getMessage());
        }

    }
}
