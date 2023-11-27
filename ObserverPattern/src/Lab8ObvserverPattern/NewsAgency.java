package Lab8ObvserverPattern;
import java.util.ArrayList;
import java.util.List;
public class NewsAgency implements NewsCommand{
    private List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.NewsUpdate(news);
            if(subscribers.size()>1) {
                System.out.println("----------------------------------------------------------------------------------------------------------------------------\n");
            }
        }
    }
    public void publishNews(String news) {
        System.out.println("NEWS ALL DAY \nBreaking news today: " + news );
        System.out.println("****************************************************************************************************************************\n");

        notifySubscribers(news);
    }
}

