package Lab8ObvserverPattern;

public interface NewsCommand {
    public void subscribe(Subscriber subscriber);
    public void unsubscribe(Subscriber subscriber);
    public void notifySubscribers(String news);
}
