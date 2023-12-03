package Lab8ObvserverPattern;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class Subscriber implements SubscriberUpdate {

    private String subsName;

    public String getSubsName() {
        return subsName;
    }

    public void setSubsName(String subsName) {
        this.subsName = subsName;
    }

    @Override
    public void updateSubscriber(String newsUpdate) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Hi "+ subsName + ", \nWe have a crucial update" +
                " to share with you – a breaking news report that demands your immediate attention. " +
                "\n\nDate and Time: "+ dtf.format(now) + "\nBreaking news: "+ newsUpdate +
                "\n\nStay tuned for updates as we unveil more details. Get ready to be " +
                "part of the excitement – you won't want to miss a thing!\n" +
                "\nBest regards,\nNews All Day\n");
    }
}
