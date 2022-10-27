import java.util.Date;

public class Logger {
    protected int num = 1;
    private static Logger logger;
    private static Logger instance;
    Date date=new Date();

    public void log(String msg) {
        System.out.println("[ "+date.toString()+" " + num++ + " ] " + msg);
    }

    private Logger() {

    }
    public static Logger getInstance() {
        if (instance==null){
            instance=new Logger();
        }
        return instance;
    }
}
