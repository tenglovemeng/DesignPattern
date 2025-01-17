package ObserverPattern;

public class CurrentConditionDisplay implements Observer,DisplayElement {
    private float temperture;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+temperture + "F degrees and "+humidity+"% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperture = temp;
        this.humidity = humidity;
        display();
    }
}
