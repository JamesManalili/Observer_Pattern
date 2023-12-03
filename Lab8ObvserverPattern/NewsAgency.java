package Lab8ObvserverPattern;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements NewsAgencySubject{

    private List<Subscriber> subscriberList = new ArrayList<>();

    public void publishNews(String news) {

        System.out.println("NEWS ALL DAY \nBreaking news today: " + news );
        System.out.println("****************************************************************************************************************************\n");

        notifySubscribe(news);
    }

    @Override
    public void subscribe(Subscriber subscriberUpdate) {
        subscriberList.add(subscriberUpdate);
    }

    @Override
    public void unsubscribe(Subscriber subscriberUpdate) {
        subscriberList.remove(subscriberUpdate);
    }

    @Override
    public void notifySubscribe(String news) {
        for(Subscriber subscriberUpdate : subscriberList) {
            subscriberUpdate.updateSubscriber(news);
            if (subscriberList.size() > 1) {
                System.out.println("----------------------------------------------------------------------------------------------------------------------------\n");
            }
        }
    }
}
