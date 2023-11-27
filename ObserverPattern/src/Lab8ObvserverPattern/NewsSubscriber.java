package Lab8ObvserverPattern;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class NewsSubscriber implements Subscriber {
    private final String name;

    public NewsSubscriber(String name) {
        this.name = name;
    }
    @Override
    public void NewsUpdate(String news) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Hi "+ name + ", \nWe have a crucial update" +
                " to share with you – a breaking news report that demands your immediate attention. " +
                "\n\nDate and Time: "+ dtf.format(now) + "\nBreaking news: "+ news +
                "\n\nStay tuned for updates as we unveil more details. Get ready to be " +
                "part of the excitement – you won't want to miss a thing!\n" +
                "\nBest regards,\nNews All Day\n");
    }
}
