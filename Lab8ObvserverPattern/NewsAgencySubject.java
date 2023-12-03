package Lab8ObvserverPattern;

public interface NewsAgencySubject {
    public void subscribe(Subscriber subscriberUpdate);
    public void unsubscribe(Subscriber subscriberUpdate);
    public void notifySubscribe(String update);
}
