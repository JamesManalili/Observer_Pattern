package Lab8ObvserverPattern;

public class NewsApp {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        Subscriber subscriber1 = new NewsSubscriber("James");
        Subscriber subscriber2 = new NewsSubscriber("Manalili");

        newsAgency.subscribe(subscriber1);
        newsAgency.subscribe(subscriber2);

        newsAgency.publishNews("Chinese fighter jets 'orbit' Philippine aircraft" +
                " during PH-Australia \n" + "joint patrol. \n\nTwo Chinese fighter " +
                "jets were monitored \"orbiting\" a Philippine aircraft participating \n" +
                "in patrols with Australia in the West Philippine Sea but did not cause any untoward" +
                "\nincident, the Armed Forces of the Philippines said on Sunday.");

        newsAgency.unsubscribe(subscriber1);
        newsAgency.publishNews("Diesel and kerosene prices up Tuesday, gasoline unchanged" +
                "\n\nMotorists will have to pay more for diesel and kerosene starting Tuesday," +
                "\nas firms announced a price hike following four straight weeks of cuts. " +
                "\nGasoline prices will be unchanged.");
    }
}
