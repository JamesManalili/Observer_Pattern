package Lab8ObvserverPattern;

public class NewsApp {
    public static void main(String[] args) {
        Subscriber James = new Subscriber();
        James.setSubsName("James");

        Subscriber Manalili = new Subscriber();
        Manalili.setSubsName("Manalili");

        NewsAgency newsAgency = new NewsAgency();
        newsAgency.subscribe(Manalili);
        newsAgency.subscribe(James);
        newsAgency.publishNews("Chinese fighter jets 'orbit' Philippine aircraft" +
                " during PH-Australia \n" + "joint patrol. \n\nTwo Chinese fighter " +
                "jets were monitored \"orbiting\" a Philippine aircraft participating \n" +
                "in patrols with Australia in the West Philippine Sea but did not cause any untoward" +
                "\nincident, the Armed Forces of the Philippines said on Sunday.");

        newsAgency.unsubscribe(James);
        newsAgency.publishNews("Diesel and kerosene prices up Tuesday, gasoline unchanged" +
                "\n\nMotorists will have to pay more for diesel and kerosene starting Tuesday," +
                "\nas firms announced a price hike following four straight weeks of cuts. " +
                "\nGasoline prices will be unchanged.");
    }
}
